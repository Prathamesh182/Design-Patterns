package com.aurionpro.model;

public class Consultant2 implements IRole {

	@Override
	public String description() {
		return "I am A Consultant";
	}

	@Override
	public String responsibilty() {
		return "I Writes the Code";
	}

	@Override
	public String toString() {
		return "Consultant" ;
	}

}
