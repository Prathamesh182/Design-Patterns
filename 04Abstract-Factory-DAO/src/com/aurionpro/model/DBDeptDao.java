package com.aurionpro.model;

public class DBDeptDao implements IDao {

	@Override
	public void save() {
		System.out.println("Dept saved in DB");
	}

}
