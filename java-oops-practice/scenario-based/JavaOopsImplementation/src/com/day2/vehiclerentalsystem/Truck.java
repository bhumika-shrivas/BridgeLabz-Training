package com.day2.vehiclerentalsystem;

//Subclass - Polymorphism in rent calculation
class Truck extends Vehicle 
{
    Truck(String number) 
    {
        super(number, 1500);
    }

    public double calculateRent(int days)
    {
        return (baseRate * days) + (days * 300); // load charge
    }
}
