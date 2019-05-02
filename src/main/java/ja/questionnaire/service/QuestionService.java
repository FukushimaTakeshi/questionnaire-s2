package ja.questionnaire.service;

import ja.questionnaire.domain.model.question.Question;
import ja.questionnaire.domain.model.question.Questions;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.BeanMap;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class QuestionService {
    @Resource
    JdbcManager jdbcManager;

    public Questions findAll(final String id) {
        final List<BeanMap> results =
        		jdbcManager.selectBySqlFile(BeanMap.class, "sqls/questionByQuestionnaire.sql", id).getResultList();

        List<Question> list = new ArrayList<>();
        for (final BeanMap result : results) {
            list.add(new Question(
                    result.get("questionId").toString(),
                    result.get("questionType").toString(),
                    result.get("questionContent").toString(),
                    details(result.get("questionId").toString())));
        }
        return new Questions(list);
    }

    private List<BeanMap> details(final String id) {
        return jdbcManager.selectBySqlFile(BeanMap.class, "sqls/questionDetailByQuestionId.sql", id).getResultList();
    }
}
