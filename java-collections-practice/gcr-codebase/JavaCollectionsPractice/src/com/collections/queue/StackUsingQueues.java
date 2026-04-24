package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class ImplementStackUsingQueues {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // PUSH
    void push(int x) {

        // Step 1: add to empty queue q2
        q2.add(x);

        // Step 2: move all from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Step 3: swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        System.out.println(x + " pushed into stack.");
        display();
    }

    // POP
    void pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }
        int removed = q1.remove();
        System.out.println("Popped element: " + removed);
        display();
    }

    // TOP
    void top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element: " + q1.peek());
    }

    // DISPLAY
    void display() {
        if (q1.isEmpty()) {
            System.out.println("Stack: Empty");
            return;
        }
        System.out.println("Stack (Top to Bottom): " + q1);
    }

    boolean isEmpty() {
        return q1.isEmpty();
    }
}
public class StackUsingQueues {

	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();

        while (true) {

            System.out.println("\n===== STACK USING QUEUES MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Display Stack");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element to push: ");
                    int x = sc.nextInt();
                    stack.push(x);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.top();
                    break;

                case 4:
                    stack.display();
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
