package com.presidio.spring.springadvanced.standalone.collections;

import java.util.List;

public class ProductsList {

	private List<String> products;

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "ProductsList [products=" + products + "]";
	}

}
