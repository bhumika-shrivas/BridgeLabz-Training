package com.linkedlist.doublylinkedlist.moviemanagement;

import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieList list = new MovieList();
        int choice;

        do {
            System.out.println("\n1.Add Begin  2.Add End  3.Add Position");
            System.out.println("4.Delete  5.Search Director  6.Search Rating");
            System.out.println("7.Update Rating  8.Display Forward  9.Display Reverse");
            System.out.println("0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    System.out.print("Director: ");
                    String d = sc.nextLine();
                    System.out.print("Year: ");
                    int y = sc.nextInt();
                    System.out.print("Rating: ");
                    double r = sc.nextDouble();

                    MovieNode node = new MovieNode(t, d, y, r);

                    if (choice == 1) list.addAtBeginning(node);
                    else if (choice == 2) list.addAtEnd(node);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        list.addAtPosition(pos, node);
                    }
                    break;

                case 4:
                    System.out.print("Enter title: ");
                    list.deleteByTitle(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Director: ");
                    list.searchByDirector(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Rating: ");
                    list.searchByRating(sc.nextDouble());
                    break;

                case 7:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("New Rating: ");
                    list.updateRating(title, sc.nextDouble());
                    break;

                case 8:
                    list.displayForward();
                    break;

                case 9:
                    list.displayReverse();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
