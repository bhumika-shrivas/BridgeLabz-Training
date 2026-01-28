package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MergeTwoMaps {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        System.out.println("Enter Map 1 Details");
        takeInput(sc, map1);

        System.out.println("\nEnter Map 2 Details");
        takeInput(sc, map2);

        System.out.println("\nMap 1: " + map1);
        System.out.println("Map 2: " + map2);

        Map<String, Integer> mergedMap = mergeMaps(map1, map2);

        System.out.println("Merged Map (After Summing): " + mergedMap);

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

    // merge logic
    static Map<String, Integer> mergeMaps(Map<String, Integer> map1,Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>();

        // copy map1 into result
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }

        // merge map2
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {

            String key = entry.getKey();
            int value = entry.getValue();

            if (result.containsKey(key)) {
                result.put(key, result.get(key) + value); // sum
            } else {
                result.put(key, value);
            }
        }

        return result;
    }
}
