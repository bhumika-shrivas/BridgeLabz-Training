package com.algorithmanalysis;

public class StringConcatenationPerformance {

    private static final int COUNT = 100_000; // reduced

    public static void main(String[] args) {

        // String
        long startString = System.nanoTime();
        String str = "";
        for (int i = 0; i < COUNT; i++) {
            str = str + "hello";
        }
        long stringTime = System.nanoTime() - startString;

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < COUNT; i++) {
            sb.append("hello");
        }
        long builderTime = System.nanoTime() - startBuilder;

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < COUNT; i++) {
            buffer.append("hello");
        }
        long bufferTime = System.nanoTime() - startBuffer;

        System.out.println("String Time (ms): " + stringTime / 1_000_000.0);
        System.out.println("StringBuilder Time (ms): " + builderTime / 1_000_000.0);
        System.out.println("StringBuffer Time (ms): " + bufferTime / 1_000_000.0);
    }
}
