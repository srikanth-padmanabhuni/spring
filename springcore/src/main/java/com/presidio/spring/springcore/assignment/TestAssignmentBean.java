package com.presidio.spring.springcore.assignment;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssignmentBean {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/presidio/spring/springcore/assignment/assignmentConfig.xml");;
		
		// Basics of Sping core
		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCartBean");
		System.out.println(cart.getCustomerName());
		
		// Array List
		System.out.println(cart.getItems().getClass().getName());
		
		System.out.println("Items in Cart :");
		List<Items> items = cart.getItems();
		for(Items item : items) {
			System.out.println("********************************************");
			System.out.println("Id : " + item.getId());
			System.out.println("Name : " + item.getName());
			System.out.println("Price : " + item.getPrice());
			System.out.println("Quantity : " + item.getQuantity());
			System.out.println("********************************************");
		}
		
		// Lifecycle of beans
		context.registerShutdownHook();
		
		// Dependency Check
		University u1 = (University) context.getBean("universityBean");
		System.out.println(u1);
		
		University u2 = (University) context.getBean("universityBean");
		System.out.println(u2);
		
		boolean isSingletonSocpe = ((u1.hashCode()) == (u2.hashCode()));
		System.out.println("Is Singleton Scope ; " + isSingletonSocpe);
		
		// Property Place Holder
		ClientProperties clientProperties = (ClientProperties) context.getBean("clientPropertiesBean");
		System.out.println(clientProperties);
	}
}
