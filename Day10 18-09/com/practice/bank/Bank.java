package com.practice.bank;
import com.practice.account.Account;
class Bank
{

	public String bankName = "SBI";
	
	
	public static void main(String args[])
	{
		Bank bk = new Bank();
		Account acc = new Account();
		acc.accountHolderName = "Chandan";
		acc.balance = 150000;
		acc.displayAccount();
		System.out.println("Bank Name: " + bk.bankName);
	
	
	
	
	}
}