package com.generics.smartwarehousemanagement;

import java.util.List;

// Utility class to display any type of WarehouseItem
public class WarehouseUtil {
	
	// Wildcards allows Electronics, Groceries, furniture etc
	public static void displayAllItems(List<? extends WarehouseItem>list) {
		System.out.println("\nItems in Warehouse");
		
		for (WarehouseItem item : list) {
			item.displayInfo(); // runtime polymorphism
			
		}
	}

}
