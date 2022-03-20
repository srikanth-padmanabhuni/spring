package com.presidio.spring.springcore.constructorInjection.ambiquity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAmbiquityBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springcore/constructorInjection/ambiquity/constructionInjectionConfig.xml");
	}

}
