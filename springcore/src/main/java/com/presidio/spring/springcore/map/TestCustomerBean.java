package com.presidio.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomerBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springcore/map/mapConfig.xml");
		Customer customer = (Customer) context.getBean("customerBean");
		System.out.println(customer.getId());
		System.out.println(customer.getProducts());
		
		// Default type of Map is LinkedHashMap
		System.out.println(customer.getProducts().getClass().getName());
	}

}
