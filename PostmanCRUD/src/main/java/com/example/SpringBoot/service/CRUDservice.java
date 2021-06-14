package com.example.SpringBoot.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.repository.CRUDrepo;
import com.example.SpringBoot.model.Employee;

@Service
public class CRUDservice {

	@Autowired
	private CRUDrepo crudRepo;
	
	public List<Employee> getAllEmployees(){
		List<Employee> emp = new ArrayList<Employee>();
		crudRepo.findAll().forEach(abc -> emp.add(abc));
		return emp;
	}
	
	public Employee getEmployeeById(int id) {
		return crudRepo.findById(id).get();
	}
	
	public void addEmployee(Employee obj) {
		crudRepo.save(obj);
	}
	
	public void deleteEmployee(int id) {
		crudRepo.deleteById(id);
	}
	
	public void deleteAllEmployees() {
		crudRepo.deleteAll();
	}
	
	public void updateEmployee(Employee obj) {
		crudRepo.save(obj);
	}
}
