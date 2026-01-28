package com.collections.queue;

import java.util.Scanner;

class CircularBuffer {

    private int[] buffer;
    private int front = 0, rear = 0, size = 0, capacity;

    CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
    }

    // INSERT (overwrite if full)
    void insert(int value) {

        if (size == capacity) {
            // overwrite oldest
            front = (front + 1) % capacity;
            size--;
        }

        buffer[rear] = value;
        rear = (rear + 1) % capacity;
        size++;

        System.out.println("Inserted: " + value);
        display();
    }

    // REMOVE (optional operation)
    void remove() {
        if (size == 0) {
            System.out.println("Buffer is empty. Nothing to remove.");
            return;
        }

        int removed = buffer[front];
        front = (front + 1) % capacity;
        size--;

        System.out.println("Removed: " + removed);
        display();
    }

    // DISPLAY BUFFER
    void display() {
        if (size == 0) {
            System.out.println("Buffer is empty.");
            return;
        }

        System.out.print("Buffer: [ ");
        int i = front;

        for (int count = 0; count < size; count++) {
            System.out.print(buffer[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println("]");
    }
}


public class CircularBufferSimulation {

	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter buffer size: ");
        int capacity = sc.nextInt();

        CircularBuffer cb = new CircularBuffer(capacity);

        while (true) {

            System.out.println("\n===== CIRCULAR BUFFER MENU =====");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Display Buffer");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    cb.insert(val);
                    break;

                case 2:
                    cb.remove();
                    break;

                case 3:
                    cb.display();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
