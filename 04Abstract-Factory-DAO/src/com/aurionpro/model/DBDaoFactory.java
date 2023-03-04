package com.aurionpro.model;

public class DBDaoFactory implements IDaoAbstractfactory {

	@Override
	public IDao createDao(String type) {
		if(type.equalsIgnoreCase("Employee")) {
			return new DBEmpDao();
		}
		if(type.equalsIgnoreCase("Department")) {
			return new DBDeptDao();
		}
		return null;
	}

}
