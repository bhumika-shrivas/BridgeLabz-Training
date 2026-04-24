package com.day2.classcenter;

class Customer {
    String id;
    boolean vip;
    long callTime;

    Customer(String id, boolean vip) {
        this.id = id;
        this.vip = vip;
        this.callTime = System.currentTimeMillis();
    }
}
