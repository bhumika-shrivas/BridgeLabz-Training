package com.day3.smartcheckout;

import java.util.ArrayList;

class Customer {
    String name;
    ArrayList<String> items = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addItem(String item) {
        items.add(item);
    }
}
