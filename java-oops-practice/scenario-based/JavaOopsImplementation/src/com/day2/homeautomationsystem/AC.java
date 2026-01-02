package com.day2.homeautomationsystem;

class AC extends Appliance {
    AC() { super(1500); }

    public void turnOn() {
        setOn(true);
        System.out.println("AC ON (cooling mode)");
    }

    public void turnOff() {
        setOn(false);
        System.out.println("AC OFF");
    }
}
