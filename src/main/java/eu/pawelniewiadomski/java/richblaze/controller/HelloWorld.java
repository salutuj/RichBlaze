package eu.pawelniewiadomski.java.richblaze.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="/")
public class HelloWorld {
	
	
	public ModelAndView doGet(){
	  return new ModelAndView("hello");
	}
}
