package com.collections.list;
/*
Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20]*/

import java.util.*;

public class RotateList {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of list: ");
		int n = input.nextInt();
		
		// Take inputs
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter elements in the list (press enter after each input): ");
		for (int i=0; i<n; i++) {
			int e = input.nextInt();
			list.add(e);
		}
		
		System.out.println("Enter the number by which the list needs to be rotated: ");
		int r = input.nextInt();
		
		reverse(list, 0, r-1);
		reverse(list, r, n-1);
		reverse(list, 0, n-1);
		
		System.out.println("Result: " + list);
		input.close();
	}
	
	// Rotate logic
	public static void reverse(List<Integer> list, int start, int end) {
		while(start<end) {
			int temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);
			start++;
			end--;
		}
	}
} 
