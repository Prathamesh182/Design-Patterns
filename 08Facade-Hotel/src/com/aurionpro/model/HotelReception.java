package com.aurionpro.model;

public class HotelReception {
	public void getIndianMenu() {
		IHotel indHotel = new IndianHotel();
		IMenu menu = indHotel.getMenu();
		menu.displayMenu();
	}
	
	public void getItalianMenu() {
		IHotel itlHotel = new ItalianHotel();
		IMenu menu = itlHotel.getMenu();
		menu.displayMenu();
	}
	
	public void getChineseMenu() {
		IHotel chiHotel = new ChineseHotel();
		IMenu menu = chiHotel.getMenu();
		menu.displayMenu();
	}

}
