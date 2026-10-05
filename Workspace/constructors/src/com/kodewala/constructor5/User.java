package com.kodewala.constructor5;
/**
 *  This class represent Netflix User 
 */
public class User {
	String name;
	String type;
	String mobile;
	String country;
	
	User(String _name, String _type, String _mobile, String _country)
	{// Initializing constructor and whoever wants to call this will provide values/ details for it.//
		
		this.name = _name;
		this.type = _type;
		this.mobile = _mobile;
		this.country = _country;
	}
	
    public User()
    {
    	// System is setting /initalising default values
    	this("user123chandan", "guest _user", "1234567890","IN");
    }
}
