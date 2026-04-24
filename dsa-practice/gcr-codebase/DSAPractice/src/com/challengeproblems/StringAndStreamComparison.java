package com.challengeproblems;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StringAndStreamComparison {

    private static final int CONCAT_COUNT = 1_000_000;

    public static void main(String[] args) {

        // ==============================
        // PART 1: StringBuilder vs StringBuffer
        // ==============================

        // StringBuilder test
        long startBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < CONCAT_COUNT; i++) {
            stringBuilder.append("hello");
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // StringBuffer test
        long startBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < CONCAT_COUNT; i++) {
            stringBuffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        System.out.println("---- String Concatenation Performance ----");
        System.out.println("StringBuilder Time (ns): " + builderTime);
        System.out.println("StringBuffer Time (ns): " + bufferTime);

        // ==============================
        // PART 2: FileReader vs InputStreamReader
        // ==============================

        String filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\file1.txt"; // provide file path

        // FileReader test
        long startFileReader = System.nanoTime();
        long wordCountFR = countWordsUsingFileReader(filePath);
        long endFileReader = System.nanoTime();

        long fileReaderTime = endFileReader - startFileReader;

        // InputStreamReader test
        long startISR = System.nanoTime();
        long wordCountISR = countWordsUsingInputStreamReader(filePath);
        long endISR = System.nanoTime();

        long isrTime = endISR - startISR;

        System.out.println("\n---- File Reading Performance ----");
        System.out.println("FileReader Word Count: " + wordCountFR);
        System.out.println("FileReader Time (ns): " + fileReaderTime);

        System.out.println("InputStreamReader Word Count: " + wordCountISR);
        System.out.println("InputStreamReader Time (ns): " + isrTime);
    }

    // Count words using FileReader
    private static long countWordsUsingFileReader(String filePath) {
        long count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += words.length;
                }
            }

        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }
        return count;
    }

    // Count words using InputStreamReader
    private static long countWordsUsingInputStreamReader(String filePath) {
        long count = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath),
                        StandardCharsets.UTF_8))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += words.length;
                }
            }

        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }
        return count;
    }
}
