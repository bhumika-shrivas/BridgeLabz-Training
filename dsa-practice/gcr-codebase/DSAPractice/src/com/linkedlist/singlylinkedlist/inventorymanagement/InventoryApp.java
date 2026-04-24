package com.linkedlist.singlylinkedlist.inventorymanagement;

import java.util.Scanner;

public class InventoryApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryList list = new InventoryList();
        int choice;

        do {
            System.out.println("\n1.Add Begin 2.Add End 3.Add Position");
            System.out.println("4.Remove 5.Update Qty 6.Search ID 7.Search Name");
            System.out.println("8.Total Value 9.Sort Name 10.Sort Price");
            System.out.println("11.Display 0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    ItemNode node = new ItemNode(id, name, qty, price);

                    if (choice == 1) list.addAtBeginning(node);
                    else if (choice == 2) list.addAtEnd(node);
                    else {
                        System.out.print("Position: ");
                        list.addAtPosition(sc.nextInt(), node);
                    }
                    break;

                case 4:
                    System.out.print("Item ID: ");
                    list.removeById(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Item ID: ");
                    int iid = sc.nextInt();
                    System.out.print("New Quantity: ");
                    list.updateQuantity(iid, sc.nextInt());
                    break;

                case 6:
                    System.out.print("Item ID: ");
                    list.searchById(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Item Name: ");
                    list.searchByName(sc.nextLine());
                    break;

                case 8:
                    list.totalValue();
                    break;

                case 9:
                    System.out.print("1.Asc 2.Desc: ");
                    list.sortByName(sc.nextInt() == 1);
                    break;

                case 10:
                    System.out.print("1.Asc 2.Desc: ");
                    list.sortByPrice(sc.nextInt() == 1);
                    break;

                case 11:
                    list.display();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
