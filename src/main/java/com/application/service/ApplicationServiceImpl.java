package com.application.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.application.dao.Department;
import com.application.dao.Employee;
import com.application.dao.Project;
import com.application.repository.DepartmentRepository;
import com.application.repository.EmployeeRepository;
import com.application.repository.ProjectRepository;

public class ApplicationServiceImpl implements ApplicationService{
	private DepartmentRepository depRepo;
	private EmployeeRepository empRepo;
	private ProjectRepository proRepo;

	@Autowired
    public ApplicationServiceImpl(DepartmentRepository depRepo, EmployeeRepository empRepo,ProjectRepository proRepo) {
        this.depRepo = depRepo;
        this.empRepo = empRepo;
        this.proRepo = proRepo;
    }

//	@Override
	public Iterable<Department> getAllDepartments() {
		System.out.println("---------getAllDepartments is called--");
		return depRepo.findAll();

	}

//	@Override
	public Department getDepartmentByName(String dname) {
		return null;
				
	}

	@Override
	public Iterable<Employee> getAllEmployeesDep(String dname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Project> getProjectByEmployee(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}