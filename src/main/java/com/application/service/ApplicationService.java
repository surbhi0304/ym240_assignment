package com.application.service;

import com.application.dao.*;


public interface ApplicationService {
	public Iterable<Department> getAllDepartments();

	public Department getDepartmentByName(String dname);

	public Iterable<Employee> getAllEmployeesDep(String dname);

	public Iterable<Project> getProjectByEmployee(String name);
}