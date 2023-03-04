package com.aurionpro.model;

public class DBEmpDao implements IDao {

	@Override
	public void save() {
		System.out.println("Emp saved in DB");
	}

}
