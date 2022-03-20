package com.presidio.spring.springadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int id;
	private String name;
	
	// Variable level annotatoion
	// Qualifier helps in finding the bean with the given name. If not found throws NoBeanExceptionFound exception
	@Autowired(required=false)
	@Qualifier("addressBean2")
	private Address address;
	
	// Constructor level annotatoion
	// Aualifier cant be used on constructor
	//@Autowired(required=false)
//	Employee(Address address) {
//		this.address = address;
//	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	// Searches for bean of Address by type and injects it to it
	// If spring finds two bean definitions of Address type then it throws an exception
	// We can use this annotation on varible level and constructor level as well
	// Enable annoataions in bean config to work this annotation
	//@Autowired(required=false)
	//@Qualifier("addressBean2")
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
