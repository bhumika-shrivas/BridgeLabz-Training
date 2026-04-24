package com.day1.ambulanceroute;

class HospitalUnitNode {
    String unitName;
    boolean available;
    HospitalUnitNode next;

    public HospitalUnitNode(String unitName, boolean available) {
        this.unitName = unitName;
        this.available = available;
    }
}