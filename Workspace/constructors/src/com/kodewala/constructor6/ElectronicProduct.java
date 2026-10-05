package com.kodewala.constructor6;

public class ElectronicProduct extends Product {

	int warranty;

	public ElectronicProduct(String _name, int _price, String _productId, int _warranty) {
		super(_name, _price, _productId);
		this.warranty = _warranty;
	}

}
