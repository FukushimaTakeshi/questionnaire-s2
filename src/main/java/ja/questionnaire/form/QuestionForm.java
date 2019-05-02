package ja.questionnaire.form;

import org.seasar.struts.annotation.Required;

import java.util.List;

public class QuestionForm {
    @Required
    public String questionnaireId;

    @Required
    public String name;

    public List<String> answer;
}
