package com.presidio.spring.springadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInterfaceInjectionBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springadvanced/injecting/interfaces/injectingInterfacesConfig.xml");
		OrderBO orderBo = (OrderBO) context.getBean("orderBoBean");
		orderBo.placeOrder();
	}
}
