package lt.boreisa.library.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BookController {

    @RequestMapping(value ="/main", method = RequestMethod.GET)
    public String getMain () {
        return "main";
    }

    @RequestMapping(value ="/enter-book", method = RequestMethod.GET)
    public String addBookPage () {
        return "enterBook";
    }
}
