package com.aurionpro.test;

import com.aurionpro.model.SingleTon;

public class SingletonTest {

	public static void main(String[] args) {
		SingleTon obj= SingleTon.getInstance();
		SingleTon obj2=SingleTon.getInstance();
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
	}

}
