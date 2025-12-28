package com.constructor.level1;

import java.util.Scanner;

public class VehicleMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter owner name:");
        String owner1 = sc.nextLine();

        System.out.println("Enter vehicle type:");
        String type1 = sc.nextLine();

        Vehicle v1 = new Vehicle(owner1, type1);
        
        System.out.println("\nEnter owner name:");
        String owner2 = sc.nextLine();

        System.out.println("Enter vehicle type:");
        String type2 = sc.nextLine();

        Vehicle v2 = new Vehicle(owner2, type2);

        // Update registration fee
        System.out.println("\nEnter new registration fee:");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        // Display details
        System.out.println("\n--- Vehicle Details ---");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        sc.close();
    }
}
