package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotifier;
import com.aurionpro.model.InsufficientBalanceException;
import com.aurionpro.model.SMSNotifier;
import com.aurionpro.model.WhatsappNotifier;

public class AccountTest {

	public static void main(String[] args) throws InsufficientBalanceException {
		Account accounts = new Account(101, "Prathamesh", 20000);
//		accounts.registerNotifier(new EmailNotifier());
//		accounts.withdraw(1000);
		// accounts.deposit(10000);
//		System.out.println(accounts)
//		System.out.println("---------------------------------------------------------");
//
		accounts.registerNotifier(SMSNotifier.getInstance());
		accounts.registerNotifier(SMSNotifier.getInstance());
		accounts.registerNotifier(EmailNotifier.getInstance());
		accounts.registerNotifier(EmailNotifier.getInstance());
		accounts.registerNotifier(WhatsappNotifier.getInstance());
		accounts.registerNotifier(WhatsappNotifier.getInstance());
		accounts.deposit(100000);
		//accounts.withdraw(10000);
		System.out.println(accounts);

//		accounts.registerNotifier(new WhatsappNotifier());
//		accounts.deposit(1000);
//		System.out.println(accounts);
//		System.out.println("----------------------------------------------------------");
////
	}

}
