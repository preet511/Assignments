package com.example.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.SpringBoot.model.Employee;
import com.example.SpringBoot.service.CRUDservice;

@RestController
public class CRUDcontroller {
	
	@Autowired
	private CRUDservice serv;
	
	@GetMapping("/emp")
	private List<Employee> getEmployees(){
		return serv.getAllEmployees();
	}
	
	@GetMapping("/emp/{empid}")
	private Employee getEmployee(@PathVariable("empid") int empid) {
		return serv.getEmployeeById(empid);
	}
	
	@DeleteMapping("/emp/{empid}")
	private String del(@PathVariable("empid") int empid) {
		serv.deleteEmployee(empid);
		return "Employee with " + empid + " is deleted";
	}
	
	@DeleteMapping("/emp")
	private String delAll() {
		serv.deleteAllEmployees();
		return "All employee details deleted";
	}
	
	@PostMapping("/emp")
	private Employee addEmployee(@RequestBody Employee obj) {
		serv.addEmployee(obj);
		return obj;
	}
	
	@PutMapping("/emp/{empid}")
	private Employee update(@RequestBody Employee obj, @PathVariable("empid") int empid) {
		if(obj.getEmpId() == empid) {
			serv.updateEmployee(obj);
			return serv.getEmployeeById(empid);
		}
		return null;
	}
}
