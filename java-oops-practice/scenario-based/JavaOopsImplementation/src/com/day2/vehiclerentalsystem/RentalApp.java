package com.day2.vehiclerentalsystem;

public class RentalApp {
    public static void main(String[] args) {

        Customer c1 = new Customer("Rahul");

        Vehicle v1 = new Bike("BIKE101");
        Vehicle v2 = new Car("CAR202");
        Vehicle v3 = new Truck("TRK303");

        System.out.println(c1.getName() + " Bike Rent: " + v1.calculateRent(3));
        System.out.println(c1.getName() + " Car Rent: " + v2.calculateRent(3));
        System.out.println(c1.getName() + " Truck Rent: " + v3.calculateRent(3));
    }
}
