package ja.questionnaire.action;

import java.util.List;

import javax.annotation.Resource;

import ja.questionnaire.domain.model.question.Questionnaire;
import org.seasar.struts.annotation.Execute;
import ja.questionnaire.service.QuestionnareService;

public class IndexAction {

    @Resource
    QuestionnareService questionnareService;

    public List<Questionnaire> questionnaires;

    @Execute(validator = false)
    public String index() {
    	questionnaires = questionnareService.findAll().list();
        return "index.jsp";
    }
}
