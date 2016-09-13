package nl.ivonet.sample.webapp;

import nl.ivonet.sample.webapp.view.Password;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.Model;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.isA;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple AppController.
 */
public class AppControllerTest {

    private AppController controller;
    private Model modelMapMock;

    @Before
    public void setUp() throws Exception {
        modelMapMock = createMock(Model.class);

        controller = new AppController();
    }

    private void replayMocks() {
        replay(modelMapMock);
    }

    private void verifyMocks() {
        verify(modelMapMock);
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        expect(modelMapMock.addAttribute(isA(Password.class))).andReturn(modelMapMock);
        expect(modelMapMock.addAttribute("copyright", null)).andReturn(modelMapMock);
        replayMocks();
        assertEquals("index", controller.index(modelMapMock));
        verifyMocks();
    }

//    @Test
//    public void testAnswers() throws Exception {
//        assertEquals("index" , controller.answers("foo", modelMapMock));
//        assertEquals("answers" , controller.answers("42", modelMapMock));
//    }
}
