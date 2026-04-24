package com.functionalinterface.defineandimplement.smartdevice;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartDevice device = null;

        System.out.println("Choose device: light / ac / tv");
        String deviceChoice = sc.nextLine().toLowerCase();

        switch (deviceChoice) {
            case "light":
                device = new Light();
                break;
            case "ac":
                device = new AC();
                break;
            case "tv":
                device = new TV();
                break;
            default:
                System.out.println("Invalid device");
                return;
        }

        System.out.println("Choose action: on / off");
        String action = sc.nextLine().toLowerCase();

        if (action.equals("on")) {
            device.turnOn();
        } else if (action.equals("off")) {
            device.turnOff();
        } else {
            System.out.println("Invalid action");
        }

        sc.close();
    }
}
