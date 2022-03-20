package com.presidio.spring.springcore.propertyPlaceHolder;

public class PropertiesDAO {

	private String dbServer;
	private String dbUser;
	private String dbPassword;
	private String dbPort;
	
	public PropertiesDAO(String server, String user, String password, String port) {
		this.dbServer = server;
		this.dbUser = user;
		this.dbPassword = password;
		this.dbPort = port;
	}

	@Override
	public String toString() {
		return "PropertiesDAO [dbServer=" + dbServer + ", dbUser=" + dbUser + ", dbPassword=" + dbPassword + ", dbPort="
				+ dbPort + "]";
	}
	
	
}
