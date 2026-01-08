package com.day5.eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String eventName, String location, String date,
                          int attendees, User organizer,
                          double serviceCost, double discount) {
        super(eventName, location, date, attendees, organizer, serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday event scheduled with decorations and cake.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled.");
    }
}
