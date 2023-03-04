package com.aurionpro.model;

public abstract class CarServiceDecorator implements ICarService{
	private ICarService carobj;

	public CarServiceDecorator(ICarService carobj) {
		this.carobj = carobj;
	}
	@Override 
	public double getCost() {
		return carobj.getCost();
	}
	

}
