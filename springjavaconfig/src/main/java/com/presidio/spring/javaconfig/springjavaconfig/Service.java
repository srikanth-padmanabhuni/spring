package com.presidio.spring.javaconfig.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Autowired
	Dao dao;
	
	public void initLifeCycleMethod() {
		System.out.println("Inside init life cycle method");
	}
	
	public void destroyLifeCycleMethod() {
		System.out.println("Inside destroy life cycle method");
	}
	
	public void save() {
		dao.create();
	}
}
