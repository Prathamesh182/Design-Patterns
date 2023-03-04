package com.aurionpro.model;

public class EmailNotifier implements INotifier {
private static EmailNotifier notifiers;
	
	private EmailNotifier() {
	}

	public static EmailNotifier getInstance() {
		if(notifiers==null) {
			notifiers=new EmailNotifier();
		}
		return notifiers;
	}

	@Override
	public void notifyUser(Account account, double amount, String TransactionType) {
		System.out.println("Sending notification in Email");
		System.out.println("The amount :" + amount);
		System.out.println("The Transaction Type is: " + TransactionType);
		System.out.println("--------------------------------------------------------------");
	}
}
