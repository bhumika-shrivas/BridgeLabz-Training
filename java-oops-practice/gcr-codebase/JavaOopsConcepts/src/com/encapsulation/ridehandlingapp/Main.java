package com.encapsulation.ridehandlingapp;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> rides = new ArrayList<>();

        rides.add(new Car("C101", "Amit", 15));
        rides.add(new Bike("B202", "Neha", 8));
        rides.add(new Auto("A303", "Ravi", 10));

        double distance = 12.5; // km

        calculateFares(rides, distance);
    }

    static void calculateFares(List<Vehicle> vehicles, double distance) {
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleDetails());
            System.out.println("Fare: ₹" + v.calculateFare(distance));
            System.out.println();
        }
    }
}
