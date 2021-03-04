package com.application.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department_record")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer did;
	private String dname;
	private List<Employee> employees = new ArrayList<>();

	public Department() {
	}

	public Department(String dname, List<Employee> employees) {

		this.dname = dname;
		this.employees = employees;
	}

	public Department(int did, String dname, List<Employee> employees) {

		this.did = did;
		this.dname = dname;
		this.employees = employees;
	}

	public int getDid() {
		return did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Department [did=");
		builder.append(did);
		builder.append(", dname=");
		builder.append(dname);
		builder.append("]");
		return builder.toString();
	}

}
