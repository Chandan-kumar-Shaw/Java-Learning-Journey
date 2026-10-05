package com.kodewala.loops1;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		for(int i = 1; i<=num; i++) {
			
			if(i % 2 == 0) {
				sum = sum +i;
				
			}
		}
		System.out.println("Sum of Even Numbers : "+ sum);

	}

}
