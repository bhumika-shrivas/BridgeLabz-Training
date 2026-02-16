package com.smartcitytransportsystemworkshop;

public class TaxiService implements TransportService {

    private String name, route;
    private double fare;
    private int passengers, departureTime;

    public TaxiService(String name, String route, double fare, int passengers, int departureTime) {
        this.name = name;
        this.route = route;
        this.fare = fare;
        this.passengers = passengers;
        this.departureTime = departureTime;
    }

    public String getServiceName() { return name; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public int getPassengers() { return passengers; }
    public int getDepartureTime() { return departureTime; }
}

