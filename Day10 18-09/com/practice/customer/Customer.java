package com.practice.customer;
import com.practice.account.Account;
class Customer
{
  public static void main(String args[])
  {
   System.out.println("Custmore Info Started");
   Account acc = new Account();
		acc.accountHolderName = "Chandan Shaw";
		acc.balance = 250000;
		acc.displayAccount();
  
	System.out.println("Custmore Info Ended");
  
  
  }





}