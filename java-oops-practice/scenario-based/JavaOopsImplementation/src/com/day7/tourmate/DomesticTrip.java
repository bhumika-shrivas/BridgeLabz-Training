package com.day7.tourmate;

import java.util.List;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel, List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("Domestic trip booked with local travel benefits.");
    }

    @Override
    public void cancel() {
        System.out.println("Domestic trip cancelled with minimal charges.");
    }
}
