package ja.questionnaire.action;

import ja.questionnaire.domain.model.question.Answer;
import ja.questionnaire.domain.model.question.Question;
import ja.questionnaire.domain.model.question.QuestionsAndAnswers;
import ja.questionnaire.form.QuestionForm;
import ja.questionnaire.service.AnswerService;
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

    @Resource
    AnswerService answerService;

    public List<Question> questions;

    public QuestionsAndAnswers questionsAndAnswers;

    @Execute(validator = false)
    public String input() {
    	questions = questionService.findAll(form.questionnaireId).list();
        return "input.jsp";
    }

    @Execute(validator = true, input = "input")
    public String confirm() {
        questions = questionService.findAll(form.questionnaireId).list();
        questionsAndAnswers = new QuestionsAndAnswers(form.name, form.answer, questions);
        return "confirm.jsp";
    }

    @Execute(validator = true, input = "input")
    public String create() {
    	questions = questionService.findAll(form.questionnaireId).list();
        answerService.create(form.questionnaireId, new QuestionsAndAnswers(form.name, form.answer, questions));
        return "create.jsp";
    }
}
