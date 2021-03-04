package com.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.dao.Employee;

 
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}

 
