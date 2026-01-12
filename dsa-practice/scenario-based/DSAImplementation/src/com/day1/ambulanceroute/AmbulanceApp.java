package com.day1.ambulanceroute;

import java.util.Scanner;

public class AmbulanceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AmbulanceRoute route = new AmbulanceRoute();
        int choice;

        do {
            System.out.println("\n====== Ambulance Route Menu ======");
            System.out.println("1. Add Hospital Unit");
            System.out.println("2. Find Nearest Available Unit");
            System.out.println("3. Remove Unit (Maintenance)");
            System.out.println("4. Display Route");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Unit Name: ");
                    String name = sc.nextLine();

                    System.out.print("Is unit available? (true/false): ");
                    boolean available = sc.nextBoolean();

                    route.addUnit(name, available);
                    break;

                case 2:
                    route.findAvailableUnit();
                    break;

                case 3:
                    System.out.print("Enter Unit Name to remove: ");
                    name = sc.nextLine();
                    route.removeUnit(name);
                    break;

                case 4:
                    route.displayRoute();
                    break;

                case 5:
                    System.out.println("Exiting Ambulance Navigation System");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}