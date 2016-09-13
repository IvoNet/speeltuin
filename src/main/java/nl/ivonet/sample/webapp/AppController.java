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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Hello world controller !
 */
@Controller
public class AppController {


    @Qualifier("copyright") @Autowired private String copyright;

    /**
     * The index page.
     */
    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public String index(final Model model) {
        model.addAttribute(new Password());
        model.addAttribute("copyright", this.copyright);
        return "index";
    }

    /**
     * This RequestMapping gives has to possible views it can return.
     * <p/>
     * The answer
     *
     * @param password by Spring injected {@link org.springframework.web.bind.annotation.RequestParam}
     * @param model    by Sprint injected {@link org.springframework.ui.ModelMap}
     * @return the view
     */
    @RequestMapping(value = "/answers.htm", method = RequestMethod.POST)
    public String answers(final Password password, final Model model) {
        if ("42".equals(password.getPassword())) {
            return "answers";
        }

        model.addAttribute("message", "You have the incorrect password provided.");
        model.addAttribute(password);
        return "index";
    }

    /**
     * This RequestMapping gives has to possible views it can return.
     * <p/>
     * The answer
     *
     * @param password by Spring injected {@link org.springframework.web.bind.annotation.RequestParam}
     * @param model    by Sprint injected {@link org.springframework.ui.ModelMap}
     * @return the view
     */
    @RequestMapping(value = "/answers2.htm", method = RequestMethod.GET)
    public String answers2(final Password password, final Model model) {
        if ("42".equals(password.getPassword())) {
            return "answers";
        }

        model.addAttribute("message", "You have the incorrect password provided.");
        model.addAttribute(password);
        return "index";
    }


}
