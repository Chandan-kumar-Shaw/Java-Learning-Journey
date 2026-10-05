package com.kodewala.loops2;

import java.util.Scanner;

public class DriverWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luckyNumber = 13;
		int userEntered = 0;
		while (luckyNumber != userEntered) {

			System.out.println("please enter the number");
			userEntered = sc.nextInt();
			if (userEntered == luckyNumber) {

				System.out.println("You Won!");

			} else {

				System.err.println("please try again");
			}
		}

	}

}
