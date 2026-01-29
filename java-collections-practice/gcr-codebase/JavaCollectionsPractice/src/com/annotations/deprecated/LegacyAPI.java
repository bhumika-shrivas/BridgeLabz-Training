package com.annotations.deprecated;

public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old Method");
    }

    public void newFeature() {
        System.out.println("New Method");
    }
}

