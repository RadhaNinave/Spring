package com.springController;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller  
	public class HomeController2
	{  
	@RequestMapping("/springmvc")  
	    public String display()  
	    {  
			System.out.println("from controller");
	        return "index2";  
	    }     
	}  



