package com.collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SymmetricDifference {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("How many numbers you want to enter in Set 1:");
        int n1 = sc.nextInt();

        System.out.println("Enter elements of Set 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        System.out.println("Set 1: " + set1);

      
        System.out.println("How many numbers you want to enter in Set 2:");
        int n2 = sc.nextInt();

        System.out.println("Enter elements of Set 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        System.out.println("Set 2: " + set2);

        // SYMMETRIC DIFFERENCE 
        Set<Integer> symmetricDiff = new HashSet<>();

        // elements in set1 but not in set2
        for (Integer x : set1) {
            if (!set2.contains(x)) {
                symmetricDiff.add(x);
            }
        }

        // elements in set2 but not in set1
        for (Integer x : set2) {
            if (!set1.contains(x)) {
                symmetricDiff.add(x);
            }
        }

        System.out.println("Symmetric Difference: " + symmetricDiff);

        sc.close();
    }
}
