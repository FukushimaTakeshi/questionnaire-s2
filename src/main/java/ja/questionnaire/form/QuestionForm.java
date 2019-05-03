package ja.questionnaire.form;

import org.seasar.struts.annotation.Required;

import java.util.List;
import java.util.Map;

public class QuestionForm {
    @Required
    public String questionnaireId;

    @Required
    public String name;

    public Map<String, String> answer;

}
