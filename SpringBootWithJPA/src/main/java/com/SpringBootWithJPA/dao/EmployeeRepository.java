package com.SpringBootWithJPA.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.SpringBootWithJPA.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> 
{
	public Employee findByEmpId(int empId);
	
	public Employee findByEmpName(String empName);
	
	public List<Employee> findAll();
	
	public Employee deleteByEmpId(int empId);

}
