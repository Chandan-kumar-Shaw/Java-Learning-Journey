package com.kodewala.arrays;

public class Employee {

	    public static void main(String[] args) {

	        // Array of 5 employee names
	        String[] employees = {
	            "Rahul",
	            "Amit",
	            "Priya",
	            "Sneha",
	            "Rohit"
	        };

	        // Name taken from command-line argument
	        String searchName = args[0];

	        boolean found = false;

	        // Compare command-line name with array values
	        for (int i = 0; i < employees.length; i++) {

	            if (employees[i].equalsIgnoreCase(searchName)) {
	                found = true;
	
	            }
	        }

	        // Display result
	        if (found) {
	            System.out.println(searchName + " exists in the employee list.");
	        } else {
	            System.out.println(searchName + " does not exist in the employee list.");
	        }
	    }
	}

