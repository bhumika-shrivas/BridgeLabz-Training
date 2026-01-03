package com.encapsulation.vehiclerentalsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MH12AB1234", 1500, "CAR123"));
        vehicles.add(new Bike("MH14CD5678", 500, "BIKE456"));
        vehicles.add(new Truck("MH20EF9999", 3000, "TRUCK789"));

        int days = 3;

        for (Vehicle v : vehicles) {
            double rent = v.calculateRentalCost(days);
            double insurance = 0;

            if (v instanceof Insurable) {
                insurance = ((Insurable) v).calculateInsurance();
            }

            System.out.println(
                v.type +
                " | Rent: ₹" + rent +
                " | Insurance: ₹" + insurance +
                " | Total: ₹" + (rent + insurance)
            );
        }
    }
}
