package com.aurionpro.test;

import com.aurionpro.model.HotelReception;

public class ClientTest {

	public static void main(String[] args) {
		System.out.println("Welcome to our Hotel..\n The Menu's are Displayed below\n");
		
		
		HotelReception obj = new HotelReception();
		System.out.println("The Indian Menu:");
		obj.getIndianMenu();
		System.out.println();
		
		HotelReception obj2 = new HotelReception();
		System.out.println("The Italian Menu:");
		obj2.getChineseMenu();
		System.out.println();
		
		HotelReception obj3 = new HotelReception();
		System.out.println("The Chinese Menu:");
		obj3.getItalianMenu();
	}

}
