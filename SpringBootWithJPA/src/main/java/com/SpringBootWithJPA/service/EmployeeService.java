package com.SpringBootWithJPA.service;

import java.util.List;

import com.SpringBootWithJPA.model.Employee;

public interface EmployeeService 
{
	public Employee createEmployee(Employee employee);
	public Employee readEmployeeById(int empId);
	public Employee updateEmployee(Employee employee);
	public Employee deleteEmployeeById(int empId);
	public Employee readEmployeeByName(String empName);
	public List<Employee> getAllEmployee();

}
