package com.day11.avltree;

import java.util.Scanner;

/*
 Story: Hospital Queue Management
Patients are sorted by check-in time and balanced for quick lookups.
Scenarios:
● 🔹 Scenario 1: Patient Registration
● 🔹 Scenario 2: Discharge/Delete Record
● 🔹 Scenario 3: Display by Arrival Time
 */
class PatientNode {
    int time, height;
    String name;
    PatientNode left, right;

    PatientNode(String name, int time) {
        this.name = name;
        this.time = time;
        height = 1;
    }
}

public class HospitalAVL {

    PatientNode root;
    static Scanner sc = new Scanner(System.in);

    int height(PatientNode n) { return n == null ? 0 : n.height; }

    PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        y.left = x.right;
        x.right = y;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        x.right = y.left;
        y.left = x;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    PatientNode insert(PatientNode node, String name, int time) {
        if (node == null) return new PatientNode(name, time);

        if (time < node.time)
            node.left = insert(node.left, name, time);
        else
            node.right = insert(node.right, name, time);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int bal = height(node.left) - height(node.right);

        if (bal > 1 && time < node.left.time) return rightRotate(node);
        if (bal < -1 && time > node.right.time) return leftRotate(node);

        return node;
    }

    void display(PatientNode n) {
        if (n != null) {
            display(n.left);
            System.out.println(n.name + " arrived at " + n.time);
            display(n.right);
        }
    }

    public static void main(String[] args) {

        HospitalAVL avl = new HospitalAVL();
        int ch;

        do {
            System.out.println("\nHospital Queue System");
            System.out.println("1. Register Patient");
            System.out.println("2. Display Queue");
            System.out.println("3. Exit");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> {
                    System.out.print("Patient Name: ");
                    String n = sc.nextLine();
                    System.out.print("Arrival Time: ");
                    int t = sc.nextInt();
                    avl.root = avl.insert(avl.root, n, t);
                }
                case 2 -> avl.display(avl.root);
            }
        } while (ch != 3);
    }
}
