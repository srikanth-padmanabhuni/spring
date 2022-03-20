package com.presidio.spring.springadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollections {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springadvanced/standalone/collections/standaloneCollectionsConfig.xml");
		ProductsList productsList = (ProductsList) context.getBean("productsListBean");
		System.out.println(productsList);
	}

}
