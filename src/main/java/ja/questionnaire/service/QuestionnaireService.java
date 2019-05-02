package ja.questionnaire.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import ja.questionnaire.domain.model.question.Questionnaires;
import ja.questionnaire.domain.model.question.Questionnaire;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.BeanMap;

public class QuestionnareService {
    @Resource
    JdbcManager jdbcManager;

    public Questionnaires findAll() {
        final String sql = "select * from questionnaire";
        final List<BeanMap> results =  jdbcManager.selectBySql(BeanMap.class, sql).getResultList();

		List<Questionnaire> list = new ArrayList<>();
		for (final BeanMap result : results) {
			list.add(new Questionnaire(result.get("questionnaireId").toString(), result.get("name").toString()));
		}
		return new Questionnaires(list);
    }
}
