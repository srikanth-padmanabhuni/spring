package com.presidio.spring.springcore.assignment;

public class ClientProperties {

	private String url;
	private String userName;
	private String password;
	
	public ClientProperties(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "ClientProperties [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
}
