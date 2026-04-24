package com.smartcitytransportsystemworkshop;

public interface TransportService {

    String getServiceName();
    String getRoute();
    double getFare();
    int getPassengers();
    int getDepartureTime(); // 24-hour format

    default void printServiceDetails() {
        System.out.println(
                "Service: " + getServiceName() +
                " | Route: " + getRoute() +
                " | Fare: " + getFare() +
                " | Passengers: " + getPassengers() +
                " | Departure: " + getDepartureTime() + ":00"
        );
    }
}
