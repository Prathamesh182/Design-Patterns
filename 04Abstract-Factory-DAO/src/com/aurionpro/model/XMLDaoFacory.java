package com.aurionpro.model;

public class XMLDaoFacory implements IDaoAbstractfactory {

	@Override
	public IDao createDao(String type) {
		if(type.equalsIgnoreCase("Employee")) {
			return new XMLEmpDao();
		}
		if(type.equalsIgnoreCase("Department")) {
			return new XMLDeptDao();
		}
		return null;
		
	}

}
