package ja.questionnaire.service;

import ja.questionnaire.domain.model.question.Answer;
import ja.questionnaire.domain.model.question.Question;
import ja.questionnaire.domain.model.question.QuestionsAndAnswers;
import ja.questionnaire.entity.AnswerContent;
import ja.questionnaire.entity.AnswerContentRadio;
import ja.questionnaire.entity.AnswerContentText;
import ja.questionnaire.entity.AnswerUser;
import org.seasar.extension.jdbc.JdbcManager;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AnswerService {
    @Resource
    JdbcManager jdbcManager;

    public void create(String questionnaireId, QuestionsAndAnswers questionsAndAnswers) {
        AnswerUser answerUser = new AnswerUser();
        answerUser.questionnaireId = Long.parseLong(questionnaireId);
        answerUser.name = questionsAndAnswers.userName();
        answerUser.answeredAt = new Timestamp(new Date().getTime());
        jdbcManager.insert(answerUser).execute();

        for(Map.Entry<Question, Answer> questionAnswerEntry : questionsAndAnswers.questionsAndAnswers().entrySet()) {
            AnswerContent answerContent = new AnswerContent();
            answerContent.answerUserId = answerUser.answerUserId;
            answerContent.questionId = Long.parseLong(questionAnswerEntry.getKey().getId());
            jdbcManager.insert(answerContent).execute();

            DetailSelector detail = AnswerDetailFactory.detailBy(questionAnswerEntry.getKey().getType());
            detail.create(jdbcManager, answerContent.answerContentId, questionAnswerEntry.getValue().toString());
        }
    }

    interface DetailSelector {
       void create(JdbcManager jdbcManager, Long answerContentId, String detailContent);
    }

    static class TextDetail implements DetailSelector {
        @Override
        public void create(JdbcManager jdbcManager,Long answerContentId, String detailContent) {
            AnswerContentText answerContentText = new AnswerContentText();
            answerContentText.answerContentId = answerContentId;
            answerContentText.answerContentAnswerContentId = detailContent;
            jdbcManager.insert(answerContentText).execute();
        }
    }

    static class RadioDetail implements DetailSelector {
        @Override
        public void create(JdbcManager jdbcManager,Long answerContentId, String detailContent) {
            AnswerContentRadio answerContentRadio = new AnswerContentRadio();
            answerContentRadio.answerContentId = answerContentId;
            answerContentRadio.questionDetailId = Long.parseLong(detailContent);
            jdbcManager.insert(answerContentRadio).execute();
        }
    }

    static class AnswerDetailFactory {
        private static Map<String, DetailSelector> types;

        static {
            types = new HashMap<>();
            types.put("0001", new TextDetail());
            types.put("0002", new RadioDetail());
        }

        static DetailSelector detailBy(String type) {
            return types.get(type);
        }

        AnswerDetailFactory() {}
    }
}
