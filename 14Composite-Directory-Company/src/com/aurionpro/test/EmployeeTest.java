package com.aurionpro.test;

import com.aurionpro.model.Developer;
import com.aurionpro.model.EmployeeDirectory;
import com.aurionpro.model.IEmployee;
import com.aurionpro.model.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
		IEmployee dev1 = new Developer("Suyash","Junior Developer");
		IEmployee dev2 = new Developer("Mahesh","Senior Developer");
		
		EmployeeDirectory devDirectory = new EmployeeDirectory();
		devDirectory.AddEmployee(dev1);
		devDirectory.AddEmployee(dev2);
		
		IEmployee man1 = new Manager("Dilip","DotNet Developer");
		IEmployee man2 = new Manager("Dinesh","AWS Developer");
		
		EmployeeDirectory manDirectory = new EmployeeDirectory();
		manDirectory.AddEmployee(man1);
		manDirectory.AddEmployee(man2);
		
		EmployeeDirectory companyDirectory= new EmployeeDirectory();
		companyDirectory.AddEmployee(devDirectory);
		companyDirectory.AddEmployee(manDirectory);
		
		companyDirectory.showEmployeeDetails();
		
	}

}
