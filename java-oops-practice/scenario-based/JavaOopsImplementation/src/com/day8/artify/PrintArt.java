package com.day8.artify;

class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price, String licenseType, String preview) {
        super(title, artist, price, licenseType, preview);
        this.licensingTerms = "Limited print – no redistribution";
    }

    @Override
    public void license() {
        System.out.println("Print Art License: " + licensingTerms);
    }
}
