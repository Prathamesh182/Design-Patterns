package com.aurionpro.model;

public class TechLead implements IRole {

	@Override
	public String description() {
		return "I am A TechLead";
	}

	@Override
	public String responsibilty() {
		return "I Assign The Work";
	}

	@Override
	public String toString() {
		return "TechLead" ;
	}
}
