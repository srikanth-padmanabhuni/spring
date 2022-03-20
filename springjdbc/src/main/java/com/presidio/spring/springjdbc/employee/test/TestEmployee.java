package com.presidio.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.presidio.spring.springjdbc.employee.dao.EmployeeDao;
import com.presidio.spring.springjdbc.employee.dto.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/presidio/spring/springjdbc/employee/test/employeeJdbcConfig.xml");
		EmployeeDao emloyeeDao = (EmployeeDao) context.getBean("employeeDao");
		List<Employee> result = emloyeeDao.getEmployees();
		for(Employee emp : result) {
			System.out.println(emp);
		}
	}
}
