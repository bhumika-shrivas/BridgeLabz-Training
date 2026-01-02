package com.day2.homeautomationsystem;

class Light extends Appliance 
{
    Light() { super(40); }

    public void turnOn() {
        setOn(true);
        System.out.println("Light ON (soft glow)");
    }

    public void turnOff() {
        setOn(false);
        System.out.println("Light OFF");
    }
}
