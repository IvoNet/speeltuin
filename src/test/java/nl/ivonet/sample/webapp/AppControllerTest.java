/*
 * Copyright 2016 Ivo Woltring <WebMaster@ivonet.nl>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
        this.modelMapMock = createMock(Model.class);

        this.controller = new AppController();
    }

    private void replayMocks() {
        replay(this.modelMapMock);
    }

    private void verifyMocks() {
        verify(this.modelMapMock);
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        expect(this.modelMapMock.addAttribute(isA(Password.class))).andReturn(this.modelMapMock);
        expect(this.modelMapMock.addAttribute("copyright", null)).andReturn(this.modelMapMock);
        replayMocks();
        assertEquals("index", this.controller.index(this.modelMapMock));
        verifyMocks();
    }

//    @Test
//    public void testAnswers() throws Exception {
//        assertEquals("index" , controller.answers("foo", modelMapMock));
//        assertEquals("answers" , controller.answers("42", modelMapMock));
//    }
}
