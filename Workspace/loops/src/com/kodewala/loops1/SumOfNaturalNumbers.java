package com.kodewala.loops1;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum =0;
		int avg =0;
		for(int i = 1; i<=num; i++) {
			sum+=i;
			
			}
		avg=sum/num;
			System.out.println("Sum of N natural numbers :"+ sum);
			System.out.println("Average of N natural numbers :"+ avg);
		}

	}

