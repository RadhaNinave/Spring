package com.springController;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller  
	public class HelloController
	{  
	@RequestMapping("/springboot")  
	    public String display()  
	    {  
			System.out.println("from controller");
	        return "index";  
	    }     
	}  


