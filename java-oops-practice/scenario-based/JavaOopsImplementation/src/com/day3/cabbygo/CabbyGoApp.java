package com.day3.cabbygo;

public class CabbyGoApp {
    public static void main(String[] args) {

        Driver d1 = new Driver("Rohit", "DL12345", 4.8);

        Vehicle ride = new Sedan("MH12AB1234");
        ride.bookRide(12);   // distance in km
        ride.endRide();

        System.out.println("Driver Rating: " + d1.getRating());
    }
}
