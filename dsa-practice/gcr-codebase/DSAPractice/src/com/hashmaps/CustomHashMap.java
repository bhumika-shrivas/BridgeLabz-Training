package com.hashmaps;

import java.util.Scanner;

public class CustomHashMap {

    // Node for linked list
    static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Custom HashMap class
    static class MyHashMap {

        private static final int SIZE = 16;   // bucket size
        private Node[] table;

        MyHashMap() {
            table = new Node[SIZE];
        }

        // Hash function
        private int hash(int key) {
            return Math.abs(key) % SIZE;
        }

        // Insert or update
        public void put(int key, int value) {
            int index = hash(key);
            Node head = table[index];

            while (head != null) {
                if (head.key == key) {
                    head.value = value; // update
                    return;
                }
                head = head.next;
            }

            // insert at beginning
            Node newNode = new Node(key, value);
            newNode.next = table[index];
            table[index] = newNode;
        }

        // Retrieve value
        public Integer get(int key) {
            int index = hash(key);
            Node head = table[index];

            while (head != null) {
                if (head.key == key) {
                    return head.value;
                }
                head = head.next;
            }
            return null;
        }

        // Remove key
        public void remove(int key) {
            int index = hash(key);
            Node head = table[index];
            Node prev = null;

            while (head != null) {
                if (head.key == key) {
                    if (prev == null) {
                        table[index] = head.next;
                    } else {
                        prev.next = head.next;
                    }
                    return;
                }
                prev = head;
                head = head.next;
            }
        }
    }

    // Usage
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyHashMap map = new MyHashMap();

        while (true) {
            System.out.println("\n1. Put");
            System.out.println("2. Get");
            System.out.println("3. Remove");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key and value: ");
                    int key = sc.nextInt();
                    int value = sc.nextInt();
                    map.put(key, value);
                    System.out.println("Inserted successfully.");
                    break;

                case 2:
                    System.out.print("Enter key: ");
                    key = sc.nextInt();
                    Integer result = map.get(key);
                    System.out.println(
                        result != null ? "Value = " + result : "Key not found"
                    );
                    break;

                case 3:
                    System.out.print("Enter key to remove: ");
                    key = sc.nextInt();
                    map.remove(key);
                    System.out.println("Removed successfully.");
                    break;

                case 4:
                    System.out.println("Exited");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
