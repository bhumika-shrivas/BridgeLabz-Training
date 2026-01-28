package com.streams.readlargefile;

import java.io.*;

public class LargeFileErrorFilter {

    public static void main(String[] args) {

        String filePath = "src/com/streams/readlargefile/largefile.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            int count = 0; // optional: to count matching lines

            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) { // case-insensitive
                    System.out.println(line);
                    count++;
                }
            }

            System.out.println("\nTotal lines containing 'error': " + count);

        } catch (IOException e) {
            System.out.println("File reading error: " + e.getMessage());
        }
    }
}

