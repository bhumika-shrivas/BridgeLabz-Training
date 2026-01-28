package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {

	public static void reverseQueue(Queue<Integer> queue) {

        // base case
        if (queue.isEmpty()) {
            return;
        }

        // remove front element
        int front = queue.remove();

        // reverse remaining queue
        reverseQueue(queue);

        // add removed element at rear
        queue.add(front);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        System.out.println("How many elements you want to enter:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        System.out.println("Original Queue: " + queue);

        // reverse
        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);

        sc.close();
    }
}
