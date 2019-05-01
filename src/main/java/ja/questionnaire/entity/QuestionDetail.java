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
 * QuestionDetailエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2019/05/01 13:17:29")
public class QuestionDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /** questionDetailIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 19, nullable = false, unique = true)
    public Long questionDetailId;

    /** questionDetailContentプロパティ */
    @Column(length = 400, nullable = false, unique = false)
    public String questionDetailContent;

    /** sortNoプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer sortNo;

    /** questionIdプロパティ */
    @Column(precision = 19, nullable = true, unique = false)
    public Long questionId;

    /** answerContentRadioList関連プロパティ */
    @OneToMany(mappedBy = "questionDetail")
    public List<AnswerContentRadio> answerContentRadioList;

    /** answerContentTextList関連プロパティ */
    @OneToMany(mappedBy = "questionDetail")
    public List<AnswerContentText> answerContentTextList;

    /** question関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "question_id")
    public Question question;
}