package com.kodewala.constructor2;

class Invoice extends Object {
	static int gst =18;
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName)
	{
	this.amount = _amount;
	this.itemName = _itemName;
	this.billingAddress = _billingAddress;
	this.customerId = _customerId;
	this.customerName = _customerName;
	
	
	}
}
	
	public class Driver {

	public static void main(String[] args) {
		
		Invoice inv1 = new Invoice(180000, "iphone18", "Kodewala ,Btm, 2nd Stage", "C100", "Chandan");
		System.out.println("first invoice "+ inv1.itemName+","+ inv1.customerId+","+Invoice.gst);
		Invoice inv2 = new Invoice(80000, "Samsung", "Kodewala ,Btm, 2nd Stage", "C101", "Ravi");
		System.out.println("second invoice "+ inv2.itemName+","+ inv2.customerId+","+Invoice.gst);
		
	}
}
