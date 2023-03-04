package com.aurionpro.model;

public class SMSNotifier implements INotifier {
	private static SMSNotifier instance;//singleton created for getting only one notifier
	
	private SMSNotifier() {
	}
	
	public static SMSNotifier getInstance() {
		if(instance==null) {
			instance= new SMSNotifier();
		}
		return instance;
	}
	@Override
	public void notifyUser(Account account, double amount, String TransactionType) {
		System.out.println("Sending notification in SMS ");
		System.out.println("The amount :  " + amount);
		System.out.println("The Transaction Type is: " + TransactionType);
		System.out.println("--------------------------------------------------------------");
	}
}
