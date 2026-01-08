package com.algorithmanalysis;

import java.util.*;

public class SearchDataStructureComparison {

    // Linear search in array
    public static boolean arraySearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] sizes = {1_000, 100_000, 1_000_000};
        Random random = new Random();

        for (int size : sizes) {
            System.out.println("\nDataset Size: " + size);

            int[] array = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            // Fill data structures
            for (int i = 0; i < size; i++) {
                int value = random.nextInt(size * 2);
                array[i] = value;
                hashSet.add(value);
                treeSet.add(value);
            }

            int target = array[size - 1]; // worst-case for array

            // -------- Array Search --------
            long startArray = System.nanoTime();
            arraySearch(array, target);
            long arrayTime = System.nanoTime() - startArray;

            // -------- HashSet Search --------
            long startHashSet = System.nanoTime();
            hashSet.contains(target);
            long hashSetTime = System.nanoTime() - startHashSet;

            // -------- TreeSet Search --------
            long startTreeSet = System.nanoTime();
            treeSet.contains(target);
            long treeSetTime = System.nanoTime() - startTreeSet;

            System.out.println("Array Search Time (ms): " + arrayTime / 1_000_000.0);
            System.out.println("HashSet Search Time (ms): " + hashSetTime / 1_000_000.0);
            System.out.println("TreeSet Search Time (ms): " + treeSetTime / 1_000_000.0);
        }
    }
}
