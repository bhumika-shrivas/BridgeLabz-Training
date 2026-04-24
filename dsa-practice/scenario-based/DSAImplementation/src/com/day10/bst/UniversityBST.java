package com.day10.bst;

import java.util.Scanner;

/* Story: University's Digital Record System
The university needs an efficient way to manage student records searchable by roll number.
Scenarios:
● 🔹 Scenario 1: Insertion — As students enroll, insert their roll numbers with personal
details.
● 🔹 Scenario 2: Deletion — If a student leaves, remove their record.
● 🔹 Scenario 3: Search & Display — A professor wants a sorted list of student roll
numbers for attendance. */

class StudentNode {
    int roll;
    String name;
    StudentNode left, right;

    StudentNode(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class UniversityBST {

    StudentNode root;
    static Scanner sc = new Scanner(System.in);

    // Insert
    StudentNode insert(StudentNode root, int roll, String name) {
        if (root == null) return new StudentNode(roll, name);
        if (roll < root.roll) root.left = insert(root.left, roll, name);
        else if (roll > root.roll) root.right = insert(root.right, roll, name);
        return root;
    }

    // Search
    StudentNode search(StudentNode root, int roll) {
        if (root == null || root.roll == roll) return root;
        return roll < root.roll ? search(root.left, roll) : search(root.right, roll);
    }

    // Inorder (sorted roll numbers)
    void inorder(StudentNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Roll: " + root.roll + " | Name: " + root.name);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        UniversityBST bst = new UniversityBST();
        int choice;

        do {
            System.out.println("\n🎓 University Record System");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Display Sorted Roll List");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Roll No: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    bst.root = bst.insert(bst.root, r, n);
                }
                case 2 -> {
                    System.out.print("Roll No to search: ");
                    StudentNode s = bst.search(bst.root, sc.nextInt());
                    System.out.println(s != null ? "Found: " + s.name : "Not Found");
                }
                case 3 -> bst.inorder(bst.root);
            }
        } while (choice != 4);
    }
}
