package com.linkedlist.singlylinkedlist.inventorymanagement;

class InventoryList {
    private ItemNode head;

    // Add at beginning
    void addAtBeginning(ItemNode node) {
        node.next = head;
        head = node;
    }

    // Add at end
    void addAtEnd(ItemNode node) {
        if (head == null) {
            head = node;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    // Add at position (1-based)
    void addAtPosition(int pos, ItemNode node) {
        if (pos == 1) {
            addAtBeginning(node);
            return;
        }
        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        node.next = temp.next;
        temp.next = node;
    }

    // Remove by Item ID
    void removeById(int itemId) {
        if (head == null) return;

        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("Item removed");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != itemId)
            temp = temp.next;

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Item removed");
        } else {
            System.out.println("Item not found");
        }
    }

    // Update quantity
    void updateQuantity(int itemId, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by ID
    void searchById(int itemId) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                print(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Name
    void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Item not found");
    }

    // Total inventory value
    void totalValue() {
        ItemNode temp = head;
        double total = 0;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    // Sort by name or price (Bubble Sort – Linked List)
    void sortByName(boolean asc) {
        if (head == null) return;
        for (ItemNode i = head; i.next != null; i = i.next) {
            for (ItemNode j = head; j.next != null; j = j.next) {
                if ((asc && j.itemName.compareToIgnoreCase(j.next.itemName) > 0) ||
                    (!asc && j.itemName.compareToIgnoreCase(j.next.itemName) < 0)) {
                    swapData(j, j.next);
                }
            }
        }
        System.out.println("Sorted by name");
    }

    void sortByPrice(boolean asc) {
        if (head == null) return;
        for (ItemNode i = head; i.next != null; i = i.next) {
            for (ItemNode j = head; j.next != null; j = j.next) {
                if ((asc && j.price > j.next.price) ||
                    (!asc && j.price < j.next.price)) {
                    swapData(j, j.next);
                }
            }
        }
        System.out.println("Sorted by price");
    }

    private void swapData(ItemNode a, ItemNode b) {
        int id = a.itemId;
        String name = a.itemName;
        int qty = a.quantity;
        double price = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = id;
        b.itemName = name;
        b.quantity = qty;
        b.price = price;
    }

    // Display all items
    void display() {
        ItemNode temp = head;
        while (temp != null) {
            print(temp);
            temp = temp.next;
        }
    }

    private void print(ItemNode i) {
        System.out.println(
            i.itemId + " | " + i.itemName +
            " | Qty: " + i.quantity +
            " | Price: " + i.price
        );
    }
}
