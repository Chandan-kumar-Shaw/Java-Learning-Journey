package com.kodewala.loops1;

public class Factorial {
// print the factorial of a number 
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int factorial = 1;
		for(int i = 1; i<=num; i++) {
			
			factorial = factorial*i;
			
		}
		System.out.println("Factorial Of" + " " +num +" :" + " " +factorial );
	}

}
