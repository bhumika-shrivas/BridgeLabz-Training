package com.csvdatahandling.readandcountrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRecords {

    public static void main(String[] args) {

        String filePath =
            "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/readandcountrows/students.csv";

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                // Skip header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                count++; // count only data rows
            }

            System.out.println("Total number of records (excluding header): " + count);

        } catch (IOException e) {
            System.out.println("File reading error: " + e.getMessage());
        }
    }
}

