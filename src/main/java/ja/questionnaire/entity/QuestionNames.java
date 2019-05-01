package ja.questionnaire.entity;

import ja.questionnaire.entity.AnswerContentNames._AnswerContentNames;
import ja.questionnaire.entity.QuestionDetailNames._QuestionDetailNames;
import ja.questionnaire.entity.QuestionnaireNames._QuestionnaireNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Question}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2019/05/01 13:17:31")
public class QuestionNames {

    /**
     * questionIdのプロパティ名を返します。
     * 
     * @return questionIdのプロパティ名
     */
    public static PropertyName<Long> questionId() {
        return new PropertyName<Long>("questionId");
    }

    /**
     * questionTypeのプロパティ名を返します。
     * 
     * @return questionTypeのプロパティ名
     */
    public static PropertyName<String> questionType() {
        return new PropertyName<String>("questionType");
    }

    /**
     * questionContentのプロパティ名を返します。
     * 
     * @return questionContentのプロパティ名
     */
    public static PropertyName<String> questionContent() {
        return new PropertyName<String>("questionContent");
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
     * questionnaireIdのプロパティ名を返します。
     * 
     * @return questionnaireIdのプロパティ名
     */
    public static PropertyName<Long> questionnaireId() {
        return new PropertyName<Long>("questionnaireId");
    }

    /**
     * answerContentListのプロパティ名を返します。
     * 
     * @return answerContentListのプロパティ名
     */
    public static _AnswerContentNames answerContentList() {
        return new _AnswerContentNames("answerContentList");
    }

    /**
     * questionnaireのプロパティ名を返します。
     * 
     * @return questionnaireのプロパティ名
     */
    public static _QuestionnaireNames questionnaire() {
        return new _QuestionnaireNames("questionnaire");
    }

    /**
     * questionDetailListのプロパティ名を返します。
     * 
     * @return questionDetailListのプロパティ名
     */
    public static _QuestionDetailNames questionDetailList() {
        return new _QuestionDetailNames("questionDetailList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _QuestionNames extends PropertyName<Question> {

        /**
         * インスタンスを構築します。
         */
        public _QuestionNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _QuestionNames(final String name) {
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
        public _QuestionNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * questionTypeのプロパティ名を返します。
         *
         * @return questionTypeのプロパティ名
         */
        public PropertyName<String> questionType() {
            return new PropertyName<String>(this, "questionType");
        }

        /**
         * questionContentのプロパティ名を返します。
         *
         * @return questionContentのプロパティ名
         */
        public PropertyName<String> questionContent() {
            return new PropertyName<String>(this, "questionContent");
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
         * questionnaireIdのプロパティ名を返します。
         *
         * @return questionnaireIdのプロパティ名
         */
        public PropertyName<Long> questionnaireId() {
            return new PropertyName<Long>(this, "questionnaireId");
        }

        /**
         * answerContentListのプロパティ名を返します。
         * 
         * @return answerContentListのプロパティ名
         */
        public _AnswerContentNames answerContentList() {
            return new _AnswerContentNames(this, "answerContentList");
        }

        /**
         * questionnaireのプロパティ名を返します。
         * 
         * @return questionnaireのプロパティ名
         */
        public _QuestionnaireNames questionnaire() {
            return new _QuestionnaireNames(this, "questionnaire");
        }

        /**
         * questionDetailListのプロパティ名を返します。
         * 
         * @return questionDetailListのプロパティ名
         */
        public _QuestionDetailNames questionDetailList() {
            return new _QuestionDetailNames(this, "questionDetailList");
        }
    }
}