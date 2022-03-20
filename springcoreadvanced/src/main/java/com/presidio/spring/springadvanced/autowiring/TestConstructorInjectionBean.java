package com.presidio.spring.springadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInjectionBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springadvanced/autowiring/autoWiringConfig.xml");
		Employee emp = (Employee) context.getBean("employeeBeanByConstructorType");
		System.out.println(emp);
		
//		Employee emp1 = (Employee) context.getBean("employeeBeanByNameType");
//		System.out.println(emp1);
//		
//		Employee emp2 = (Employee) context.getBean("employeeBeanByTypeType");
//		System.out.println(emp2);
	}
}
