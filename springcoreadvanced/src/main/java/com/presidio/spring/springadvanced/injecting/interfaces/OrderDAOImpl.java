package com.presidio.spring.springadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("orderDao1")
public class OrderDAOImpl implements OrderDAO {

	/**
	 * It actually creates the order and place it in DB
	 */
	@Override
	public void createOrder() {
		System.out.println("Create Order");
	}

}
