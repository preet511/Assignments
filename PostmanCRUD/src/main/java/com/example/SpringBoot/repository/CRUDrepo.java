package com.example.SpringBoot.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.SpringBoot.model.Employee;

public interface CRUDrepo extends CrudRepository<Employee, Integer>{

}
