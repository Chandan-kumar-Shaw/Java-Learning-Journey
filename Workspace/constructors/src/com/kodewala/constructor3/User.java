package com.kodewala.constructor3;

class SuperUser extends Object {

}

public class User extends SuperUser {

	String userName;
	String userId;
	String mobile;

	User(String _userName, String _userId, String _mobile) {
		this(90);
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
	}

	User(int age) {

		System.out.println("User()....no arg");
	}
}
