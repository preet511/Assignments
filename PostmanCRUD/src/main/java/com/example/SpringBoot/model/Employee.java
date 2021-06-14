package com.example.SpringBoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@Column
	private int empId;
	@Column
	private String empName;
	@Column
	private String empRole;
	@Column
	private int empSalary;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpRole(String role) {
		this.empRole = role;
	}
	
	public String getEmpRole() {
		return empRole;
	}
	
	public void setEmpSalary(int salary) {
		this.empSalary = salary;
	}
	
	public int getEmpSalary() {
		return empSalary;
	}
	
	@Override
    public String toString() {
        String op = "{ " +  this.getEmpId() + ", " + this.getEmpName() + ", " + this.getEmpRole() + ", " + this.getEmpSalary() + " }";
        return op;
    }
}
