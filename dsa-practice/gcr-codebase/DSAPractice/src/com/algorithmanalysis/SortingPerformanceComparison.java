package com.algorithmanalysis;

import java.util.Arrays;
import java.util.Random;

public class SortingPerformanceComparison {

    // ---------------- Bubble Sort ----------------
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ---------------- Merge Sort ----------------
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // ---------------- Quick Sort ----------------
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // ---------------- Main ----------------
    public static void main(String[] args) {
        int[] sizes = {1000, 10000}; // avoid bubble sort for very large sizes
        Random random = new Random();

        for (int size : sizes) {
            int[] original = new int[size];
            for (int i = 0; i < size; i++) {
                original[i] = random.nextInt(size);
            }

            System.out.println("\nDataset Size: " + size);

            // Bubble Sort
            int[] arr1 = original.clone();
            long start = System.nanoTime();
            bubbleSort(arr1);
            long bubbleTime = System.nanoTime() - start;
            System.out.println("Bubble Sort Time (ms): " + bubbleTime / 1_000_000.0);

            // Merge Sort
            int[] arr2 = original.clone();
            start = System.nanoTime();
            mergeSort(arr2, 0, arr2.length - 1);
            long mergeTime = System.nanoTime() - start;
            System.out.println("Merge Sort Time (ms): " + mergeTime / 1_000_000.0);

            // Quick Sort
            int[] arr3 = original.clone();
            start = System.nanoTime();
            quickSort(arr3, 0, arr3.length - 1);
            long quickTime = System.nanoTime() - start;
            System.out.println("Quick Sort Time (ms): " + quickTime / 1_000_000.0);
        }
    }
}
`