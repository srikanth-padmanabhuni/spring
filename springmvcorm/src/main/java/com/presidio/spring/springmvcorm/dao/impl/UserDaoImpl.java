package com.presidio.spring.springmvcorm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.presidio.spring.springmvcorm.dao.UserDao;
import com.presidio.spring.springmvcorm.entities.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int createUser(User user) {
		int result = (int) hibernateTemplate.save(user);
		return result;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = hibernateTemplate.loadAll(User.class);
		return users;
	}

	@Override
	public User findUser(Integer id) {
		User user = hibernateTemplate.get(User.class, id);
		return user;
	}

}
