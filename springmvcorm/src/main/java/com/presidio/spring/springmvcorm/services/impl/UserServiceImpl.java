package com.presidio.spring.springmvcorm.services.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.presidio.spring.springmvcorm.dao.UserDao;
import com.presidio.spring.springmvcorm.entities.User;
import com.presidio.spring.springmvcorm.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public int saveUser(User user) {
		int result = userDao.createUser(user);
		return result;
	}

	@Override
	@Transactional
	public List<User> getUsers() {
		List<User> users = userDao.getAllUsers();
		Collections.sort(users);
		return users;
	}

	@Override
	public User getUser(Integer id) {
		User user = userDao.findUser(id);
		return user;
	}

}
