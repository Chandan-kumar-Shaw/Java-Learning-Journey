package com.amazon.sample;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "Chandan";
		System.out.println("Hi I am Hello World From Eclipse!" + name);
		HelloWorld.doSomething();

	}

	public static void doSomething() {
		System.out.println("HelloWorld.doSomething()");
		System.out.println("End");
	}
}
