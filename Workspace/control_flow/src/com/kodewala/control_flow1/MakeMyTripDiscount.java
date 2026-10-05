package com.kodewala.control_flow1;

public class MakeMyTripDiscount {

	    /**
	     * Calculates the discount amount based on the given fare.
	     *
	     */
	    public static double calculateDiscount(double fare) {

	        double discount = 0;

	        // No discount for fare of 5000 or below
	        if (fare <= 5000) {

	            discount = 0;
	            System.out.println("discount : "+discount);
	        }

	        // 10% discount for fare above 5000 and up to 10000
	        else if (fare <= 10000) {

	            discount = fare * 10 / 100;
	            System.out.println("discount : "+discount);
	        }
	        else {

	            discount = fare * 15 / 100;
	            
	        }

	        // Maximum discount allowed is 1250
	        if (discount > 1250) {

	            discount = 1250;
	            System.out.println("discount : "+ discount);
	        }

	        return discount;
	    }
}
