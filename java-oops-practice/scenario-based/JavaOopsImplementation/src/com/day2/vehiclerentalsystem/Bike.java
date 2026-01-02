package com.day2.vehiclerentalsystem;

//Subclass - Polymorphism in rent calculation
class Bike extends Vehicle 
{
    Bike(String number) 
    {
        super(number, 300);
    }

    public double calculateRent(int days)
    {
        return baseRate * days;
    }
}
