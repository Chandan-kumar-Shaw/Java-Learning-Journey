package com.kodewala.loops1;

public class Driver {

	public static void main(String[] args) {
		// For loop

		// for(int i=0; i < 10; i++){
		// System.out.println("The number is :" + i); // the logic got executed 10 times

		Customer customer1 = new Customer("Ravi", 3000, "123456789");
		Customer customer2 = new Customer("Chandan", 1000, "1234567890");
		Customer customer3 = new Customer("Sunny", 1500, "1234567891");
		Customer customer4 = new Customer("Ajay", 300, "1234567893");
		Customer customer5 = new Customer("Rai", 3000, "1234567892");

		Customer users[] = new Customer[5];

		users[0] = customer1;
		users[1] = customer2;
		users[2] = customer3;
		users[3] = customer4;
		users[4] = customer5;

		for (int i = 0; i < users.length; i++) {

			if (users[i].accountBalance < 2000) {
				System.out.println(users[i].name+ " "+ users[i].accountBalance+ " " +users[i].mobileNumber );
			}

		}

	}

}
