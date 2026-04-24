package com.day11.avltree;

import java.util.Scanner;

/*Story: Online Ticket Booking by Time
Users book event tickets sorted by event time.
Scenarios:
● 🔹 Scenario 1: Insert Event — Add new event based on start time.
● 🔹 Scenario 2: Cancel Event — Admin deletes a cancelled event.
● 🔹 Scenario 3: Show Events in Order — Display events in upcoming order.*/

class EventNode {
    int time, height;
    String name;
    EventNode left, right;

    EventNode(String name, int time) {
        this.name = name;
        this.time = time;
        height = 1;
    }
}

public class TicketAVL {

    EventNode root;
    static Scanner sc = new Scanner(System.in);

    int h(EventNode n) { return n == null ? 0 : n.height; }

    EventNode rotateRight(EventNode y) {
        EventNode x = y.left;
        y.left = x.right;
        x.right = y;
        y.height = Math.max(h(y.left), h(y.right)) + 1;
        x.height = Math.max(h(x.left), h(x.right)) + 1;
        return x;
    }

    EventNode rotateLeft(EventNode x) {
        EventNode y = x.right;
        x.right = y.left;
        y.left = x;
        x.height = Math.max(h(x.left), h(x.right)) + 1;
        y.height = Math.max(h(y.left), h(y.right)) + 1;
        return y;
    }

    EventNode insert(EventNode node, String name, int time) {
        if (node == null) return new EventNode(name, time);

        if (time < node.time)
            node.left = insert(node.left, name, time);
        else
            node.right = insert(node.right, name, time);

        node.height = 1 + Math.max(h(node.left), h(node.right));
        int bal = h(node.left) - h(node.right);

        if (bal > 1 && time < node.left.time) return rotateRight(node);
        if (bal < -1 && time > node.right.time) return rotateLeft(node);

        return node;
    }

    void inorder(EventNode n) {
        if (n != null) {
            inorder(n.left);
            System.out.println(n.name + " at " + n.time);
            inorder(n.right);
        }
    }

    public static void main(String[] args) {

        TicketAVL avl = new TicketAVL();
        int ch;

        do {
            System.out.println("\nTicket Booking System");
            System.out.println("1. Add Event");
            System.out.println("2. Show Upcoming Events");
            System.out.println("3. Exit");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> {
                    System.out.print("Event Name: ");
                    String n = sc.nextLine();
                    System.out.print("Start Time: ");
                    int t = sc.nextInt();
                    avl.root = avl.insert(avl.root, n, t);
                }
                case 2 -> avl.inorder(avl.root);
            }
        } while (ch != 3);
    }
}
