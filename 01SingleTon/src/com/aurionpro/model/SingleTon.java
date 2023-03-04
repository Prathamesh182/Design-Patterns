package com.aurionpro.model;

public class SingleTon {
	private static SingleTon singleton;

	private SingleTon() {

	}

	public static SingleTon getInstance() {
		if (singleton == null) {
			singleton = new SingleTon();
		}
		return singleton;
	}

}
