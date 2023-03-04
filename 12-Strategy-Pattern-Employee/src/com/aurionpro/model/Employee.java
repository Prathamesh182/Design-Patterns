package com.aurionpro.model;

public class Employee {
	private int id;
	private String name;
	private IRole role;
	public Employee(int id, String name, IRole role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	IRole promote(IRole role){
		return this.role=role;
	}
	
	public String getDescription() {
		return role.description();
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}

	public String getResponsibilty() {
		return role.responsibilty();
	}
}
