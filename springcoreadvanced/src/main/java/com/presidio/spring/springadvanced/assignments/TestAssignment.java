package com.presidio.spring.springadvanced.assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAssignment {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springadvanced/assignments/assignmentConfig.xml");
		Customer customer = (Customer) context.getBean("customerBean");
		System.out.println(customer);
		
	}
}
