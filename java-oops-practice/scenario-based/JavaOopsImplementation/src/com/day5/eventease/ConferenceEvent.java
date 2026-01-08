package com.day5.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String eventName, String location, String date,
                            int attendees, User organizer,
                            double serviceCost, double discount) {
        super(eventName, location, date, attendees, organizer, serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with speakers and AV setup.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled.");
    }
}
