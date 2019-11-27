package com.SpringBootWithJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootWithJPA.dao.EmployeeRepository;
import com.SpringBootWithJPA.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		
		return employee;
	}

	@Override
	public Employee readEmployeeById(int empId) {
		
		return this.employeeRepository.findByEmpId(empId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		this.employeeRepository.save(employee);
		return employee;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		
		return this.employeeRepository.deleteByEmpId(empId);
	}
	
	@Override
	public List<Employee> getAllEmployee(){
		
		return this.employeeRepository.findAll();
	}
	@Override
	public Employee readEmployeeByName(String empName){
		
		return this.employeeRepository.findByEmpName(empName);
		
	}

}
