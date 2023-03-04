package com.aurionpro.model;

public class HatDecorator implements IHat {
	private IHat hat;

	public HatDecorator(IHat hat) {
		super();
		this.hat = hat;

	}

	@Override
	public String getName() {
		return hat.getName();
	}

	@Override
	public double getPrice() {
		return hat.getPrice();
	}

	@Override
	public String getDescription() {
		return hat.getDescription();
	}

}
