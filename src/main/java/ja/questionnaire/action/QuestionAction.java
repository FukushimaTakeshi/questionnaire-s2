package ja.questionnaire.action;

import ja.questionnaire.domain.model.question.Question;
import ja.questionnaire.domain.model.question.Questions;
import ja.questionnaire.domain.model.question.QuestionsAndAnswers;
import ja.questionnaire.form.QuestionForm;
import ja.questionnaire.service.AnswerService;
import ja.questionnaire.service.QuestionService;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import static org.apache.struts.action.ActionMessages.GLOBAL_MESSAGE;

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
    	Questions questionList = questionService.findAll(form.questionnaireId);
    	questions = questionList.list();

    	if (form.answers != null) {
    	    questionsAndAnswers = new QuestionsAndAnswers(form.name, form.answers, questionList);
    	}
    	
        return "input.jsp";
    }

    @Execute(validator = true, validate = "validateAnswers", input = "input")
    public String confirm() {
        Questions questionList = questionService.findAll(form.questionnaireId);
        questionsAndAnswers = new QuestionsAndAnswers(form.name, form.answers, questionList);
        questions = questionList.list();
        return "confirm.jsp";
    }

    @Execute(validator = true, validate = "validateAnswers", input = "input")
    public String create() {
        Questions questionList = questionService.findAll(form.questionnaireId);
        answerService.create(form.questionnaireId, new QuestionsAndAnswers(form.name, form.answers, questionList));
        questions = questionList.list();
        return "create.jsp";
    }
    
    public ActionMessages validateAnswers() {
        Questions questions = questionService.findAll(form.questionnaireId);
        QuestionsAndAnswers questionsAndAnswers = new QuestionsAndAnswers(form.name, form.answers, questions);

        ActionMessages errors = new ActionMessages();
        for (String error : questionsAndAnswers.errors()) {
            errors.add(GLOBAL_MESSAGE, new ActionMessage(error, false));
        }
        return errors;
    }
}
