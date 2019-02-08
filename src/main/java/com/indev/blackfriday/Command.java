package com.indev.blackfriday;

public class Command {
    private int quantity;
    private Product product;

    public Command(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int totalPrice() {
        return (quantity * product.getPrice());
    }
}
