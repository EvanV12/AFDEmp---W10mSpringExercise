package cb.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class SpringMVCController2 {
    
    @RequestMapping(value = "searchByAuthor")
    public ModelAndView helloWorld() {
        
        String message="<br><div style='text-align:center;'>"
                + "<h3>******** Hello, Search by author page *******</h3></div>";
        return new ModelAndView("welcome", "message", message);
    }
    
}