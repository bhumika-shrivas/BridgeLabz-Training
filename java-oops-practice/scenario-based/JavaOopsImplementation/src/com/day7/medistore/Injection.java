package com.day7.medistore;

import java.time.LocalDate;

public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public double sell(int quantity) {
        if (checkExpiry() && reduceStock(quantity)) {
            return calculateCost(quantity);
        }
        return 0;
    }

    // Highly sensitive → must not be near expiry
    @Override
    public boolean checkExpiry() {
        return expiryDate.isAfter(LocalDate.now().plusDays(15));
    }
}
