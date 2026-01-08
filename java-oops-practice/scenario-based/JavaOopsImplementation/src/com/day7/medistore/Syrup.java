package com.day7.medistore;

import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public double sell(int quantity) {
        if (checkExpiry() && reduceStock(quantity)) {
            return calculateCost(quantity);
        }
        return 0;
    }

    // Liquid medicine → stricter expiry rule
    @Override
    public boolean checkExpiry() {
        return expiryDate.isAfter(LocalDate.now().plusDays(7));
    }
}
