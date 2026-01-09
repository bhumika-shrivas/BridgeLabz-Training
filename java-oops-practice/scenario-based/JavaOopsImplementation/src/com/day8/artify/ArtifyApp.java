package com.day8.artify;

import java.util.ArrayList;
import java.util.Scanner;

class ArtifyApp {

    static ArrayList<Artwork> artworks = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== Welcome to Artify ===");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter wallet balance: ");
        double balance = input.nextDouble();
        input.nextLine();

        User user = new User(name, balance);

        int choice;
        do {
            System.out.println("\n1. Enter as Artist");
            System.out.println("2. Enter as Buyer");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> artistMenu();
                case 2 -> buyerMenu(user);
                case 3 -> System.out.println("Exiting Artify... Thank you!");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 3);

        input.close();
    }

    // ---------------- ARTIST MENU ----------------
    static void artistMenu() {
        System.out.print("Enter artwork type (1. Digital 2. Print): ");
        int type = input.nextInt();
        input.nextLine();

        System.out.print("Title: ");
        String title = input.nextLine();

        System.out.print("Artist name: ");
        String artist = input.nextLine();

        System.out.print("Price: ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.print("License type: ");
        String license = input.nextLine();

        Artwork art;
        if (type == 1) {
            art = new DigitalArt(title, artist, price, license);
        } else {
            System.out.print("Preview file name: ");
            String preview = input.nextLine();
            art = new PrintArt(title, artist, price, license, preview);
        }

        artworks.add(art);
        System.out.println("Artwork added successfully!");
    }

    // ---------------- BUYER MENU ----------------
    static void buyerMenu(User user) {
        if (artworks.isEmpty()) {
            System.out.println("No artworks available.");
            return;
        }

        System.out.println("\nAvailable Artworks:");
        for (int i = 0; i < artworks.size(); i++) {
            Artwork a = artworks.get(i);
            System.out.println((i + 1) + ". " + a.title + " - ₹" + a.price);
        }

        System.out.print("Choose artwork number to buy (0 to cancel): ");
        int option = input.nextInt();

        if (option > 0 && option <= artworks.size()) {
            Artwork selected = artworks.get(option - 1);
            selected.purchase(user);
            selected.license();
            System.out.println("Wallet Balance: ₹" + user.getWalletBalance());
        }
    }
}
