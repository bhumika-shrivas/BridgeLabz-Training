package com.collections.list;

/*
 * Find the Nth Element from the End
Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
Example:
Input: [A, B, C, D, E], N=2 → Output: D.

 */

import java.util.LinkedList;
import java.util.Scanner;

public class NthElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter the elements: ");
		for(int i=0; i<n ; i++) {
			int e = sc.nextInt();
			list.add(e);
		}
		System.out.println("Enter the index you want value of from the last : ");
		int idx = sc.nextInt();
		if(idx>=n) System.out.println("Invalid index");
		else {
			System.out.println("Result: " + list.get(n-idx));
		}
		
		sc.close();
	}
}