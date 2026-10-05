package com.kodewala.constructor6;

public class Driver {

	public static void main(String[] args) {

		ElectronicProduct elctronicProduct = new ElectronicProduct("iPhone", 200000, "IP001", 2);
		System.out.println(elctronicProduct.name);
		System.out.println(elctronicProduct.price);
		System.out.println(elctronicProduct.productId);
		System.out.println(elctronicProduct.warranty);

	}

}
