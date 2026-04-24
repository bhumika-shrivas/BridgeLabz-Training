package com.collections.list;

/*Reverse a List
		Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
		Example:
		Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].
*/

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseList {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter number of element for list:");
		int n = input.nextInt();
		List <Integer> list1 = new ArrayList<>();
		List <Integer> list2 = new LinkedList<>();
		System.out.println("Enter the elements (press enter after each number): ");
		for (int i=0; i<n; i++) {
			int e = input.nextInt();
			input.nextLine();
			list1.add(e);
			list2.add(e);
		}
		
		int start=0, end=n-1;
		
		while(start<end) {
			int temp = list1.get(start);
			list1.set(start, list1.get(end));
			list1.set(end, temp);
			start++;
			end--;
		}
		
		// reset values for linkedlist
		
		start = 0;
		end = n-1;
		
		while(start<end) {
			int temp = list2.get(start);
			list2.set(start, list2.get(end));
			list2.set(end, temp);
			start++;
			end--;
		}
		
		System.out.println("Reversed list using ArrayList: " + list1);
		System.out.println("Reversed list using LinkedList: " + list2);
		input.close();
	}
}
