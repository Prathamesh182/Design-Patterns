package com.aurionpro.model;

public class MahindraFactory implements ICarFactory {
private static MahindraFactory mahindrafactory;
	
	private MahindraFactory() {
		
	}
	public static MahindraFactory getInstance() {
		if (mahindrafactory == null) {
			mahindrafactory = new MahindraFactory();
		}
		return mahindrafactory;
	}

	@Override
	public ICars makeCar() {
		
		return new Mahindra();
	}

}
