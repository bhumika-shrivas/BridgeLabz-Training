package com.day6.parkease;

import java.util.Scanner;

public class ParkEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create parking slot
        ParkingSlot slot = new ParkingSlot(101, "Car");

        // Vehicle input
        System.out.print("Enter vehicle number: ");
        String number = sc.nextLine();

        System.out.print("Enter vehicle type (1-Car, 2-Bike, 3-Truck): ");
        int choice = sc.nextInt();

        Vehicle vehicle;
        if (choice == 1) {
            vehicle = new Car(number);
        } else if (choice == 2) {
            vehicle = new Bike(number);
        } else {
            vehicle = new Truck(number);
        }

        // Assign slot
        if (slot.assignSlot(vehicle)) {
            System.out.print("Enter parking duration (hours): ");
            int hours = sc.nextInt();

            double charges = vehicle.calculateCharges(hours);
            System.out.println("Parking Charges: ₹" + charges);

            slot.releaseSlot();
        } else {
            System.out.println("Slot not available or vehicle type not allowed.");
        }

        slot.showLogs();
    }
}
