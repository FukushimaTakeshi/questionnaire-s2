package ja.questionnaire.entity;

import ja.questionnaire.entity.AnswerContentNames._AnswerContentNames;
import ja.questionnaire.entity.QuestionDetailNames._QuestionDetailNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link AnswerContentText}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2019/05/01 13:17:31")
public class AnswerContentTextNames {

    /**
     * answerDetailIdのプロパティ名を返します。
     * 
     * @return answerDetailIdのプロパティ名
     */
    public static PropertyName<Long> answerDetailId() {
        return new PropertyName<Long>("answerDetailId");
    }

    /**
     * answerContentAnswerContentIdのプロパティ名を返します。
     * 
     * @return answerContentAnswerContentIdのプロパティ名
     */
    public static PropertyName<String> answerContentAnswerContentId() {
        return new PropertyName<String>("answerContentAnswerContentId");
    }

    /**
     * answerContentIdのプロパティ名を返します。
     * 
     * @return answerContentIdのプロパティ名
     */
    public static PropertyName<Long> answerContentId() {
        return new PropertyName<Long>("answerContentId");
    }

    /**
     * questionDetailIdのプロパティ名を返します。
     * 
     * @return questionDetailIdのプロパティ名
     */
    public static PropertyName<Long> questionDetailId() {
        return new PropertyName<Long>("questionDetailId");
    }

    /**
     * answerContentのプロパティ名を返します。
     * 
     * @return answerContentのプロパティ名
     */
    public static _AnswerContentNames answerContent() {
        return new _AnswerContentNames("answerContent");
    }

    /**
     * questionDetailのプロパティ名を返します。
     * 
     * @return questionDetailのプロパティ名
     */
    public static _QuestionDetailNames questionDetail() {
        return new _QuestionDetailNames("questionDetail");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _AnswerContentTextNames extends PropertyName<AnswerContentText> {

        /**
         * インスタンスを構築します。
         */
        public _AnswerContentTextNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _AnswerContentTextNames(final String name) {
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
        public _AnswerContentTextNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * answerDetailIdのプロパティ名を返します。
         *
         * @return answerDetailIdのプロパティ名
         */
        public PropertyName<Long> answerDetailId() {
            return new PropertyName<Long>(this, "answerDetailId");
        }

        /**
         * answerContentAnswerContentIdのプロパティ名を返します。
         *
         * @return answerContentAnswerContentIdのプロパティ名
         */
        public PropertyName<String> answerContentAnswerContentId() {
            return new PropertyName<String>(this, "answerContentAnswerContentId");
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
         * questionDetailIdのプロパティ名を返します。
         *
         * @return questionDetailIdのプロパティ名
         */
        public PropertyName<Long> questionDetailId() {
            return new PropertyName<Long>(this, "questionDetailId");
        }

        /**
         * answerContentのプロパティ名を返します。
         * 
         * @return answerContentのプロパティ名
         */
        public _AnswerContentNames answerContent() {
            return new _AnswerContentNames(this, "answerContent");
        }

        /**
         * questionDetailのプロパティ名を返します。
         * 
         * @return questionDetailのプロパティ名
         */
        public _QuestionDetailNames questionDetail() {
            return new _QuestionDetailNames(this, "questionDetail");
        }
    }
}