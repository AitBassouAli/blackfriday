package com.indev.blackfriday;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<String, Command> products = new HashMap<String, Command>();

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int price, String productName, int quantity) {
        makeCommand(productName, new Product(productName, price), quantity);
    }

    private void makeCommand(String productName, Product product, int quantity) {
        products.put(productName, new Command(quantity, product));
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int tolate = 0;
        for (Command command : products.values()) {
            tolate += command.totalPrice();
        }
        return tolate;
    }

    public Company blackFriday() {
        return this;
    }
}
