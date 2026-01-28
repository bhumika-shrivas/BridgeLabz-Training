package com.day11.bagballorganizer;

import java.util.*;

public class Bag implements Storable {

    private int id;
    private String color;
    private int capacity;
    private List<Ball> balls;

    public Bag(int id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    // Add Ball
    public void addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("Bag is full! Cannot add more balls.");
            return;
        }
        balls.add(ball);
        System.out.println("Ball added to Bag " + id);
    }

    // Remove Ball by ID
    public void removeBall(int ballId) {
        Iterator<Ball> it = balls.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == ballId) {
                it.remove();
                System.out.println("Ball removed from Bag " + id);
                return;
            }
        }
        System.out.println("Ball not found!");
    }

    // Display Balls
    public void displayBalls() {
        if (balls.isEmpty()) {
            System.out.println("Bag is empty.");
            return;
        }
        for (Ball b : balls) {
            b.displayInfo();
        }
    }

    public int getBallCount() {
        return balls.size();
    }

    @Override
    public void displayInfo() {
        System.out.println("Bag ID: " + id +
                ", Color: " + color +
                ", Capacity: " + capacity +
                ", Balls Stored: " + balls.size());
    }
}