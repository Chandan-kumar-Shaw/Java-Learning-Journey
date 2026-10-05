package com.account.sample;

public class Account {
	public String accountHolderName;
	public double balance;

	public void displayAccount() 
	{
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Balance: " + balance);
	}
}
