package com.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SetToSortedList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.println("How many numbers you want to enter:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("HashSet: " + set);

        // SET → LIST 
        List<Integer> list = new ArrayList<>(set);

        // SORT (Ascending)
        Collections.sort(list);

        System.out.println("Sorted List (Ascending): " + list);

        sc.close();
    }
		
}
