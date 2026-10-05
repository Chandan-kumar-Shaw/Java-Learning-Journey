package com.kodewala.constructor5;

public class AmazonUserPractice {
	
	String userType;
	String location;
	
	AmazonUserPractice(String _userType, String _location){
		
		this.userType = _userType;
		this.location = _location;
	}
	AmazonUserPractice(){
		this("GuestUser", "INDIA");
	}
     void display() {
    	 System.out.println(userType);
    	 System.out.println(location);
     }
}
