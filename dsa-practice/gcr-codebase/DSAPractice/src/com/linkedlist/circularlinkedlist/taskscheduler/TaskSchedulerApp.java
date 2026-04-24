package com.linkedlist.circularlinkedlist.taskscheduler;

import java.util.Scanner;

public class TaskSchedulerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaskCircularList list = new TaskCircularList();
        int choice;

        do {
            System.out.println("\n1.Add Begin  2.Add End  3.Add Position");
            System.out.println("4.Remove Task  5.View Next Task");
            System.out.println("6.Display All  7.Search by Priority");
            System.out.println("0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Priority: ");
                    int p = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Due Date: ");
                    String d = sc.nextLine();

                    TaskNode node = new TaskNode(id, name, p, d);

                    if (choice == 1) list.addAtBeginning(node);
                    else if (choice == 2) list.addAtEnd(node);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        list.addAtPosition(pos, node);
                    }
                    break;

                case 4:
                    System.out.print("Enter Task ID: ");
                    list.removeById(sc.nextInt());
                    break;

                case 5:
                    list.viewNextTask();
                    break;

                case 6:
                    list.displayAll();
                    break;

                case 7:
                    System.out.print("Priority: ");
                    list.searchByPriority(sc.nextInt());
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
