package com.generics.onlinemarketplace;

public class ClothingCategory implements Category {

    @Override
    public String getCategoryName() {
        return "Clothing";
    }

    @Override
    public double getMinPrice() {
        return 300;
    }

    @Override
    public double getMaxPrice() {
        return 5000;
    }
}
