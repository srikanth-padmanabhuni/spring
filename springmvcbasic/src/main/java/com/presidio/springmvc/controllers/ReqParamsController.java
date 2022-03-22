package com.presidio.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReqParamsController {

	// for primitive types default value is must if required is false since primitives cant take null asa values
	// by default required is true
	@RequestMapping("showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value="sal", required = false, defaultValue = "0d") double salary) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
		ModelAndView modelNdView = new ModelAndView();
		modelNdView.setViewName("userReg");
		
		return modelNdView;
	}
}
