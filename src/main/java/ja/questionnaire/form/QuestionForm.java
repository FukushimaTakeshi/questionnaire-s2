package ja.questionnaire.form;

import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Required;

import java.util.Map;

public class QuestionForm {
    @Required
    public String questionnaireId;

    @Required
    @Mask(mask = "^(?!.*[!-/:-@¥[-`{-~！”＃＄％＆’（）＊＋，−．／：；＜＝＞？＠［￥］＾＿｀｛｜｝〜]).*$")
    public String name;

    public Map<String, String> answers;
}
