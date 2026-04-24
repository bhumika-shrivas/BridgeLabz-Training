package com.generics.onlinemarketplace;

public class GadgetCategory implements Category {

    @Override
    public String getCategoryName() {
        return "Gadgets";
    }

    @Override
    public double getMinPrice() {
        return 1000;
    }

    @Override
    public double getMaxPrice() {
        return 100000;
    }
}
