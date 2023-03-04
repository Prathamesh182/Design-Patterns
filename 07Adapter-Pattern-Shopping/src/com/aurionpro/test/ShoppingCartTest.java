package com.aurionpro.test;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart= new ShoppingCart();
		cart.addItemtoCart(new Biscuit("Parle-G",20));
		Hat hat =new Hat("RedHat","Beautiful",200,10);
		cart.addItemtoCart(new HatAdapter(hat));
		
		System.out.println(hat.getShortName());
		System.out.println(hat.getLongName());
		System.out.println("Total: "+cart.getCartPrice());
		System.out.println("Remaining Items: "+cart.getCartItems());
		//System.out.println(cart);
		
	}

}
