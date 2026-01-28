package com.exceptions;

import java.util.Scanner;

public class MultipleCatchBlocks {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter array size: ");
	            int size = sc.nextInt();

	            int[] arr = new int[size];   // may cause issues if size is 0

	            System.out.println("Enter " + size + " elements:");
	            for (int i = 0; i < size; i++) {
	                arr[i] = sc.nextInt();
	            }

	            System.out.print("Enter index to retrieve value: ");
	            int index = sc.nextInt();

	            System.out.println("Value at index " + index + ": " + arr[index]);

	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Invalid index!");

	        } catch (NullPointerException e) {
	            System.out.println("Array is not initialized!");

	        } finally {
	            sc.close();
	        }
	    }

}
