package com.day7.medistore;

public interface ISellable {
    double sell(int quantity);
    boolean checkExpiry();
}