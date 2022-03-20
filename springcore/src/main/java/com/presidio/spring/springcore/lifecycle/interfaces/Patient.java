package com.presidio.spring.springcore.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean{

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

	// Destroy method which got implemented due to interface DisposableBean
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside Destroy");
	}

	// Init method which got implemented due to interface InitializingBean
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside Initialize");
	}


}
