package com.presidio.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospitalBean {

	public static void main(String[] args) {
		
		// Using applicationContext since we placed our listConfig.xml inside a package instead of 
		// under class path (i.e src/main/java root folder)
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springcore/list/listConfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospitalBean");
		System.out.println(hospital.getName());
		System.out.println(hospital.getDepartments().toString());
		
		// By default bean creates Array List
		System.out.println("Type of list created by bean : " + hospital.getDepartments().getClass());
	}

}
