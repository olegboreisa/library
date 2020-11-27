package lt.boreisa.library.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BookController {

    @RequestMapping(value = {"", "/", "/main"}, method = RequestMethod.GET)
    public String getMain() {
        return "main";
    }

    @RequestMapping(value = "/enter-book", method = RequestMethod.GET)
    public String addBookPage() {
        return "enterBook";
    }

    //ACTION SHOULD COME FROM MAIN.HTML
    @RequestMapping(value = "/getAnswerOne", method = RequestMethod.GET)
    public String getSelectOne (@RequestParam (value = "action", required = true) String action) {
        if (action.equals("add")) {
            return "enterBook";
        } else if (action.equals("review")) {
            return "empty";
        } else {
            return null;
        }
    }
    //ACTION SHOULD COME FROM ENTER BOOK.HTML
    @RequestMapping(value = "/getAnswerTwo", method = RequestMethod.GET)
    public String getSelectTwo (@RequestParam (value = "action", required = true) String action) {
        if (action.equals("add")) {
            return "empty";
        } else if (action.equals("return")) {
            return "main";
        } else {
            return null;
        }
    }
}
