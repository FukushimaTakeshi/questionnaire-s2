package ja.questionnaire.entity;

import ja.questionnaire.entity.AnswerUserNames._AnswerUserNames;
import ja.questionnaire.entity.QuestionNames._QuestionNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Questionnaire}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2019/05/01 13:17:31")
public class QuestionnaireNames {

    /**
     * questionnaireIdのプロパティ名を返します。
     * 
     * @return questionnaireIdのプロパティ名
     */
    public static PropertyName<Long> questionnaireId() {
        return new PropertyName<Long>("questionnaireId");
    }

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * answerUserListのプロパティ名を返します。
     * 
     * @return answerUserListのプロパティ名
     */
    public static _AnswerUserNames answerUserList() {
        return new _AnswerUserNames("answerUserList");
    }

    /**
     * questionListのプロパティ名を返します。
     * 
     * @return questionListのプロパティ名
     */
    public static _QuestionNames questionList() {
        return new _QuestionNames("questionList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _QuestionnaireNames extends PropertyName<Questionnaire> {

        /**
         * インスタンスを構築します。
         */
        public _QuestionnaireNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _QuestionnaireNames(final String name) {
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
        public _QuestionnaireNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * answerUserListのプロパティ名を返します。
         * 
         * @return answerUserListのプロパティ名
         */
        public _AnswerUserNames answerUserList() {
            return new _AnswerUserNames(this, "answerUserList");
        }

        /**
         * questionListのプロパティ名を返します。
         * 
         * @return questionListのプロパティ名
         */
        public _QuestionNames questionList() {
            return new _QuestionNames(this, "questionList");
        }
    }
}