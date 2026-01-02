package com.day2.homeautomationsystem;

abstract class Appliance implements Controllable {
    private boolean isOn;
    private int power; // watts

    Appliance(int power) {
        this.power = power;
    }

    protected void setOn(boolean state) {
        isOn = state;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getPower() {
        return power;
    }
}
