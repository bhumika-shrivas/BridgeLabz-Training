package com.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of N:");
        int n = sc.nextInt();

        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        // start with "1"
        queue.add("1");

        for (int i = 1; i <= n; i++) {

            // remove front
            String current = queue.remove();
            result.add(current);

            // generate next binaries
            queue.add(current + "0");
            queue.add(current + "1");
        }

        System.out.println("First " + n + " Binary Numbers:");
        System.out.println(result);

        sc.close();
    }
}
