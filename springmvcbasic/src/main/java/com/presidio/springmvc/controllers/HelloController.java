package com.presidio.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Tells spring that it can create bean of type class name and it can process the requests coming to the application
@Controller
public class HelloController {

	// Call this method when url is /hello
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelNdView = new ModelAndView();
		modelNdView.setViewName("hello");
		
		modelNdView.addObject("id", 1000);
		modelNdView.addObject("name", "Srikanth Padmanabhuni");
		modelNdView.addObject("salary", 1830000d);
		
		return modelNdView;
	}
}
