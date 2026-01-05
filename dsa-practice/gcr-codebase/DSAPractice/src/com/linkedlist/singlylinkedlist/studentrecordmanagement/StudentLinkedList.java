package com.linkedlist.singlylinkedlist.studentrecordmanagement;

class StudentLinkedList {
    private StudentNode head;

    // Add at beginning
    void addAtBeginning(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Add at specific position (1-based)
    void addAtPosition(int pos, int rollNo, String name, int age, char grade) {
        if (pos == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }
        StudentNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Roll Number
    void deleteByRollNo(int rollNo) {
        if (head == null) return;

        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
        else
            System.out.println("Student not found");
    }

    // Search by Roll Number
    void search(int rollNo) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Found: " + temp.name + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update grade
    void updateGrade(int rollNo, char newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Display all students
    void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(
                temp.rollNo + " | " + temp.name + " | " +
                temp.age + " | Grade: " + temp.grade
            );
            temp = temp.next;
        }
    }
}
