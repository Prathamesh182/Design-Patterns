package com.aurionpro.model;

public class Laptopbuilder {
	private Laptop laptop;

	public Laptopbuilder() {
		super();
		this.laptop = new Laptop();
	}
	
	

	public Laptopbuilder addram(String ram) {
		laptop.setRam(ram);
		return this;
	}
	
	public Laptopbuilder addhdd(String hdd) {
		laptop.setHdd(hdd);
		return this;
	}
	
	public Laptopbuilder addKeyboard(String Keyboard) {
		laptop.setKeyboard(Keyboard);
		return this;
	}
	
	public Laptopbuilder addmouse(String mouse) {
		laptop.setMouse(mouse);
		return this;
	}
	
	public Laptopbuilder addtouchscreen(boolean touchscreen) {
		laptop.setTouchscreen(touchscreen);
		return this;
	}
	
	public Laptop build() {
		return 	laptop;
	}
	
//	@Override
//	public String toString() {
//		return "Laptopbuilder [laptop=" + laptop + "]";
//	}
}
