package ja.questionnaire.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.*;

/**
 * AnswerUserエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2019/05/01 13:17:29")
@Table(name="answer_user")
public class AnswerUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /** answerUserIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 19, nullable = false, unique = true)
    public Long answerUserId;

    /** nameプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String name;

    /** answeredAtプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp answeredAt;

    /** questionnaireIdプロパティ */
    @Column(precision = 19, nullable = true, unique = false)
    public Long questionnaireId;

    /** answerContentList関連プロパティ */
    @OneToMany(mappedBy = "answerUser")
    public List<AnswerContent> answerContentList;

    /** questionnaire関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "questionnaire_id", referencedColumnName = "questionnaire_id")
    public Questionnaire questionnaire;
}