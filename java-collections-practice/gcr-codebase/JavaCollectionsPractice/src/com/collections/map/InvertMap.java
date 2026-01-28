package com.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InvertMap {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Original Map
        Map<String, Integer> originalMap = new HashMap<>();

        System.out.print("How many entries you want to add: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter key (String): ");
            String key = sc.next();

            System.out.print("Enter value (Integer): ");
            int value = sc.nextInt();

            originalMap.put(key, value);
        }

        System.out.println("\nOriginal Map: " + originalMap);

        // invert map
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            if (invertedMap.containsKey(value)) {
                invertedMap.get(value).add(key);
            } else {
                List<String> list = new ArrayList<>();
                list.add(key);
                invertedMap.put(value, list);
            }
        }

        System.out.println("Inverted Map: " + invertedMap);

        sc.close();
    }
}
