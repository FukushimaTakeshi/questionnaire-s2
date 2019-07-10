package ja.questionnaire.action;

import antlr.StringUtils;
import ja.questionnaire.domain.model.question.Answer;
import ja.questionnaire.domain.model.question.Question;
import ja.questionnaire.domain.model.question.QuestionsAndAnswers;
import ja.questionnaire.form.QuestionForm;
import ja.questionnaire.service.AnswerService;
import ja.questionnaire.service.QuestionService;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.framework.util.StringUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import java.util.List;
import java.util.Map;

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
    	questions = questionService.findAll(form.questionnaireId).list();
        return "input.jsp";
    }

    @Execute(validator = true, validate = "validateAnswers", input = "input")
    public String confirm() {
        questions = questionService.findAll(form.questionnaireId).list();
        questionsAndAnswers = new QuestionsAndAnswers(form.name, form.answers, questions);
        return "confirm.jsp";
    }

    @Execute(validator = true, validate = "validateAnswers", input = "input")
    public String create() {
    	questions = questionService.findAll(form.questionnaireId).list();
        answerService.create(form.questionnaireId, new QuestionsAndAnswers(form.name, form.answers, questions));
        return "create.jsp";
    }
    
    public ActionMessages validateAnswers() {
        ActionMessages errors = new ActionMessages();

        for (Map.Entry<String, String> answerMap : form.answers.entrySet()) {
            if (StringUtil.isEmpty(answerMap.getValue())) {
                errors.add(GLOBAL_MESSAGE, new ActionMessage("未回答の質問があります", false));
            }
        }
        return errors;
    }
}
