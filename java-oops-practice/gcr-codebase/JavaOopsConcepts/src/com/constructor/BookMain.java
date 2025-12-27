package com.constructor.level1;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter title of book : ");
		String title = input.nextLine();
		
		System.out.println("Enter author name : ");
		String author = input.nextLine();
		
		System.out.println("Enter price of book : ");
		double price = input.nextDouble();
		
		Book b = new Book(title,author,price);
		b.display();
	}

}
