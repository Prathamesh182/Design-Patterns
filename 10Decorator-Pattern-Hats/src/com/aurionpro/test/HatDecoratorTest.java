package com.aurionpro.test;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.IHat;
import com.aurionpro.model.PremiumHat;
import com.aurionpro.model.RibbonHat;
import com.aurionpro.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		IHat hat = new StandardHat();
		IHat hat1 = new PremiumHat();
		GoldenHat goldenhat = new GoldenHat(hat);
		GoldenHat goldenhat1 = new GoldenHat(hat1);
		RibbonHat ribbonhat = new RibbonHat(goldenhat);
		RibbonHat ribbonhat1 = new RibbonHat(goldenhat1);
		
		System.out.println(ribbonhat.getName());
		System.out.println(ribbonhat.getPrice());
		System.out.println(ribbonhat1.getName());
		System.out.println(ribbonhat1.getPrice());
		System.out.println("---------------------------------------------");
		System.out.println(goldenhat.getName());
		System.out.println(goldenhat.getPrice());
		System.out.println(goldenhat1.getName());
		System.out.println(goldenhat1.getPrice());
	}

}
