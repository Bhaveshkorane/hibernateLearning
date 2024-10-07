package com.map1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Project {
	
	
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Id
	private int pid;
	
	@Column(name="project_name")
	private String name;
	
	
	@ManyToMany(mappedBy="projects")
	private List<Employee> employees;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int pid, String name, List<Employee> employees) {
		super();
		this.pid = pid;
		this.name = name;
		this.employees = employees;
	}
	
	
	
	

}
