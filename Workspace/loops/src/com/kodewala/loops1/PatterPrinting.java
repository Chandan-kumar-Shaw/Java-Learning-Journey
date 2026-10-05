package com.kodewala.loops1;

public class PatterPrinting {

	public static void main(String[] args) {
		// Outer loop for rows ---> responsible for printing rows 
		for (int i = 1; i <= 5; i++) {
  // Inner loop for columns ----> responsible for printing columns
			for (int j = 1; j <= i; j++) {

				System.out.print("*");  // print star without a new line;
			}
			System.out.println(); // Move to the next line after each row
		}

	}

}
/* output             ____________ 
                      | *        |
                      | **       |
                      | ***      |
                      | ****     |
                      | *****    |
                      |__________|
*/                    