package com.aurionpro.model;

public class ProxyInternetAccess implements IOfficeInternet {
	private String employeeName;
	private RealInternetAccess realinternetaccess;

	public ProxyInternetAccess(String empName) {
		this.employeeName = empName;

	}

	@Override
	public String grantInternetAccess() {
		if(realinternetaccess==null) {
			realinternetaccess= new RealInternetAccess();
			
		}
		return employeeName;
	}

}
