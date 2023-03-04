package com.aurionpro.test;

import com.aurionpro.model.CarFactory;
import com.aurionpro.model.CarType;
import com.aurionpro.model.ICars;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		ICars maruti = factory.getCarInstance(CarType.Maruti);
		maruti.start();
		maruti.stop();
		System.out.println();
		
		ICars tata = factory.getCarInstance(CarType.Tata);
		tata.start();
		tata.stop();
		System.out.println();
		
		ICars mahindra = factory.getCarInstance(CarType.Mahindra);
		mahindra.start();
		mahindra.stop();
		System.out.println();
		
		
	}

}
