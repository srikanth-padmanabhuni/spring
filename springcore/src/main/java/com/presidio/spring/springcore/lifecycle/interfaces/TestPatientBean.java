package com.presidio.spring.springcore.lifecycle.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPatientBean {

	public static void main(String[] args) {
		
		// Using applicationContext since we placed our listConfig.xml inside a package instead of 
		// under class path (i.e src/main/java root folder)
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springcore/lifecycle/interfaces/interfacesConfig.xml");
		Patient patient = (Patient) context.getBean("patientBean");
		System.out.println(patient.getId());
		System.out.println(patient.getName());
		
		// ApplicationContext doesnt have resgisterDestroy hook so we use AbstractApplicationContext
		// This register shut down hook invokes the destroy method of bean while spring is shut downig the beans
		context.registerShutdownHook();
	}
}
