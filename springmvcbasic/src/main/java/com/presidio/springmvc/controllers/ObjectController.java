package com.presidio.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.presidio.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelNdView = new ModelAndView();
		modelNdView.setViewName("displayList");
		
		Employee emp1 = new Employee();
		emp1.setId(1000);
		emp1.setName("Srikanth Padmanabhuni");
		emp1.setSalary(1830000d);
		
		Employee emp2 = new Employee();
		emp2.setId(1002);
		emp2.setName("Manikanta");
		emp2.setSalary(1230000d);
		
		Employee emp3 = new Employee();
		emp3.setId(1003);
		emp3.setName("Murali");
		emp3.setSalary(1030000d);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);employees.add(emp2);employees.add(emp3);
		
		modelNdView.addObject("employees", employees);
		
		return modelNdView;
	}
}
