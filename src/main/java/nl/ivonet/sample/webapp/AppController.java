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
        model.addAttribute("copyright", copyright);
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
