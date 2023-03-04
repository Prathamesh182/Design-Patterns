package com.aurionpro.test;

import com.aurionpro.model.Consultant2;
import com.aurionpro.model.Employee;
import com.aurionpro.model.SeniorConsultant;
import com.aurionpro.model.TechLead;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee(101,"Karan",new Consultant2());
		System.out.println(emp);
		System.out.println(emp.getDescription());
		System.out.println(emp.getResponsibilty());
		System.out.println("----------------------------------------------------");
		
		Employee emp1 = new Employee(102,"Arjun",new SeniorConsultant());
		System.out.println(emp1);
		System.out.println(emp1.getDescription());
		System.out.println(emp1.getResponsibilty());
		System.out.println("----------------------------------------------------");
		
		Employee emp2 = new Employee(103,"Krishna",new TechLead());
		System.out.println(emp2);
		System.out.println(emp2.getDescription());
		System.out.println(emp2.getResponsibilty());
	}
	
	

}
