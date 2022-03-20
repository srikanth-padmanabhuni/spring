package com.presidio.spring.springadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotypeAnnotations {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springadvanced/stereotype/annotations/stereotypeAnnotationsConfig.xml");
		Teacher teacher = (Teacher) context.getBean("teacher"); // By Default internally spring creates bean with bean name as class name with camel case nomenculture unless we provide name as attribute for component annotation in class
		System.out.println(teacher); // Spring creates object and injects default values for variables in it
	
		// Checking for singleton
		Teacher teacher1 = (Teacher) context.getBean("teacher");
		Teacher teacher2 = (Teacher) context.getBean("teacher");
		
		boolean isSingleton = teacher1.hashCode() == teacher2.hashCode();
		System.out.println(isSingleton); // yes internally spring creates beans with singleton type if @Scope is not defined on Class
	}

}
