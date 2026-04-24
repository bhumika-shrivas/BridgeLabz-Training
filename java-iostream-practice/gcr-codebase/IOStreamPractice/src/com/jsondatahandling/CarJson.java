package com.jsondatahandling.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Scanner;

// Car class to hold object data
class Car {
    private String brand;
    private String color;
    private int year;

    // Constructor
    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // Getters required by Jackson to access private fields
    public String getBrand() { return brand; }
    public String getColor() { return color; }
    public int getYear() { return year; }
}

public class CarJson {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        // User inputs for Car object
        System.out.print("Enter car brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter car color: ");
        String color = sc.nextLine();
        System.out.print("Enter car year: ");
        int year = sc.nextInt();

        // Create Car object
        Car car = new Car(brand, color, year);

        // Convert Car object to JSON string
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);
        System.out.println("JSON Output:\n" + jsonString);
    }
}

