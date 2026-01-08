package com.day7.tourmate;

import java.util.List;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("International trip booked with visa & insurance support.");
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled with higher cancellation charges.");
    }
}
