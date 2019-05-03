package ja.questionnaire.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AnswerContentRadioエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2019/05/01 13:17:29")
@Table(name="answer_content_radio")
public class AnswerContentRadio implements Serializable {

    private static final long serialVersionUID = 1L;

    /** answerDetailIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 19, nullable = false, unique = true)
    public Long answerDetailId;

    /** answerContentIdプロパティ */
    @Column(precision = 19, nullable = true, unique = false)
    public Long answerContentId;

    /** questionDetailIdプロパティ */
    @Column(precision = 19, nullable = true, unique = false)
    public Long questionDetailId;

    /** answerContent関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "answer_content_id", referencedColumnName = "answer_content_id")
    public AnswerContent answerContent;

    /** questionDetail関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "question_detail_id", referencedColumnName = "question_detail_id")
    public QuestionDetail questionDetail;
}