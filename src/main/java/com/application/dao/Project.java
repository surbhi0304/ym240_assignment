package com.application.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project_record")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer pid;

	private String projectName;
	private Date startDate;
	private String managerName;

	public Project() {
	}

	public Project(String projectName, Date startDate, String managerName) {
		super();
		this.projectName = projectName;
		this.startDate = startDate;
		this.managerName = managerName;
	}

	public Project(int pid, String projectName, Date startDate, String managerName) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.startDate = startDate;
		this.managerName = managerName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Project [projectName=");
		builder.append(projectName);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", managerName=");
		builder.append(managerName);
		builder.append("]");
		return builder.toString();
	}

}
