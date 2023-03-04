package com.aurionpro.model;

public class Manager implements IEmployee {
	private String name;
	private String Position;

	public Manager(String name, String position) {
		super();
		this.name = name;
		this.Position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(name);
		
	}

	@Override
	public String toString() {
		return "\nManager [name=" + name + ", Position=" + Position + "]";
	}
	
	

}
