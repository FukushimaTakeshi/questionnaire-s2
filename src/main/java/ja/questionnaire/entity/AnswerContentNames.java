package ja.questionnaire.entity;

import ja.questionnaire.entity.AnswerContentRadioNames._AnswerContentRadioNames;
import ja.questionnaire.entity.AnswerContentTextNames._AnswerContentTextNames;
import ja.questionnaire.entity.AnswerUserNames._AnswerUserNames;
import ja.questionnaire.entity.QuestionNames._QuestionNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link AnswerContent}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2019/05/01 13:17:31")
public class AnswerContentNames {

    /**
     * answerContentIdのプロパティ名を返します。
     * 
     * @return answerContentIdのプロパティ名
     */
    public static PropertyName<Long> answerContentId() {
        return new PropertyName<Long>("answerContentId");
    }

    /**
     * answerUserIdのプロパティ名を返します。
     * 
     * @return answerUserIdのプロパティ名
     */
    public static PropertyName<Long> answerUserId() {
        return new PropertyName<Long>("answerUserId");
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
     * answerUserのプロパティ名を返します。
     * 
     * @return answerUserのプロパティ名
     */
    public static _AnswerUserNames answerUser() {
        return new _AnswerUserNames("answerUser");
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
     * @author S2JDBC-Gen
     */
    public static class _AnswerContentNames extends PropertyName<AnswerContent> {

        /**
         * インスタンスを構築します。
         */
        public _AnswerContentNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _AnswerContentNames(final String name) {
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
        public _AnswerContentNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * answerContentIdのプロパティ名を返します。
         *
         * @return answerContentIdのプロパティ名
         */
        public PropertyName<Long> answerContentId() {
            return new PropertyName<Long>(this, "answerContentId");
        }

        /**
         * answerUserIdのプロパティ名を返します。
         *
         * @return answerUserIdのプロパティ名
         */
        public PropertyName<Long> answerUserId() {
            return new PropertyName<Long>(this, "answerUserId");
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
         * answerUserのプロパティ名を返します。
         * 
         * @return answerUserのプロパティ名
         */
        public _AnswerUserNames answerUser() {
            return new _AnswerUserNames(this, "answerUser");
        }

        /**
         * questionのプロパティ名を返します。
         * 
         * @return questionのプロパティ名
         */
        public _QuestionNames question() {
            return new _QuestionNames(this, "question");
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
    }
}