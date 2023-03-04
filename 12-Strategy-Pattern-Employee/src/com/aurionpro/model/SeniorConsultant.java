package com.aurionpro.model;

public class SeniorConsultant implements IRole {

	@Override
	public String description() {
		return "I am A Senior Consultant";
	}

	@Override
	public String responsibilty() {
		return "I Review the Code";
	}

	@Override
	public String toString() {
		return "Senior Consultant" ;
	}
}
