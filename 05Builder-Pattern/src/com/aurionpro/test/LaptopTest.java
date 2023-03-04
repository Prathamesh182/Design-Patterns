package com.aurionpro.test;

import com.aurionpro.model.Laptop;
import com.aurionpro.model.Laptopbuilder;

public class LaptopTest {

	

	public static void main(String[] args) {
		Laptopbuilder builder = new Laptopbuilder();
		Laptop laptop = builder.addhdd("Kingston").addKeyboard("Iball").addmouse("Logitech").addram("Ryzen").addtouchscreen(true).build();
		System.out.println(laptop);
	}

}
