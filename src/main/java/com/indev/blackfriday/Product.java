package com.indev.blackfriday;

public class Product {
    private final String productName;
    private final int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
