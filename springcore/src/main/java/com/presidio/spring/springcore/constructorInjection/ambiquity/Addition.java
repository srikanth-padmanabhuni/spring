package com.presidio.spring.springcore.constructorInjection.ambiquity;

public class Addition {

	Addition(Double a, Double b) {
		System.out.println("Inside Addition of double type");
	}
	
	Addition(int a, int b) {
		System.out.println("Inside addition of int types");
	}
	
	Addition(String a, String b) {
		System.out.println("Inside addition of String types");
	}
	
}
