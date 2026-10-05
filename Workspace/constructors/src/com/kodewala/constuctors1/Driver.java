package com.kodewala.constuctors1;

public class Driver {

	public static void main(String[] args) {
		/*
		 * Account acc = new Account(); System.out.println(acc.amount+" and "+
		 * acc.name);
		 * 
		 * Account acc1 = new Account(3000,"Chandan");// Calling constructor which
		 * expect int and String param
		 * System.out.println(acc1.amount+" and "+acc1.name);
		 */

	/*	Product pt1 = new Product("iPhone18", 300000, "Apple iphone 18", 1);
		System.out.println("Inside Product(String _productName, int _price, String _description, int _quantity )");
		System.out.println(pt1.productName + " " + pt1.price + " " + pt1.description + " " + pt1.quantity);
	//	System.out.println("Product is :" + pt1);
		
		Product pt2 = new Product("Samsung", "Samsung Ultra");
		System.out.println("Insde Product(String _productName, String _description )");
		System.out.println(pt2.productName + " " + pt2.description);
	//	System.out.println("Product is :" + pt2);
		
		Product pt = new Product();
		System.out.println("Inside Default Constructor without any attributes");
		System.out.println(pt.productName + " " + pt.price + " " + pt.description + " " + pt.quantity);
	//	System.out.println("Product is :" + pt);     */
		
	/*	Blinkit bt = new Blinkit("Pizza", 200, 1, "Btm 2nd Stage");
		System.out.println(bt.itemName + " "+bt.price +" "+bt.quantity+" "+" "+bt.deliveryAddress);
	
		Blinkit bt1 = new Blinkit("Burger", 100, 2, "Btm 1st Stage");
		System.out.println(bt1.itemName + " "+bt1.price +" "+bt1.quantity+" "+" "+bt1.deliveryAddress);
		
		*/
		/* AmazonProduct amazon = new AmazonProduct(101,"Laptop", 60000, "Electronics");
		amazon.displayProduct();
		System.out.println("----------------------------------------------------------------");
		AmazonProduct amazon1 = new AmazonProduct(102,"HeadPhone", 2500, "Electronics");
		amazon1.displayProduct(); */
		
		RapidoRide r1 = new RapidoRide(201, "Chandan", "Ramesh ", "Whitefield", "MG Road", 180);

	    RapidoRide r2 = new RapidoRide(202, "Rahul", "Suresh", "BTM", "Koramangala", 120);

	        r1.displayRide();
	        System.out.println("----------------------------------------------------------------");
	        r2.displayRide();
	} 

}
