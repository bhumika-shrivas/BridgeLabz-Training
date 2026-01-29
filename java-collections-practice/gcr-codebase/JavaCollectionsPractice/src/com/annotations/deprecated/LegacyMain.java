package com.annotations.deprecated;


public class LegacyMain {
    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI(); // now it will work

        api.oldFeature();   // deprecated warning
        api.newFeature();   // recommended
    }
}

