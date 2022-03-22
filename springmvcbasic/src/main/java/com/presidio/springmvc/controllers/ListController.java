package com.presidio.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.presidio.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelNdView = new ModelAndView();
		modelNdView.setViewName("displayObject");
		
		Employee emp = new Employee();
		emp.setId(1000);
		emp.setName("Srikanth Padmanabhuni");
		emp.setSalary(1830000d);
		
		modelNdView.addObject("employee", emp);
		
		return modelNdView;
	}
}
