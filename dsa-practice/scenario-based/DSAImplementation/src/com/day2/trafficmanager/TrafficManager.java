package com.day2.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

class TrafficManager {

    private Vehicle head = null;          // Circular Linked List head
    private Queue<String> waitingQueue;   // Waiting vehicles
    private int maxQueueSize;

    TrafficManager(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
        waitingQueue = new LinkedList<>();
    }

    // Add a car to roundabout or queue
    void addCar(String carNumber) {

        // If roundabout is empty, car enters directly
        if (head == null) {
            Vehicle v = new Vehicle(carNumber);
            head = v;
            v.next = head; // circular link
            System.out.println(carNumber + " entered the roundabout");
            return;
        }

        // Queue overflow check
        if (waitingQueue.size() == maxQueueSize) {
            System.out.println("Queue overflow! " + carNumber + " cannot enter");
            return;
        }

        waitingQueue.offer(carNumber);
        System.out.println(carNumber + " added to waiting queue");
    }

    // Remove a car from roundabout
    void removeCar() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        // Single vehicle case
        if (head.next == head) {
            System.out.println(head.number + " exited the roundabout");
            head = null;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            System.out.println(head.number + " exited the roundabout");
            temp.next = head.next;
            head = head.next;
        }

        // Queue underflow safe check
        if (!waitingQueue.isEmpty()) {
            String nextCar = waitingQueue.poll();
            addCar(nextCar);
        }
    }

    // Print roundabout state
    void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
