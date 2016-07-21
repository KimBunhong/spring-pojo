package com.employee.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository
public interface EmployeeRepository {

	
	@Delete("DELETE FROM employee WHERE id=#{id}")
	boolean remove(int id);
	
	@Insert("INSERT INTO employee(name, gender, email) VALUES(#{name},#{gender},#{email})")
	boolean save(Employee employee);
	
	
	boolean update(Employee employee);
	
	@Select("SELECT id,name,gender,email FROM employee")
	@Results({
		@Result(property="id",column="id"),
		@Result(property="name",column="name"),
		@Result(property="gender",column="gender"),
		@Result(property="email",column="email")
	})
	ArrayList<Employee> findAll();
	
	
	@Select("SELECT id,name,gender,email FROM employee WHERE id=#{id}")
	@Results({
		@Result(property="id",column="id")
	})
	Employee findOne();
	
	
}
