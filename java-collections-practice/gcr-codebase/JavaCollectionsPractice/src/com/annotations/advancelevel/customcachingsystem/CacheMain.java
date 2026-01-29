package com.annotations.advancelevel.customcachingsystem;

public class CacheMain {

    public static void main(String[] args) {

        MathService service = new MathService();

        System.out.println(CacheManager.execute(service, "square", 5));
        System.out.println(CacheManager.execute(service, "square", 5)); // cached
        System.out.println(CacheManager.execute(service, "square", 6));
        System.out.println(CacheManager.execute(service, "square", 6)); // cached
    }
}
