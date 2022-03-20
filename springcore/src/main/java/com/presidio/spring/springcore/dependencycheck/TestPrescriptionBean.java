package com.presidio.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrescriptionBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springcore/dependencycheck/dependencyCheckConfig.xml");
		Prescription p = (Prescription) context.getBean("prescriptionBean");
		System.out.println(p.toString());
	}
}
