package ja.questionnaire.service;

import ja.questionnaire.domain.model.question.Question;
import ja.questionnaire.domain.model.question.Questions;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.BeanMap;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionService {
    @Resource
    JdbcManager jdbcManager;

    public Questions findAll(final String id) {
        final List<BeanMap> questions =
        		jdbcManager.selectBySqlFile(BeanMap.class, "sqls/questionByQuestionnaire.sql", id).getResultList();

        List<BeanMap> questionDetails = findDetails(questions);

        List<Question> list = new ArrayList<>();
        for (final BeanMap question : questions) {
            list.add(new Question(
            		question.get("questionId").toString(),
            		question.get("questionType").toString(),
            		question.get("questionContent").toString(),
                    collectDetails(questionDetails, Long.parseLong(question.get("questionId").toString()))));
        }
        return new Questions(list);
    }

    private List<BeanMap> findDetails(List<BeanMap> questions) {
        Map<String, List<Long>> questionIds = new HashMap<>();
        questionIds.put("questionIds", questionIds(questions));
        return jdbcManager.selectBySqlFile(BeanMap.class, "sqls/questionDetailByQuestionId.sql", questionIds).getResultList();
    }

    private List<Long> questionIds(List<BeanMap> questions) {
        List<Long> questionIds = new ArrayList<>();
        for (final BeanMap question : questions) {
            questionIds.add(Long.parseLong(question.get("questionId").toString()));
        }
        return questionIds;
    }

    private List<BeanMap> collectDetails(final List<BeanMap> details, final Long questionId) {
        List<BeanMap> collectedDetails = new ArrayList<>();
        for (final BeanMap detail : details) {
            if (detail.get("questionId").equals(questionId)) {
            	collectedDetails.add(detail);
            }
        }
        return collectedDetails;
    }
}
