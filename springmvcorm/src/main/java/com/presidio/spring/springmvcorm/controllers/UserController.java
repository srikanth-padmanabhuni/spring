package com.presidio.spring.springmvcorm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.presidio.spring.springmvcorm.entities.User;
import com.presidio.spring.springmvcorm.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	// return registration page
	@RequestMapping("userRegistraion")
	public String showRegistrationPage() {
		return "userReg";
	}
	
	// Register user
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result = userService.saveUser(user);
		model.addAttribute("result", "User created successfully with id : " + result);
		return "userReg";
	}
	
	//get all users
	@RequestMapping("getUsers")
	public String gellAllUsers(ModelMap model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "displayUsers";
	}
	
	//Validate for Id before registration
		// @ResponseBody tells Spring that whatever we are returning from this method should be used in response body
		// instead of searching for a view under that name
	@RequestMapping("validateId")
	public @ResponseBody String validateId(@RequestParam("id") Integer id) {
		User user = userService.getUser(id);
		String msg = "";
		if(user != null) {
			msg = "User with Id: " + id + " already exists";
		}
		return msg;
	}
	
}
