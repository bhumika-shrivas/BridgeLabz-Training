package com.day2.homeautomationsystem;

public class SmartHomeApp 
{
    public static void main(String[] args) 
    {

        Appliance light = new Light();
        Appliance fan = new Fan(75);
        Appliance ac = new AC();

        UserController user = new UserController();

        user.control(light, true);
        user.control(ac, true);

        EnergyCheck.compare(light, ac);
    }
}
