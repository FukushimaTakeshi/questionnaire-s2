package ja.questionnaire.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static ja.questionnaire.entity.QuestionDetailNames.*;

/**
 * {@link QuestionDetail}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2019/05/01 13:17:35")
public class QuestionDetailTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(QuestionDetail.class).id(1L).getSingleResult();
    }

    /**
     * answerContentRadioListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_answerContentRadioList() throws Exception {
        jdbcManager.from(QuestionDetail.class).leftOuterJoin(answerContentRadioList()).id(1L).getSingleResult();
    }

    /**
     * answerContentTextListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_answerContentTextList() throws Exception {
        jdbcManager.from(QuestionDetail.class).leftOuterJoin(answerContentTextList()).id(1L).getSingleResult();
    }

    /**
     * questionとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_question() throws Exception {
        jdbcManager.from(QuestionDetail.class).leftOuterJoin(question()).id(1L).getSingleResult();
    }
}