package com.kodewala.loops1;

public class NaturalNumbers {
// Print the first N natural numbers.
	public static void main(String[] args) {
		
int num = Integer.parseInt(args[0]);
for(int i = num; i>=1; i--) {
	System.out.println("First N natural Numbers:" + i);
}
	}

}
