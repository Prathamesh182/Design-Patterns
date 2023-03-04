package com.aurionpro.model;

public class WhatsappNotifier implements INotifier {
	private static WhatsappNotifier notifier;
	
	private WhatsappNotifier() {
	}

	public static WhatsappNotifier getInstance() {
		if(notifier==null) {
			notifier=new WhatsappNotifier();
		}
		return notifier;
	}
	@Override
	public void notifyUser(Account account, double amount, String TransactionType) {
		System.out.println("Sending notification in WhatsApp ");
		System.out.println("The amount:  " + amount);		
		System.out.println("The Transaction Type is: " + TransactionType);
		System.out.println("--------------------------------------------------------------");
	}
}
