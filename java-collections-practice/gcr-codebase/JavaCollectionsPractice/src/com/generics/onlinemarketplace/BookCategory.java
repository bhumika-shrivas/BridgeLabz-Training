package com.generics.onlinemarketplace;

public class BookCategory implements Category {

    @Override
    public String getCategoryName() {
        return "Books";
    }

    @Override
    public double getMinPrice() {
        return 100;
    }

    @Override
    public double getMaxPrice() {
        return 2000;
    }
}
