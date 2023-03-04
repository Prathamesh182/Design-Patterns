package com.aurionpro.model;

public class MarutiFactory implements ICarFactory {
	private static MarutiFactory marutifactory;
	
	private MarutiFactory() {
		
	}
	public static MarutiFactory getInstance() {
		if (marutifactory == null) {
			marutifactory = new MarutiFactory();
		}
		return marutifactory;
	}

	@Override
	public ICars makeCar() {
		
		return new Maruti();
	}
	

}
