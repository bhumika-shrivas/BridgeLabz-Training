package com.day8.artify;

class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
        this.licensingTerms = "Digital use only – single device";
    }

    @Override
    public void license() {
        System.out.println("Digital Art License: " + licensingTerms);
    }
}
