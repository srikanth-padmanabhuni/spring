package com.presidio.spring.springjdbc.employee.dao;

import java.util.List;

import com.presidio.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {

	int insertEmployee(Employee employee);
	
	int updateEmployee(Employee employee);
	
	int deleteEmployee(int employeeId);
	
	Employee findEmployeeById(int id);
	
	List<Employee> getEmployees();
}
