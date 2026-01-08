package com.day5.eventease;

import java.util.Scanner;

public class EventEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Organizer
        System.out.print("Enter organizer name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        User user = new User(name, email);

        // Event details
        System.out.print("Choose event (1-Birthday, 2-Conference): ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter event name: ");
        String eventName = sc.nextLine();

        System.out.print("Enter location: ");
        String location = sc.nextLine();

        System.out.print("Enter date: ");
        String date = sc.nextLine();

        System.out.print("Enter number of attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Enter service cost: ");
        double serviceCost = sc.nextDouble();

        System.out.print("Enter discount: ");
        double discount = sc.nextDouble();

        Event event;
        if (choice == 1) {
            event = new BirthdayEvent(eventName, location, date,
                    attendees, user, serviceCost, discount);
        } else {
            event = new ConferenceEvent(eventName, location, date,
                    attendees, user, serviceCost, discount);
        }

        // Polymorphism
        event.schedule();
        event.showDetails();
    }
}
