package ja.questionnaire.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static ja.questionnaire.entity.AnswerContentTextNames.*;

/**
 * {@link AnswerContentText}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2019/05/01 13:17:35")
public class AnswerContentTextTest extends S2TestCase {

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
        jdbcManager.from(AnswerContentText.class).id(1L).getSingleResult();
    }

    /**
     * answerContentとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_answerContent() throws Exception {
        jdbcManager.from(AnswerContentText.class).leftOuterJoin(answerContent()).id(1L).getSingleResult();
    }

    /**
     * questionDetailとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_questionDetail() throws Exception {
        jdbcManager.from(AnswerContentText.class).leftOuterJoin(questionDetail()).id(1L).getSingleResult();
    }
}