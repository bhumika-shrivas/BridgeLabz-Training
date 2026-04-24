package com.algorithmanalysis;

public class FibonacciPerformanceComparison {

    // -------- Recursive Fibonacci --------
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // -------- Iterative Fibonacci --------
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int[] testValues = {10, 30};

        for (int n : testValues) {
            System.out.println("\nFibonacci N = " + n);

            // Recursive
            long startRec = System.nanoTime();
            int recResult = fibonacciRecursive(n);
            long recTime = System.nanoTime() - startRec;

            // Iterative
            long startItr = System.nanoTime();
            int itrResult = fibonacciIterative(n);
            long itrTime = System.nanoTime() - startItr;

            System.out.println("Recursive Result: " + recResult);
            System.out.println("Recursive Time (ms): " + recTime / 1_000_000.0);

            System.out.println("Iterative Result: " + itrResult);
            System.out.println("Iterative Time (ms): " + itrTime / 1_000_000.0);
        }

        // Iterative only for large N
        int largeN = 50;
        long startLarge = System.nanoTime();
        int largeResult = fibonacciIterative(largeN);
        long largeTime = System.nanoTime() - startLarge;

        System.out.println("\nFibonacci N = " + largeN + " (Iterative Only)");
        System.out.println("Result: " + largeResult);
        System.out.println("Time (ms): " + largeTime / 1_000_000.0);
    }
}