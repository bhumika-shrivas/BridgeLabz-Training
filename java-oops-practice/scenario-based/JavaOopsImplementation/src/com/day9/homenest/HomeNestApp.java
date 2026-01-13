package com.day9.homenest;

import java.util.*;

public class HomeNestApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Device> devices = new ArrayList<>();

        while (true) {
            System.out.println("""
            1. Register Device
            2. Turn ON Device
            3. Turn OFF Device
            4. Reset Device
            5. Show Energy Usage
            6. Exit
            """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Device Type (Light/Camera/Thermostat/Lock): ");
                    String type = sc.nextLine();

                    System.out.print("Enter Device ID: ");
                    String id = sc.nextLine();

                    Device device = switch (type.toLowerCase()) {
                        case "light" -> new Light(id);
                        case "camera" -> new Camera(id);
                        case "thermostat" -> new Thermostat(id);
                        case "lock" -> new Lock(id);
                        default -> null;
                    };

                    if (device != null) {
                        devices.add(device);
                        System.out.println("Device registered");
                    } else {
                        System.out.println("Invalid device type");
                    }
                }

                case 2 -> operate(devices, sc, "on");
                case 3 -> operate(devices, sc, "off");
                case 4 -> operate(devices, sc, "reset");

                case 5 -> {
                    System.out.print("Enter device ID: ");
                    String id = sc.nextLine();
                    for (Device d : devices) {
                        if (d.getDeviceId().equals(id)) {
                            System.out.print("Enter days: ");
                            int days = sc.nextInt();
                            System.out.println("Energy usage: " +
                                    d.calculateEnergy(days));
                        }
                    }
                }

                case 6 -> {
                    System.out.println("HomeNest closed");
                    return;
                }
            }
        }
    }

    private static void operate(ArrayList<Device> devices, Scanner sc, String action) {
        System.out.print("Enter device ID: ");
        String id = sc.nextLine();

        for (Device d : devices) {
            if (d.getDeviceId().equals(id)) {
                switch (action) {
                    case "on" -> d.turnOn();
                    case "off" -> d.turnOff();
                    case "reset" -> d.reset();
                }
                return;
            }
        }
        System.out.println("Device not found");
    }
}
