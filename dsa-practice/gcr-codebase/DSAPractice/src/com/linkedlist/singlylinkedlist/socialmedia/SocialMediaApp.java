package com.linkedlist.singlylinkedlist.socialmedia;

import java.util.Scanner;

public class SocialMediaApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SocialNetwork sn = new SocialNetwork();
        int choice;

        do {
            System.out.println("\n1.Add User 2.Add Friend 3.Remove Friend");
            System.out.println("4.Display Friends 5.Mutual Friends");
            System.out.println("6.Search Name 7.Search ID");
            System.out.println("8.Count Friends 0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sn.addUser(id, name, age);
                    break;

                case 2:
                    System.out.print("User1 ID: ");
                    int u1 = sc.nextInt();
                    System.out.print("User2 ID: ");
                    int u2 = sc.nextInt();
                    sn.addFriend(u1, u2);
                    break;

                case 3:
                    System.out.print("User1 ID: ");
                    int r1 = sc.nextInt();
                    System.out.print("User2 ID: ");
                    int r2 = sc.nextInt();
                    sn.removeFriend(r1, r2);
                    break;

                case 4:
                    System.out.print("User ID: ");
                    sn.displayFriends(sc.nextInt());
                    break;

                case 5:
                    System.out.print("User1 ID: ");
                    int m1 = sc.nextInt();
                    System.out.print("User2 ID: ");
                    int m2 = sc.nextInt();
                    sn.mutualFriends(m1, m2);
                    break;

                case 6:
                    System.out.print("Name: ");
                    sn.searchByName(sc.nextLine());
                    break;

                case 7:
                    System.out.print("User ID: ");
                    UserNode u = sn.findUserById(sc.nextInt());
                    if (u != null)
                        System.out.println(u.name + ", Age: " + u.age);
                    else
                        System.out.println("User not found");
                    break;

                case 8:
                    sn.countFriends();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
