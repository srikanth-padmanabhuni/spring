package com.presidio.spring.springadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// This annotation helps in creating bean to it automatically for self use or for any class which is depended on it
@Component
public class Institution {

	@Value("Bhashyam Educational Institutions")
	private String name;
	
	@Value("Zilla Parishat Road,\nMachilipatnam,\nAndhra Pradesh\n,521001")
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Institution [name=" + name + ", address=" + address + "]";
	}

}
