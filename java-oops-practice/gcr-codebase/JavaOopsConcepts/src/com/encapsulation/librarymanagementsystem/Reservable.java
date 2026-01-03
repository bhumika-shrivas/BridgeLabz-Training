package com.encapsulation.librarymanagementsystem;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
