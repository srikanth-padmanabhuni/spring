package com.presidio.spring.springcore.propertyPlaceHolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPropertyPlaceHolder {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springcore/propertyPlaceHolder/propertiesPlaceHolderConfig.xml");
		PropertiesDAO propertiesDao = (PropertiesDAO) context.getBean("propertiesDAOBean");
		System.out.println(propertiesDao);
	}
}
