package ja.questionnaire.entity;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Questionnaireエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2019/05/01 13:17:29")
public class Questionnaire implements Serializable {

    private static final long serialVersionUID = 1L;

    /** questionnaireIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 19, nullable = false, unique = true)
    public Long questionnaireId;

    /** nameプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String name;

    /** answerUserList関連プロパティ */
    @OneToMany(mappedBy = "questionnaire")
    public List<AnswerUser> answerUserList;

    /** questionList関連プロパティ */
    @OneToMany(mappedBy = "questionnaire")
    public List<Question> questionList;
}