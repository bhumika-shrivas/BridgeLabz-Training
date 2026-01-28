package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyHighestValue {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        takeInput(sc, map);

        System.out.println("\nEntered Map: " + map);

        String maxKey = findMaxKey(map);

        System.out.println("Key with Highest Value: " + maxKey);

        sc.close();
    }

    static void takeInput(Scanner sc, Map<String, Integer> map) {

        System.out.print("How many entries: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = sc.next();

            System.out.print("Enter value: ");
            int value = sc.nextInt();

            map.put(key, value);
        }
    }

    // FIND MAX VALUE KEY
    static String findMaxKey(Map<String, Integer> map) {

        int maxValue = Integer.MIN_VALUE;
        String maxKey = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}
