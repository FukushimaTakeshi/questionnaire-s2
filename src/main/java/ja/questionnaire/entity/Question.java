package ja.questionnaire.entity;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Questionエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2019/05/01 13:17:29")
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    /** questionIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 19, nullable = false, unique = true)
    public Long questionId;

    /** questionTypeプロパティ */
    @Column(length = 4, nullable = false, unique = false)
    public String questionType;

    /** questionContentプロパティ */
    @Column(length = 400, nullable = false, unique = false)
    public String questionContent;

    /** sortNoプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer sortNo;

    /** questionnaireIdプロパティ */
    @Column(precision = 19, nullable = true, unique = false)
    public Long questionnaireId;

    /** answerContentList関連プロパティ */
    @OneToMany(mappedBy = "question")
    public List<AnswerContent> answerContentList;

    /** questionnaire関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "questionnaire_id", referencedColumnName = "questionnaire_id")
    public Questionnaire questionnaire;

    /** questionDetailList関連プロパティ */
    @OneToMany(mappedBy = "question")
    public List<QuestionDetail> questionDetailList;
}