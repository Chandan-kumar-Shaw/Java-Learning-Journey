package com.kodewala.constructor4;
class SuperUser extends Object
{
	SuperUser(int a){
		
		super();
	}
}
public class User extends SuperUser {
String userName;
String userId;
String mobile;

User(String _userName, String _userId, String _mobile)
{
	super(23);
	this.userName = _userName;
	this.userId = _userId;
	this.mobile = _mobile;
}

}
