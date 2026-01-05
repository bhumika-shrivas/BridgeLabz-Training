package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentRecordApp {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Amit", 20, 'A');
        list.addAtEnd(2, "Neha", 21, 'B');
        list.addAtPosition(2, 3, "Riya", 19, 'A');

        list.display();

        list.search(2);
        list.updateGrade(2, 'A');

        list.deleteByRollNo(1);

        System.out.println("\nAfter Updates:");
        list.display();
    }
}
