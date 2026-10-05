package com.kodewala.constuctors;

public class Driver {
	public static void main(String args[]) {

		AccountHolder user1 = new AccountHolder(2000, "87654321", "Chandan", "987654321");
		AccountHolder user2 = new AccountHolder(654, "12345678", "Ravi", "123456789");
		System.out.println("User1 details : " + user1);
		System.out.println("User2 details :" + user2);
	}

}
