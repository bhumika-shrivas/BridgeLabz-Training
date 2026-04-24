package com.algorithmanalysis;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LargeFileReadingEfficiency {

    public static void main(String[] args) {

        String filePath = "largefile.txt"; // path to large file (100MB–500MB)

        // -------- FileReader Test --------
        long startFR = System.nanoTime();
        long charsFR = readUsingFileReader(filePath);
        long timeFR = System.nanoTime() - startFR;

        // -------- InputStreamReader Test --------
        long startISR = System.nanoTime();
        long charsISR = readUsingInputStreamReader(filePath);
        long timeISR = System.nanoTime() - startISR;

        // -------- Results --------
        System.out.println("---- Large File Reading Comparison ----");
        System.out.println("FileReader Characters Read: " + charsFR);
        System.out.println("FileReader Time (ms): " + timeFR / 1_000_000.0);

        System.out.println("InputStreamReader Characters Read: " + charsISR);
        System.out.println("InputStreamReader Time (ms): " + timeISR / 1_000_000.0);
    }

    // Read using FileReader
    private static long readUsingFileReader(String filePath) {
        long count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while (br.read() != -1) {
                count++;
            }
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }
        return count;
    }

    // Read using InputStreamReader
    private static long readUsingInputStreamReader(String filePath) {
        long count = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath),
                        StandardCharsets.UTF_8))) {

            while (br.read() != -1) {
                count++;
            }
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }
        return count;
    }
}
