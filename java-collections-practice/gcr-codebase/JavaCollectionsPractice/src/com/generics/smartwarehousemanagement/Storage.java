package com.generics.smartwarehousemanagement;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
	private List<T> items = new ArrayList<>();
	
	// Add item safely
	public void addItem(T item) {
		items.add(item);
	}
	
	// Return all stored items
    public List<T> getItems() {
        return items;
    }
}

