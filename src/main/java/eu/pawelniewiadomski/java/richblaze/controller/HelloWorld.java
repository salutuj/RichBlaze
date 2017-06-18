package eu.pawelniewiadomski.java.richblaze.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	
	@RequestMapping(value = "/HelloWorld", method = RequestMethod.GET)
	public ModelAndView doGet(){
	  return new ModelAndView("HelloWorld");
	}
}
