package cb.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class SpringMVCController {
    
    @RequestMapping(value = "welcomeController")
    public ModelAndView helloWorld() {
        
        String message="<br><div style='text-align:center;'>"
                + "<h3>******** Hello, Spring MVC Books *******</h3></div>";
        return new ModelAndView("welcome", "message", message);
    }
    
    
 
}