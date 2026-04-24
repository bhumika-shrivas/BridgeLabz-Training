package com.linkedlist.circularlinkedlist.roundrobinalgo;

import java.util.Scanner;

public class RoundRobinApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("\nProcess ID: ");
            int pid = sc.nextInt();
            System.out.print("Burst Time: ");
            int bt = sc.nextInt();
            System.out.print("Priority: ");
            int pr = sc.nextInt();

            scheduler.addProcess(new ProcessNode(pid, bt, pr));
        }

        System.out.print("\nEnter Time Quantum: ");
        int tq = sc.nextInt();

        scheduler.simulate(tq);
        sc.close();
    }
}
