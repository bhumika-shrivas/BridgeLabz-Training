package com.generics.smartwarehousemanagement;

import java.util.Scanner;

public class SmartWarehouseApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Separate storage for each category
		Storage<Electronics> electronicsStorage = new Storage<>();
		Storage<Groceries> groceryStorage = new Storage<>();
		Storage<Furniture> furnitureStorage = new Storage<>();
		
		int choice;
		do {
			System.out.println("SMART WAREHOUSE MENU");
			System.out.println("1. Add Electronice");
			System.out.println("2. Add Grocery");
			System.out.println("3. Add Furniture");
			System.out.println("4. Display all items ");
			System.out.println("0. Exit");
			System.out.println("Enyter choice: ");
			
			choice = input.nextInt();
			input.nextLine(); 
			
			switch (choice) {
			
			case 1: 
				System.out.print("Enter Electronics Name: ");
				String ename = input.nextLine();
				
				System.out.print("Enter Price: ");
				double eprice = input.nextDouble();
				
				System.out.print("Enter Warranty (years); ");
				int warranty = input.nextInt();
				
				electronicsStorage.addItem(
						new Electronics(ename, eprice, warranty));
				break;
				
			case 2:
				System.out.print("Enter Grocery Name: ");
				String gname = input.nextLine();
				
				
				System.out.print("Enter Price: ");
				double gprice = input.nextDouble();
				input.nextLine();
				
				System.out.print("Enter Expiry Date: ");
				int expiry = input.nextInt();
				
				groceryStorage.addItem(
						new Groceries(gname, gprice, expiry));
				break;
				
			case 3:
				System.out.print("Enter Furniture: " );
				String fname = input.nextLine();
				
				System.out.print("Enter Price: ");
				double fprice = input.nextDouble();
				input.nextLine();
				
				System.out.print("Enter Material: ");
				String material = input.nextLine();
				
				furnitureStorage.addItem(
						new Furniture(fname, fprice, material));
				break;
				
			case 4:
				// Using wildcard method
				WarehouseUtil.displayAllItems(electronicsStorage.getItems());
				WarehouseUtil.displayAllItems(groceryStorage.getItems());
				WarehouseUtil.displayAllItems(furnitureStorage.getItems());
				
				break;
				
			case 0:
				System.out.println("Exited");
				break;
				
			default:
				System.out.println("Enter a valid choice");		
						
			}
		} while (choice != 0);
		
		input.close();
	}

}
