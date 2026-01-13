package com.day9.gamebox;

class ArcadeGame extends Game{
	ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    @Override
    public void playDemo() {
        System.out.println(getTitle() + " demo: Fast-paced arcade action!");
    }
}