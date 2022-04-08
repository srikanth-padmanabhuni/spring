package com.presidio.springaop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.presidio.spring.springaop.ProductService;

public class Test {
	public static void main(String[] args) {
		// Creating the Classpath xml context since the config xml is placed under src/main/java directory
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/springaop/test/config.xml");
		
		ProductService productService = (ProductService) context.getBean("productServiceBean");
		int product = productService.multiply(5, 10);
		System.out.println("Product is : "+product);
	}
}
