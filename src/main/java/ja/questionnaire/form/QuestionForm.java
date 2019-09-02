package ja.questionnaire.form;

import ja.questionnaire.validator.annotation.HalfAndFullMaxLength;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Required;

import java.util.Map;

public class QuestionForm {
    @Required
    public String questionnaireId;

    @Required
    @Mask(mask = "^(?!.*[!-/:-@¥[-`{-~！”＃＄％＆’（）＊＋，−．／：；＜＝＞？＠［￥］＾＿｀｛｜｝〜]).*$")
    @HalfAndFullMaxLength(maxlength = 60)
    public String name;

    public Map<String, String> answers;
}
