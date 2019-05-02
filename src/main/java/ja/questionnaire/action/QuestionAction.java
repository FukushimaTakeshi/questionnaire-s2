package ja.questionnaire.action;

import ja.questionnaire.domain.model.question.Answer;
import ja.questionnaire.domain.model.question.Question;
import ja.questionnaire.form.QuestionForm;
import ja.questionnaire.service.QuestionService;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import java.util.List;

import javax.annotation.Resource;

public class QuestionAction {

    @ActionForm
    @Resource(name = "questionForm")
    public QuestionForm form;

    @Resource
    QuestionService questionService;

    public List<Question> questions;

    @Execute(validator = false)
    public String input() {
    	questions = questionService.findAll(form.questionnaireId).list();
        return "input.jsp";
    }

    @Execute(validator = true, input = "input")
    public String confirm() {
        questions = questionService.findAll(form.questionnaireId).list();
        return "confirm.jsp";
    }

    public String create() {
        return "create.jsp";
    }
}
