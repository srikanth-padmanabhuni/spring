package com.presidio.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountryNdLanguagesBean {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springcore/properties/propertiesConfig.xml");
		CountryNdLanguages cl = (CountryNdLanguages) context.getBean("countryNdLanguagesBean");
		System.out.println(cl.getCountryNdLangs());
		
		// Properties is type
		System.out.println(cl.getCountryNdLangs().getClass().getName());
	}
}
