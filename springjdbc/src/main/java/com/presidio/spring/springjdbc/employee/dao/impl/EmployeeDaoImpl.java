package com.presidio.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.presidio.spring.springjdbc.employee.dao.EmployeeDao;
import com.presidio.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.presidio.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertEmployee(Employee employee) {
		String sql = "insert into employee values(?, ?, ?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		System.out.println("Number of records inserted : " + result);
		return result;
	}

	@Override
	public int updateEmployee(Employee employee) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		System.out.println("Number of records updated : " + result);
		return result;
	}

	@Override
	public int deleteEmployee(int employeeId) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql, employeeId);
		System.out.println("Number of records deleted : " + result);
		return result;
	}

	@Override
	public Employee findEmployeeById(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return employee;
	}

	@Override
	public List<Employee> getEmployees() {
		String sql = "select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> employeesList = jdbcTemplate.query(sql, rowMapper);
		return employeesList;
	}

}
