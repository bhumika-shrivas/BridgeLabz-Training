package com.day2.homeautomationsystem;

class UserController 
{
    void control(Controllable device, boolean power) 
    {
        if (power) device.turnOn();
        else device.turnOff();
    }
}
