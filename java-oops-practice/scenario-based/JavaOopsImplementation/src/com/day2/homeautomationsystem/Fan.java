package com.day2.homeautomationsystem;

class Fan extends Appliance 
{
    Fan(int power) { super(power); 
}

    public void turnOn() 
    {
        setOn(true);
        System.out.println("Fan ON (medium speed)");
    }

    public void turnOff() 
    {
        setOn(false);
        System.out.println("Fan OFF");
    }
}
