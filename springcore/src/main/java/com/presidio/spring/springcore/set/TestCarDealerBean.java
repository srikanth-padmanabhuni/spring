package com.presidio.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarDealerBean {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springcore/set/setConfig.xml");
		CarDealer carDealer = (CarDealer) context.getBean("carDealerBean");
		System.out.println(carDealer.getName());
		System.out.println(carDealer.getModels());
		
		// Default set type is LinkedHashSet
		System.out.println(carDealer.getModels().getClass());
		System.out.println(carDealer.getModels().getClass().getName());
	}

}
