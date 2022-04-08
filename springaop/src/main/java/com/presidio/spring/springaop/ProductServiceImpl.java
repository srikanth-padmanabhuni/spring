package com.presidio.spring.springaop;

public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int a, int b) {
		return (a*b);
	}

}
