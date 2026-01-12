package com.day1.browserbuddy;

import java.util.Scanner;

public class BrowserBuddyApp {
    public static void main(String[] args) {
        Browser browser = new Browser();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
            1. Visit Page
            2. Back
            3. Forward
            4. Close Tab
            5. Restore Tab
            6. Exit
            """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter URL: ");
                    browser.getActiveTab().visit(sc.nextLine());
                }
                case 2 -> browser.getActiveTab().back();
                case 3 -> browser.getActiveTab().forward();
                case 4 -> browser.closeTab();
                case 5 -> browser.restoreTab();
                case 6 -> {
                    System.out.println("Exiting BrowserBuddy");
                    return;
                }
            }
        }
    }
}
