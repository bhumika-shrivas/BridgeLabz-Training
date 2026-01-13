package com.day9.gamebox;

class StrategyGame extends Game {

    StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void playDemo() {
        System.out.println(getTitle() + " demo: Strategic planning challenge!");
    }
}
