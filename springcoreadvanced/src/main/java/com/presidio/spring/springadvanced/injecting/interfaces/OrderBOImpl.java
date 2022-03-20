package com.presidio.spring.springadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("orderBoBean")
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("orderDao2")
	OrderDAO orderDao;
	
	
	public OrderDAO getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDAO orderDao) {
		this.orderDao = orderDao;
	}


	/**
	 * It places a dummy order to us and saves in DB.
	 * This method doesnt take any Input and doesnt return any Output as well
	 */
	@Override
	public void placeOrder() {
		System.out.println("inside order BO");
		this.orderDao.createOrder();
	}

}
