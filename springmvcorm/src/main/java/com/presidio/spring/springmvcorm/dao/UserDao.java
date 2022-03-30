package com.presidio.spring.springmvcorm.dao;

import java.util.List;

import com.presidio.spring.springmvcorm.entities.User;

public interface UserDao {

	int createUser(User user);
	
	List<User> getAllUsers();
	
	User findUser(Integer id);
}
