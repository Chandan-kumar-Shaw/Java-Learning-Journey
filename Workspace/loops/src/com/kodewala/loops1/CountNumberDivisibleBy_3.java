package com.kodewala.loops1;

public class CountNumberDivisibleBy_3 {
// count number divisible by 3 from 1 to 100;
	public static void main(String[] args) {
		int num = 100;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				count++;
			}
		}
		System.out.println("The total no of count :" + count);

	}

}
