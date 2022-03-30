package com.presidio.spring.springmvcorm.services;

import java.util.List;

import com.presidio.spring.springmvcorm.entities.User;

public interface UserService {

	int saveUser(User user);
	
	List<User> getUsers();
	
	User getUser(Integer id);
}
