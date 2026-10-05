package com.kodewala.constuctors1;

public class Product {

	String productName;
	int price;
	String description;
	int quantity;

	Product(String _productName, int _price, String _description, int _quantity) {

		this.productName = _productName;
		this.price = _price;
		this.description = _description;
		this.quantity = _quantity;
	}

	Product(String _productName, String _description) {

		this.productName = _productName;
		this.description = _description;

	}

	Product() {

	}
}
