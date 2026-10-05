package com.kodewala.arrays;

public class Driver2 {

	public static void main(String[] args) {
		
		Account acc1 = new Account("Chandan", "Acc001");
		Account acc2 = new Account("Ravi", "Acc002");
		Account acc3 = new Account("Sudarsahn", "Acc003");
		Account acc4 = new Account("Rohit", "Acc004");
		Account acc5 = new Account("Vinay", "Acc005");
	// store user objects in an array.
		Account accounts[] = new Account[5];
		accounts[0] = acc1;
		accounts[1] = acc2;
		accounts[2] = acc3;
		accounts[3] = acc4;
		accounts[4] = acc5;
	}

}
