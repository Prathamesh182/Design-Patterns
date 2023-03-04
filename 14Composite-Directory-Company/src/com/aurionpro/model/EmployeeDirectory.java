package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements IEmployee {

	private List<IEmployee> employees;

	public EmployeeDirectory() {

		this.employees = new ArrayList<>();
	}

	public void AddEmployee(IEmployee employee) {
		employees.add(employee);

	}

	@Override
	public void showEmployeeDetails() {
	   for(IEmployee x: employees) {
		   System.out.println(x);
	   }
	   
	}

	@Override
	public String toString() {
		return "EmployeeDirectory \n[employees=" + employees + "\n]";
	}

//	public void removeEmployee(IEmployee emp) {
//		for(IEmployee r:employees) {
//			r.showEmployeeDetails();
//		}
//	}

	//@Override
//	public void showEmployeeDetails() {
//		for(IEmployee x: employees) {
//			System.out.println(x);
//
//	}

}
