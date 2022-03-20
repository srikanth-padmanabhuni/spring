package com.presidio.spring.springadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("orderDao2")
public class OrderDAOImpl2 implements OrderDAO {

	/**
	 * It actually creates the order and place it in DB
	 */
	@Override
	public void createOrder() {
		System.out.println("Create Order from impl2");
	}

}
