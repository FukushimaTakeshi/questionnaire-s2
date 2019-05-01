package ja.questionnaire.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static ja.questionnaire.entity.QuestionnaireNames.*;

/**
 * {@link Questionnaire}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2019/05/01 13:17:35")
public class QuestionnaireTest extends S2TestCase {

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
        jdbcManager.from(Questionnaire.class).id(1L).getSingleResult();
    }

    /**
     * answerUserListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_answerUserList() throws Exception {
        jdbcManager.from(Questionnaire.class).leftOuterJoin(answerUserList()).id(1L).getSingleResult();
    }

    /**
     * questionListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_questionList() throws Exception {
        jdbcManager.from(Questionnaire.class).leftOuterJoin(questionList()).id(1L).getSingleResult();
    }
}