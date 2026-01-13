package com.day9.gamebox;

import java.util.*;

public class GameBoxApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Game> storeGames = new ArrayList<>();

        System.out.print("Enter username: ");
        User user = new User(sc.nextLine());

        while (true) {
            System.out.println("""
            1. Add Game to Store
            2. View Store Games
            3. Play Demo
            4. Buy Game
            5. Apply Seasonal Discount
            6. View Owned Games
            7. Exit
            """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Game Type (Arcade/Strategy): ");
                    String type = sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();
                    sc.nextLine();

                    Game game = type.equalsIgnoreCase("arcade")
                            ? new ArcadeGame(title, price, rating)
                            : new StrategyGame(title, price, rating);

                    storeGames.add(game);
                    System.out.println("Game added to store");
                }

                case 2 -> {
                    for (int i = 0; i < storeGames.size(); i++) {
                        Game g = storeGames.get(i);
                        System.out.println(i + ". " + g.getTitle() +
                                " | Price: " + g.getPrice());
                    }
                }

                case 3 -> {
                    System.out.print("Game index: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    storeGames.get(idx).playDemo();
                }

                case 4 -> {
                    System.out.print("Game index: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    user.buyGame(storeGames.get(idx));
                }

                case 5 -> {
                    System.out.print("Discount %: ");
                    double d = sc.nextDouble();
                    for (Game g : storeGames) {
                        g.applyDiscount(d);
                    }
                    System.out.println("Seasonal offer applied");
                }

                case 6 -> user.showOwnedGames();

                case 7 -> {
                    System.out.println("GameBox closed");
                    return;
                }
            }
        }
    }
}
