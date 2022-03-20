package com.presidio.spring.springcore.assignment;

import java.util.List;

public class ShoppingCart {

	private String customerName;
	private List<Items> items;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

}
