package com.day2.vehiclerentalsystem;

// Subclass - Polymorphism in rent calculation
class Car extends Vehicle 
{
    Car(String number) 
    {
        super(number, 800);
    }

    public double calculateRent(int days) 
    {
        return (baseRate * days) + 500; // AC surcharge
    }
}
