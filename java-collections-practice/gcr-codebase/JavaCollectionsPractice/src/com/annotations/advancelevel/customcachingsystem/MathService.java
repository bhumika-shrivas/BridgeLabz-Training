package com.annotations.advancelevel.customcachingsystem;

public class MathService {

    @CacheResult
    public int square(int n) {

        // Simulate expensive computation
        System.out.println("Computing square for: " + n);
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return n * n;
    }
}
