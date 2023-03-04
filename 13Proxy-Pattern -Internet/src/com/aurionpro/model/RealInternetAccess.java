package com.aurionpro.model;

public class RealInternetAccess implements IOfficeInternet {
	private String employeeName;

	public RealInternetAccess(String employeeName) {
		super();
		this.employeeName = employeeName;
		loadfromdata(employeeName);
	}

	public RealInternetAccess() {
	}

	@Override
	public String grantInternetAccess() {
		return employeeName + "Can use the office Internet";
	}

	public void loadfromdata(String empName) {
		System.out.println("loadFromData" + empName);

	}

}
