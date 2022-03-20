package com.presidio.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentBean {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springcore/reftypes/refTypesConfig.xml");
		Student student = (Student) context.getBean("studentBean");
		System.out.println(student.getName());
		
		Scores scores = student.getScores();
		System.out.println("Maths: " + scores.getMaths());
		System.out.println("Physics : " + scores.getPhysics());
		System.out.println("Chemistry : " + scores.getChemistry());
	}
	
}
