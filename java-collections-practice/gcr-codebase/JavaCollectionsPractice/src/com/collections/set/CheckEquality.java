package com.collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckEquality {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set1 = new HashSet<>();
		
		System.out.println("How many numbers do you want to enter : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter elements : ");
		for(int i=0; i < n1; i++) {
			set1.add(sc.nextInt());
		}
		System.out.println("Set 1 elements : "+set1);
		
		Set<Integer> set2 = new HashSet<>();
		
		System.out.println("How many numbers do you want to enter : ");
		int n2 = sc.nextInt();
		
		System.out.println("Enter elements : ");
		for(int i=0; i < n2; i++) {
			set2.add(sc.nextInt());
		}
		System.out.println("Set 2 elements : "+set2);
		
		
		if(set1.containsAll(set2)) {
			System.out.println("Both sets are equal");
		}else {
			System.out.println("Sets are not equal");
		}
	}

}
