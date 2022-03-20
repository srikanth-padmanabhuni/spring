package com.presidio.spring.springcore.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnerBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springcore/innerbean/innerBeanConfig.xml");
		Employee emp = (Employee) context.getBean("employeeBean");
		System.out.println(emp.toString());
		
		Employee emp2 = (Employee) context.getBean("employeeBean");
		
		// Singleton Scope on bean class gives same object whenever we request it 
		// thats y we will have same hashcode for those obkjects
		
		// For 'prototype' scope objects will be different so we get different hashcodes
		
		boolean isSingletonScope = (emp.hashCode()) == (emp2.hashCode());
		System.out.println("Is Singleton Scope of Employtee Bean : " + isSingletonScope);
		
		
		// Scope of inner bean will gets applied to inner beans as well
		// But scope of inner bean doent gets applied if scope of outer bean is defined or defaulted
		Address add1 = emp.getAddress();
		Address add2 = emp2.getAddress();
		
		isSingletonScope = (add1.hashCode()) == (add2.hashCode());
		System.out.println("Is Singleton Scope of inner(Address) bean : " + isSingletonScope);
	}
}
