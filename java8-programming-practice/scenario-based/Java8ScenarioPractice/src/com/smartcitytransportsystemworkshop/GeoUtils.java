package com.smartcitytransportsystemworkshop;

public interface GeoUtils {

    static double calculateDistance(double start, double end) {
        return Math.abs(end - start);
    }
}

