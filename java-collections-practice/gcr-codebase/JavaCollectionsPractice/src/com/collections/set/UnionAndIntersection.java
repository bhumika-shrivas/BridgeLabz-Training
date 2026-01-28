package com.collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionAndIntersection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		System.out.println("How many numbers you want to enter in set 1 :");
		int n1 = sc.nextInt();
		
		System.out.println("Add elements for set 1 :");
		for(int i=0; i < n1; i++) {
			set1.add(sc.nextInt());
		}
		
		System.out.println("Elements of set 1 : " +set1);
		
		System.out.println("How many numbers you want to enter in set 2 :");
		int n2 = sc.nextInt();
		
		System.out.println("Add elements for set 2 :");
		for(int i=0; i < n2; i++) {
			set2.add(sc.nextInt());
		}
		
		System.out.println("Elements of set 2 : " +set2);
		
		//union 
		Set<Integer> unionSet = new HashSet<>(set1); // copy of set1
        unionSet.addAll(set2); // adds all elements of set2
        System.out.println("Union of both sets: " + unionSet);
        
        //intersection
        Set<Integer> intersectionSet = new HashSet<>(set1); // copy of set1
        intersectionSet.retainAll(set2); // keeps only common elements
        System.out.println("Intersection of both sets: " + intersectionSet);


	}
}
