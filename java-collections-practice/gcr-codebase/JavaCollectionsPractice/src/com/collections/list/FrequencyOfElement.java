package com.collections.list;

/*Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.*/

import java.util.*;

public class FrequencyOfElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = input.nextInt();
		List<String> list = new ArrayList<>();
		System.out.println("Enter the element: ");
		for (int i=0; i<n; i++) {
			String e = input.next();
			list.add(e);
		}
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String word: list) {
			map.put(word, map.getOrDefault(word, 0)+1);
				
			}
		System.out.println("Result: " + map);
		input.close();
		}
	}
