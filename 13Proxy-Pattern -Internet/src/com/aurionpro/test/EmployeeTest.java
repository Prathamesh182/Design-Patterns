package com.aurionpro.test;

import com.aurionpro.model.IOfficeInternet;
import com.aurionpro.model.ProxyInternetAccess;
import com.aurionpro.model.RealInternetAccess;

public class EmployeeTest {

	public static void main(String[] args) {
		IOfficeInternet ip = new ProxyInternetAccess("Ram:");
		System.out.println(ip.grantInternetAccess());
		
		
		
		
	}

}
