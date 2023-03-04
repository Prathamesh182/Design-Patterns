package com.aurionpro.model;

public class TataFactory implements ICarFactory {
private static TataFactory tatafactory;
	
	private TataFactory() {
		
	}
	public static TataFactory getInstance() {
		if (tatafactory == null) {
			tatafactory = new TataFactory();
		}
		return tatafactory;
	}

	@Override
	public ICars makeCar() {
		
		return new Tata();
	}

}
