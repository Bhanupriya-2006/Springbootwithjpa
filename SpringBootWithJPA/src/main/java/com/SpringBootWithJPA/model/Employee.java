package com.SpringBootWithJPA.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee1")
public class Employee implements Serializable {
	
	
	@Id
	@Column(name="id",length=5)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Column(name="name",length=25)
	private String empName;
	@Column(name="salary",length=25)
	private float salary;

}
