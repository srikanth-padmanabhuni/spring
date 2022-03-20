package com.presidio.spring.springadvanced.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInjectionBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springadvanced/autowiring/annotations/autoWiringConfig.xml");
		Employee emp = (Employee) context.getBean("employeeBean");
		System.out.println(emp);
		
	}
}
