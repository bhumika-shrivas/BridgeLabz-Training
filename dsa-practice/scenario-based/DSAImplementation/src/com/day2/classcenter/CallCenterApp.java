package com.day2.classcenter;

import java.util.Scanner;

public class CallCenterApp {
    public static void main(String[] args) {
        CallCenter center = new CallCenter();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
            1. Receive Call
            2. Handle Call
            3. Show Call Stats
            4. Exit
            """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Customer ID: ");
                    String id = sc.nextLine();
                    System.out.print("VIP (true/false): ");
                    boolean vip = sc.nextBoolean();
                    center.receiveCall(id, vip);
                }
                case 2 -> center.handleCall();
                case 3 -> center.showCallStats();
                case 4 -> {
                    System.out.println("System closed");
                    return;
                }
            }
        }
    }
}
