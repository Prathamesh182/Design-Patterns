package com.aurionpro.model;

public class RibbonHat extends HatDecorator {

	public RibbonHat(IHat hat) {
		super(hat);
	}
	
	@Override
	public String getName() {
		return "Ribbon"+super.getName();
	}

	@Override
	public double getPrice() {
		return 50+super.getPrice();
	}

}
