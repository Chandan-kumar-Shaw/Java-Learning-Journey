package com.ordermanagement.sample;

public class OrderManagement {
private int orderValue = 1290;
	
	public void placeOrder(String itemName)
     {
		//OrderManagement objMgmt = new OrderManagement();
		// using public variable with in same class 
		System.out.println("Order value is :" +orderValue);
	    System.out.println("placing an order for :"+ itemName);
	 
}
}