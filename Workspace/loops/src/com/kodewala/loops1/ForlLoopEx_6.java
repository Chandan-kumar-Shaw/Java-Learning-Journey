package com.kodewala.loops1;

public class ForlLoopEx_6 {
// Print numbers from 1 to N, where N comes from command-line argument.
	public static void main(String[] args) {
		
int num = Integer.parseInt(args[0]);
for(int i = 1; i<=num ; i++) {
	
	System.out.println("numbers are :" + i);
}
	}

}
