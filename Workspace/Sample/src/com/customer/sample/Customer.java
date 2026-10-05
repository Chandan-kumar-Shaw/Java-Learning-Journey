package com.customer.sample;
import com.account.sample.Account;

public class Customer {
	public static void main(String args[]) {
		System.out.println("Customer Info Started");
		Account acc = new Account();
		acc.accountHolderName = "Chandan Shaw";
		acc.balance = 250000;
		acc.displayAccount();

		System.out.println("Customer Info Ended");

	}
}
