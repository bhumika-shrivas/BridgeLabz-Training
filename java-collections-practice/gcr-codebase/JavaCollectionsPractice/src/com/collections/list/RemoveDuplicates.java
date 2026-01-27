package com.collections.list;

/*Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].
*/

import java.util.*;

public class RemoveDuplicates {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter size of list: ");
		 int n = input.nextInt();
		 
		 System.out.println("Enter the element (press enter ater each input): ");
		 List<Integer> list = new ArrayList<>();
		 for (int i=0; i<n; i++) {
			 int e = input.nextInt();
			 list.add(e);
		 }
		 
		 Set<Integer> set = new LinkedHashSet<>();
		 for (int num : list) {
			 set.add(num);
		 }
		 
		 System.out.println("Result: " + set);
		 input.close();

	 }
	
}
