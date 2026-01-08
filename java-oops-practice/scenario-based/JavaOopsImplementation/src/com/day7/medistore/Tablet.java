package com.day7.medistore;

import java.time.LocalDate;

public class Tablet extends Medicine {

    public Tablet(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public double sell(int quantity) {
        if (checkExpiry() && reduceStock(quantity)) {
            return calculateCost(quantity);
        }
        return 0;
    }

    // Preserved medicine → longer expiry tolerance
    @Override
    public boolean checkExpiry() {
        return expiryDate.isAfter(LocalDate.now());
    }
}