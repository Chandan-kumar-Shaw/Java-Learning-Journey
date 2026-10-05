package com.kodewala.scanner;

import java.util.Scanner;

public class Driver1 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creates connection with Console
int price = 0;
        System.out.println(" Please enter the price...");
        
if(sc.hasNextInt()) {
	price =sc.nextInt();
}
else
{
	System.out.println("please enter the price in right format18");
}
System.out.println("price :" +price);
         sc.close(); // close the connection.
    }

}
