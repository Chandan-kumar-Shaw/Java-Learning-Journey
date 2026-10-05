package com.kodewala.constuctors1;

public class AmazonProduct {

	int productId;
    String productName;
    double price;
    String category;

    AmazonProduct(int _productId, String _productName, double _price, String _category) {
        this.productId = _productId;
        this.productName = _productName;
        this.price = _price;
        this.category = _category;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }
}
