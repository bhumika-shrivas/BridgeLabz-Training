package com.day9.gamebox;

import java.util.ArrayList;

class User {

    private String username;
    private ArrayList<Game> ownedGames = new ArrayList<>();

    User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    // Controlled access
    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.getTitle() + " added to library");
    }

    public void showOwnedGames() {
        if (ownedGames.isEmpty()) {
            System.out.println("No games owned");
            return;
        }
        System.out.println("Owned Games:");
        for (Game g : ownedGames) {
            System.out.println("- " + g.getTitle());
        }
    }
}
