package ja.questionnaire.entity;

import ja.questionnaire.entity.AnswerContentNames._AnswerContentNames;
import ja.questionnaire.entity.QuestionnaireNames._QuestionnaireNames;
import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link AnswerUser}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2019/05/01 13:17:31")
public class AnswerUserNames {

    /**
     * answerUserIdのプロパティ名を返します。
     * 
     * @return answerUserIdのプロパティ名
     */
    public static PropertyName<Long> answerUserId() {
        return new PropertyName<Long>("answerUserId");
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
     * answeredAtのプロパティ名を返します。
     * 
     * @return answeredAtのプロパティ名
     */
    public static PropertyName<Timestamp> answeredAt() {
        return new PropertyName<Timestamp>("answeredAt");
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
     * @author S2JDBC-Gen
     */
    public static class _AnswerUserNames extends PropertyName<AnswerUser> {

        /**
         * インスタンスを構築します。
         */
        public _AnswerUserNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _AnswerUserNames(final String name) {
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
        public _AnswerUserNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * answeredAtのプロパティ名を返します。
         *
         * @return answeredAtのプロパティ名
         */
        public PropertyName<Timestamp> answeredAt() {
            return new PropertyName<Timestamp>(this, "answeredAt");
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
    }
}