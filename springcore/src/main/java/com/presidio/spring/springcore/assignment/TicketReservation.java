package com.presidio.spring.springcore.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	@PostConstruct
	public void initialize() {
		System.out.println("initialize() method");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("cleanUp() method");
	}
}
