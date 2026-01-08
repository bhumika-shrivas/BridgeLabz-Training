package com.day5.eventease;

public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;     // 🔒 cannot be modified
    private static int idCounter = 1000;

    // 🔒 pricing details protected
    protected double venueCost;
    protected double serviceCost;
    protected double discount;

    protected User organizer;

    // Constructor without extra services
    public Event(String eventName, String location, String date,
                 int attendees, User organizer) {
        this(eventName, location, date, attendees, organizer, 0, 0);
    }

    // Constructor with services
    public Event(String eventName, String location, String date,
                 int attendees, User organizer,
                 double serviceCost, double discount) {

        this.eventId = ++idCounter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = attendees * 50; // cost logic
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    public void showDetails() {
        System.out.println("\nEvent ID: " + eventId);
        System.out.println("Event: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}
