package com.day7.tourmate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TourMateApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose trip type (1-Domestic, 2-International): ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter duration (days): ");
        int days = sc.nextInt();

        // Create services
        Transport transport = new Transport("Flight", 15000);
        Hotel hotel = new Hotel("Grand Stay", 3000, days);

        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("City Tour", 2000));
        activities.add(new Activity("Adventure Sports", 3500));

        Trip trip;
        if (choice == 1) {
            trip = new DomesticTrip(destination, days, transport, hotel, activities);
        } else {
            trip = new InternationalTrip(destination, days, transport, hotel, activities);
        }

        // Polymorphism
        trip.book();
        trip.showSummary();
    }
}
