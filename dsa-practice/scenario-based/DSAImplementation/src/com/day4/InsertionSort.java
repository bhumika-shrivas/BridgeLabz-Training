package com.day4;
/*SmartShelf – Real-Time Book Arrangement (Insertion Sort)
Story: In a digital library kiosk, as users add books to their reading list, the system must keep
the list sorted alphabetically by title. Since books are added one at a time and the list is
mostly sorted, Insertion Sort fits perfectly.
Key Concepts:
● Online/real-time sorting
● Efficient for nearly sorted data
● Stable sorting by title*/

import java.util.Scanner;

public class InsertionSort {
	
	static Scanner input = new Scanner(System.in);

	static int count = 0;
	
	// Create Array to store digital books
		public String[] createArray(int n) {
			String [] kiosk = new String[n];
			return kiosk;
		}

	// Method to store books
		
	void enterBook(String kiosk[], int n) {
		System.out.println("How many books do you want to add: ");
		int noOfBooks = input.nextInt(); 
		input.nextLine(); // clear Buffer
		
		for (int i=0; i<noOfBooks; i++) {
			if (count >= kiosk.length) {
				System.out.println("Reading list is full");
				return;
			}
			
			System.out.println("Enter Book name: ");
			kiosk[count] = input.nextLine();
			count++;
			
			insertionSort(kiosk, count);
			
			System.out.println("Current Sorted List:");
            for (int j = 0; j < count; j++) {
                System.out.println("- " + kiosk[j]);
            }
		}
	}
	
	// Method for Insertion sort
	static void insertionSort(String kiosk[], int n) {
		
		if (count == 0) {
			System.out.println("No books to sort\n");
			return;
		}
		
		// Sorting
		for (int i=1; i<n; i++) {
			String key = kiosk[i];
			int j = i - 1;
			
			while (j >= 0 && kiosk[j].compareTo(key)>0) {
				kiosk[j + 1] = kiosk[j];
				j--;
			}
			kiosk[j + 1] = key;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.print("Set the capacity of library to store books: ");
		int n = input.nextInt();
		
		// Create object to call the method
		InsertionSort ob = new InsertionSort();
		String[] arr = ob.createArray(n);
		
		// Method call for taking books into array
		ob.enterBook(arr, n);
	}
}
