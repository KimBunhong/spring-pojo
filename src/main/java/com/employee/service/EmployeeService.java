package com.employee.service;

import java.util.ArrayList;

import com.employee.entity.Employee;

public interface EmployeeService {

	/***
	 * 
	 * @param id
	 * @return
	 */
	
	boolean remove (int id);
	
	boolean save(Employee employee);
	
	boolean update(Employee employee);
	
	ArrayList<Employee> findAll();
	
	Employee findOne(int id);
	
}
