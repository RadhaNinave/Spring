package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")  
    public String redirect()  
    {  
        return "viewpage";  
    }     
	@RequestMapping("/helloagain")  
	public String display()  
	{  
	    return "final";  
	} 
	@RequestMapping("/hello")
	public String view()
	{
		return "index";
	}
}