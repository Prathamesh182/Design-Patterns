package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<IItems> cartItems;

	public ShoppingCart() {
		super();

		this.cartItems = new ArrayList<IItems>();

	}

	public void addItemtoCart(IItems item) {
		cartItems.add(item);

	}

	public List<IItems> getCartItems() {
		return cartItems;

	}

	public double getCartPrice() {
		double total = 0;
		for (IItems x : cartItems) {
			total += x.getItemPrice();
		}
		return total;
	}

	@Override
	public String toString() {
		return "ShoppingCart [cartItems=" + cartItems + "]";
	}

}
