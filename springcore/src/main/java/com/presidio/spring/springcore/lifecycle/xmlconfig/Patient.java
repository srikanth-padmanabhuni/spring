package com.presidio.spring.springcore.lifecycle.xmlconfig;

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

	// Life Cycle Methods
	// Can give any name instead of init() destroy() but return type and access modifier should be same
	
	// Initialize is called after the setter of this bean/class is called
	public void initialize() {
		System.out.println("initialize() is called");
	}
	
	// Called at end and destroy the bean
	// We need to add a hook to get this called after bean is destroyed
	public void destruct() {
		System.out.println("destruct() is called");
	}
}
