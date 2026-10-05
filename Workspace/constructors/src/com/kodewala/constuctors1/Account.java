package com.kodewala.constuctors1;

public class Account 
{
	int amount;
	String name;
	
	Account()
	{
		System.out.println("Default Constructor ");
		
	}
	
	Account(int _amount, String _name)
	{
		System.out.println("This is parameterised ConstructorS");
		this.amount =_amount;
		this.name =_name;
	}
	
}
