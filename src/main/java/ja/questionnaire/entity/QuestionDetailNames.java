package ja.questionnaire.entity;

import ja.questionnaire.entity.AnswerContentRadioNames._AnswerContentRadioNames;
import ja.questionnaire.entity.AnswerContentTextNames._AnswerContentTextNames;
import ja.questionnaire.entity.QuestionNames._QuestionNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link QuestionDetail}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2019/05/01 13:17:31")
public class QuestionDetailNames {

    /**
     * questionDetailIdのプロパティ名を返します。
     * 
     * @return questionDetailIdのプロパティ名
     */
    public static PropertyName<Long> questionDetailId() {
        return new PropertyName<Long>("questionDetailId");
    }

    /**
     * questionDetailContentのプロパティ名を返します。
     * 
     * @return questionDetailContentのプロパティ名
     */
    public static PropertyName<String> questionDetailContent() {
        return new PropertyName<String>("questionDetailContent");
    }

    /**
     * sortNoのプロパティ名を返します。
     * 
     * @return sortNoのプロパティ名
     */
    public static PropertyName<Integer> sortNo() {
        return new PropertyName<Integer>("sortNo");
    }

    /**
     * questionIdのプロパティ名を返します。
     * 
     * @return questionIdのプロパティ名
     */
    public static PropertyName<Long> questionId() {
        return new PropertyName<Long>("questionId");
    }

    /**
     * answerContentRadioListのプロパティ名を返します。
     * 
     * @return answerContentRadioListのプロパティ名
     */
    public static _AnswerContentRadioNames answerContentRadioList() {
        return new _AnswerContentRadioNames("answerContentRadioList");
    }

    /**
     * answerContentTextListのプロパティ名を返します。
     * 
     * @return answerContentTextListのプロパティ名
     */
    public static _AnswerContentTextNames answerContentTextList() {
        return new _AnswerContentTextNames("answerContentTextList");
    }

    /**
     * questionのプロパティ名を返します。
     * 
     * @return questionのプロパティ名
     */
    public static _QuestionNames question() {
        return new _QuestionNames("question");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _QuestionDetailNames extends PropertyName<QuestionDetail> {

        /**
         * インスタンスを構築します。
         */
        public _QuestionDetailNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _QuestionDetailNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _QuestionDetailNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * questionDetailIdのプロパティ名を返します。
         *
         * @return questionDetailIdのプロパティ名
         */
        public PropertyName<Long> questionDetailId() {
            return new PropertyName<Long>(this, "questionDetailId");
        }

        /**
         * questionDetailContentのプロパティ名を返します。
         *
         * @return questionDetailContentのプロパティ名
         */
        public PropertyName<String> questionDetailContent() {
            return new PropertyName<String>(this, "questionDetailContent");
        }

        /**
         * sortNoのプロパティ名を返します。
         *
         * @return sortNoのプロパティ名
         */
        public PropertyName<Integer> sortNo() {
            return new PropertyName<Integer>(this, "sortNo");
        }

        /**
         * questionIdのプロパティ名を返します。
         *
         * @return questionIdのプロパティ名
         */
        public PropertyName<Long> questionId() {
            return new PropertyName<Long>(this, "questionId");
        }

        /**
         * answerContentRadioListのプロパティ名を返します。
         * 
         * @return answerContentRadioListのプロパティ名
         */
        public _AnswerContentRadioNames answerContentRadioList() {
            return new _AnswerContentRadioNames(this, "answerContentRadioList");
        }

        /**
         * answerContentTextListのプロパティ名を返します。
         * 
         * @return answerContentTextListのプロパティ名
         */
        public _AnswerContentTextNames answerContentTextList() {
            return new _AnswerContentTextNames(this, "answerContentTextList");
        }

        /**
         * questionのプロパティ名を返します。
         * 
         * @return questionのプロパティ名
         */
        public _QuestionNames question() {
            return new _QuestionNames(this, "question");
        }
    }
}