package ja.questionnaire.service;

import ja.questionnaire.domain.model.question.Answer;
import ja.questionnaire.domain.model.question.Question;
import ja.questionnaire.domain.model.question.QuestionsAndAnswers;
import ja.questionnaire.entity.AnswerContent;
import ja.questionnaire.entity.AnswerContentRadio;
import ja.questionnaire.entity.AnswerContentText;
import ja.questionnaire.entity.AnswerUser;
import ja.questionnaire.service.factory.AnswerDetailFactory;
import org.seasar.extension.jdbc.JdbcManager;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
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

            DetailSelector detail = AnswerDetailFactory.detailByType(questionAnswerEntry.getKey().getType());
            detail.createDetail(jdbcManager, answerContent.answerContentId, questionAnswerEntry.getValue().toString());
        }
    }

    public interface DetailSelector {
       void createDetail(JdbcManager jdbcManager, Long answerContentId, String detailContent);
    }

    public static class TextDetail implements DetailSelector {
        @Override
        public void createDetail(JdbcManager jdbcManager,Long answerContentId, String detailContent) {
            AnswerContentText answerContentText = new AnswerContentText();
            answerContentText.answerContentId = answerContentId;
            answerContentText.answerContentAnswerContentId = detailContent;
            jdbcManager.insert(answerContentText).execute();
        }
    }

    public static class RadioDetail implements DetailSelector {
        @Override
        public void createDetail(JdbcManager jdbcManager,Long answerContentId, String detailContent) {
            AnswerContentRadio answerContentRadio = new AnswerContentRadio();
            answerContentRadio.answerContentId = answerContentId;
            answerContentRadio.questionDetailId = Long.parseLong(detailContent);
            jdbcManager.insert(answerContentRadio).execute();
        }
    }
}
