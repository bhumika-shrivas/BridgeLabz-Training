package com.day8;

import java.util.Scanner;

/*MovieTime – Theater Show Listings (Insertion Sort)
Story: A movie theater allows users to sort upcoming showtimes. Since shows are added
throughout the day and the existing list is almost sorted, the app uses Insertion Sort to insert
each new show in the correct time slot.
Concepts Involved:
● Insertion Sort
● Real-time insertion
● Time-based ordering*/

public class MovieTime {
	
	static Scanner sc = new Scanner(System.in);

	// Create array for movies and timings
	String[] movieNames = new String[50];
	String[] movieTime = new String[50];

	static int count = 0;

	// Method to add Movies
	public void addMovies() {

		System.out.print("Enter Movie name: ");
		movieNames[count] = sc.nextLine();

		System.out.print("Enter movie time (HH:MM): ");
		movieTime[count] = sc.nextLine();

		// Insertion sort logic (real-time insertion)
		for (int i = count; i > 0; i--) {
			if (movieTime[i].compareTo(movieTime[i - 1]) < 0) {
				// swap time
				String tempTime = movieTime[i];
				movieTime[i] = movieTime[i - 1];
				movieTime[i - 1] = tempTime;

				// swap movie name to keep mapping
				String tempMovie = movieNames[i];
				movieNames[i] = movieNames[i - 1];
				movieNames[i - 1] = tempMovie;
			} else {
				break;
			}
		}

		System.out.println("Movie added successfully");
		count++;
	}

	// Method to display sorted movies
	static void insertionSort(String movieTime[]) {
		
		if (count == 0) {
			System.out.println("No movies to sort\n");
			return;
		}
		// Sorting already handled during insertion
	}

	// Method to show unsorted movies (added order)
	public void showMovies() {

		if (count == 0) {
			System.out.println("No movies available");
		} else {
			for (int i = 0; i < count; i++) {
				System.out.println(movieNames[i] + " -> " + movieTime[i]);
			}
		}
	}

	// Method to display movies (sorted by time)
	public void displayMovies() {

		if (count == 0) {
			System.out.println("No movies available");
			return;
		}

		System.out.println("Movies Sorted by Show Time:");
		for (int i = 0; i < count; i++) {
			System.out.println(movieNames[i] + " -> " + movieTime[i]);
		}
	}

	public static void main(String[] args) {

		System.out.println("Movie Time Sorting using Insertion Sort");

		MovieTime ob = new MovieTime();
		int choice;
		
		do {
			System.out.println(
				"1. Add Movie \n2. View Sorted Movie shows (on basis of timings) \n3. View Movies (on the sequence they are added) \n4. Exit");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				ob.addMovies();
				break;
			case 2:
				ob.displayMovies();
				break;
			case 3:
				ob.showMovies();
				break;
			case 4:
				System.out.println("You are out of the program. Thank you!");
				break;
			default:
				System.out.println("Please enter a valid option");
			}
		} while (choice != 4);
	}
}
