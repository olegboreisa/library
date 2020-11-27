package lt.boreisa.library.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BookController {

    @RequestMapping(path = {"", "/", "/main"}, method = RequestMethod.GET)
    public String getMain() {
        return "main";
    }


    //ACTION SHOULD COME FROM MAIN.HTML
    @RequestMapping(value = "/getAnswerOne", method = RequestMethod.GET)
    public String getSelectOne
    (@RequestParam (value = "action", required = true) String action) {
        if (action.equals("add")) {
            return "enterBook";
        } else if (action.equals("review")) {
            return "empty";
        } else {
            return null;
        }
    }
    //ACTION SHOULD COME FROM ENTER BOOK.HTML
    @RequestMapping(path = "/getAnswerTwo", method = RequestMethod.GET)
    public String getSelectTwo (
            @RequestParam (value = "action", required = true) String action,
            @RequestParam (value = "author", required = true) String author,
            @RequestParam (value = "name", required = true) String name,
            @RequestParam (value = "year", required = true) String year,
            Model model) {
        if (action.equals("add")) {
            model.addAttribute("author", author);
            model.addAttribute("name", name);
            model.addAttribute("year", year);
            return "empty";
        } else if (action.equals("return")) {
            return "main";
        } else {
            return null;
        }
    }
}
