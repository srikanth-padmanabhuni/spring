package com.presidio.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbc {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springjdbc/jdbcConfig.xml");
		
		// get the jdbc template and perform db operations
		// By this way we have get rid of writing code for all connection stuff 
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplateBean");
		String sql = "insert into employee values(?, ?, ?)";
		int result = template.update(sql, new Integer(1000), "Srikanth", "Padmanabhuni");
		System.out.println("Number of records inserted : " + result);
	}

}
