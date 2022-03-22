package com.presidio.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.presidio.springmvc.dto.User;

@Controller
public class UserController {

	@RequestMapping("userRegistraion")
	public String showRegistrationPage() {
		return "userReg";
	}
	
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		model.addAttribute("user", user);
		System.out.println(user);
		return "regResult";
	}
}
