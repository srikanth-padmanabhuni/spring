package com.presidio.spring.javaconfig.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		/*
		 * OR
		 * 
		 * AnnotationConfigApplicationContext context = new
		 * AnnotationConfigApplicationContext(); context.register(SpringConfig.class);
		 * 
		 * This method of creating context helps in registering the configuration files
		 * as many as config files we have
		 */

//		Dao dao = context.getBean(Dao.class);
//		dao.create();
		
		Service service1 = context.getBean(Service.class);
		service1.save();
		
		Service service2 = context.getBean(Service.class);
		service2.save();
		
		boolean areEqual = service1.hashCode() == service2.hashCode();
		System.out.println("Is bean scope singleton : " + areEqual);
		
		
		context.close(); // Helps to display the output of destroy lifecycle methods of beans

	}

}
