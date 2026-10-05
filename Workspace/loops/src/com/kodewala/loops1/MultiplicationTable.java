package com.kodewala.loops1;

public class MultiplicationTable {
// print Multiplication table , number is provided by command line arguments
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		for(int i = 1; i<=10; i++) {
			
			System.out.println(num + "*" + i +" "+ "="+ num * i);
		}
		
	}

}
