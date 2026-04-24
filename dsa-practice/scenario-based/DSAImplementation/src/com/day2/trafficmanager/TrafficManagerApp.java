package com.day2.trafficmanager;

import java.util.Scanner;

public class TrafficManagerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrafficManager manager = new TrafficManager(3); // max queue size

        while (true) {
            System.out.println("""
            1. Add Car
            2. Remove Car
            3. Print Roundabout
            4. Exit
            """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Car Number: ");
                    manager.addCar(sc.nextLine());
                }
                case 2 -> manager.removeCar();
                case 3 -> manager.printRoundabout();
                case 4 -> {
                    System.out.println("Traffic system closed");
                    return;
                }
            }
        }
    }
}
