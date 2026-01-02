package com.day2.homeautomationsystem;

class EnergyCheck 
{
    static void compare(Appliance a1, Appliance a2) 
    {
        if (a1.getPower() > a2.getPower())
            System.out.println("First appliance uses more energy");
        else if (a1.getPower() < a2.getPower())
            System.out.println("Second appliance uses more energy");
        else
            System.out.println("Both use equal energy");
    }
}
