package com.presidio.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployeeBean {
	public static void main(String[] args) {
		// Creating the Classpath xml context since the config xml is placed under src/main/java directory
		ClassPathXmlApplicationContext conetxt = new ClassPathXmlApplicationContext("config.xml");
		
		// get bean with the name mentioned in config.xml and casting it
		Employee empBeanObj = (Employee) conetxt.getBean("employeeBean");
		System.out.println("Employee Id : " + empBeanObj.getId());
		System.out.println("Employee Name : " + empBeanObj.getName());
	}
}
