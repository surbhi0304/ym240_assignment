package com.application.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_record")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer eid;
	private String name;
	private double salary;
	private Department department;
	private List<Project> Projects = new ArrayList<>();

	public Employee() {

	}

	public Employee(String name, double salary, Department department, List<Project> projects) {

		this.name = name;
		this.salary = salary;
		this.department = department;
		Projects = projects;
	}

	public Employee(int eid, String name, double salary, Department department, List<Project> projects) {

		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.department = department;
		Projects = projects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Project> getProjects() {
		return Projects;
	}

	public void setProjects(List<Project> projects) {
		Projects = projects;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [eid=");
		builder.append(eid);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", department=");
		builder.append(department);
		builder.append(", Projects=");
		builder.append(Projects);
		builder.append("]");
		return builder.toString();
	}

}
