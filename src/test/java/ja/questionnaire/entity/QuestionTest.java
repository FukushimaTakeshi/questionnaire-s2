package ja.questionnaire.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static ja.questionnaire.entity.QuestionNames.*;

/**
 * {@link Question}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2019/05/01 13:17:35")
public class QuestionTest extends S2TestCase {

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
        jdbcManager.from(Question.class).id(1L).getSingleResult();
    }

    /**
     * answerContentListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_answerContentList() throws Exception {
        jdbcManager.from(Question.class).leftOuterJoin(answerContentList()).id(1L).getSingleResult();
    }

    /**
     * questionnaireとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_questionnaire() throws Exception {
        jdbcManager.from(Question.class).leftOuterJoin(questionnaire()).id(1L).getSingleResult();
    }

    /**
     * questionDetailListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_questionDetailList() throws Exception {
        jdbcManager.from(Question.class).leftOuterJoin(questionDetailList()).id(1L).getSingleResult();
    }
}