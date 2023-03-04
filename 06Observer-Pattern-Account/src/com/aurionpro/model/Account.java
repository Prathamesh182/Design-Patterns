package com.aurionpro.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	//private List<INotifer> notifiers;
	private Set<INotifier> notifiers;
	
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifiers=getNotifiers();
		notifiers = new HashSet<>();
		//notifier = new ArrayList<Notifier>();
		
	}

	

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Set<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(Set<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	
	public void deposit(double amount) {
		balance = balance+amount;
		for(INotifier x:notifiers) {
			x.notifyUser(this, amount, "deposit");
		}
		
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException {
		if(balance>amount) {
			balance-=amount;
			for(INotifier x:notifiers) {
				x.notifyUser(this, amount, "withdrawl");
			}
		}
		else {
			throw new InsufficientBalanceException("Insufficient Funds");
		}
	}
	public void registerNotifier(INotifier notifier) {
		notifiers.add(notifier);
	}
	
	@Override										
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
