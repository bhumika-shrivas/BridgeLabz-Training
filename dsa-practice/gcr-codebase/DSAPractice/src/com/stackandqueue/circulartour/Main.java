package com.stackandqueue.circulartour;

// Usage
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of petrol pumps: ");
        int n = sc.nextInt();

        CircularTour.PetrolPump[] pumps = new CircularTour.PetrolPump[n];

        System.out.println("Enter petrol and distance:");
        for (int i = 0; i < n; i++) {
            int petrol = sc.nextInt();
            int distance = sc.nextInt();
            pumps[i] = new CircularTour.PetrolPump(petrol, distance);
        }

        int start = CircularTour.findStartingPoint(pumps);
        System.out.println("Starting Pump Index: " + start);
    }
}
