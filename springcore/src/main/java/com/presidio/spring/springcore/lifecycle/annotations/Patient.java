package com.presidio.spring.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;
	private String name;

	public int getId() {
		System.out.println("Getting Id");
		return id;
	}

	public void setId(int id) {
		System.out.println("Setting Id");
		this.id = id;
	}

	public String getName() {
		System.out.println("Getting Name");
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Name");
		this.name = name;
	}
	
	
	// This annotation says call this method immediately once the bean is constructed
	@PostConstruct
	public void initMethod() {
		System.out.println("initMethod() called");
	}
	
	// This annotation says call this method immediately before the bean is destructing
	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroyMethod() called");
	}

}
