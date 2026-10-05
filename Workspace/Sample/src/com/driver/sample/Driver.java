package com.driver.sample;

import com.ordermanagement.sample.OrderManagement;

public class Driver {
	public static void main(String args[])
	{
	
	OrderManagement objMgmt = new OrderManagement();
	objMgmt.placeOrder("iPhone18");
	System.out.println("This is Drver Management");
	
	}
}
