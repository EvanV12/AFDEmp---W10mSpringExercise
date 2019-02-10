package cb.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class SpringMVCController3 {
    
    @RequestMapping(value = "showBookForm")
    public ModelAndView helloWorld() {
        
        String message="<br><div style='text-align:center;'>"
                + "<h3>******** Hello, Show form to add new book page *******</h3></div>";
        return new ModelAndView("welcome", "message", message);
    }
    
    
 
}