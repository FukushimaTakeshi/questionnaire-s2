package ja.questionnaire.service;

import javax.annotation.Generated;
import org.seasar.extension.unit.S2TestCase;

/**
 * {@link AnswerContentTextService}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceTestModelFactoryImpl"}, date = "2019/05/01 13:17:36")
public class AnswerContentTextServiceTest extends S2TestCase {

    private AnswerContentTextService answerContentTextService;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("app.dicon");
    }

    /**
     * {@link #answerContentTextService}が利用可能であることをテストします。
     * 
     * @throws Exception
     */
    public void testAvailable() throws Exception {
        assertNotNull(answerContentTextService);
    }
}