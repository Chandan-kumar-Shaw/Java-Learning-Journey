package com.kodewala.arrays;

public class Driver_Product {
	public static void main(String args[]) {
		
		Products item1 = new Products("watch" , 2000);
		Products item2 = new Products("samsung galaxy" , 100000);
		Products item3 = new Products("vivo" , 20000);
		Products item4 = new Products("iphone" , 200000);
		Products item5 = new Products("bluetooth" , 25000);
		
		Products products[] = new Products[5];
		
		products[0] = item1;
		products[1] = item2;
		products[2] = item3;
		products[3] = item4;
		products[4] = item5;
		
		Products maxProduct = products[0];
			for (int i = 0; i < products.length; i++) {

	            if (products[i].price > maxProduct.price) {
	                maxProduct = products[i];
	            }
	        }

	     System.out.println("max product name with price");
	        System.out.println("Name  : " + maxProduct.productName);
	        System.out.println("Price : " + maxProduct.price);
	    }
		
}
