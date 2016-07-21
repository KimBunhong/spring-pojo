package com.employee.service.implement;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;


@Service
public class EmployeeServiceImplement implements EmployeeService{

	
	
	
	@Override
	public boolean remove(int id) {
		
		return false;
	}

	@Override
	public boolean save(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
