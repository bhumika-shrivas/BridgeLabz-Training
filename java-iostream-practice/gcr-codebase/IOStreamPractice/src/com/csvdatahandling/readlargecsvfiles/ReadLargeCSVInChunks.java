package com.csvdatahandling.readlargecsvfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeCSVInChunks {

    public static void main(String[] args) {

    	String filePath =
    			"O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/readlargecsvfiles/large_file.csv";

        int chunkSize = 100; // lines per chunk
        int totalRecords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            int chunkCounter = 0;

            while ((line = br.readLine()) != null) {

                // Skip header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                // Process the line (here we just count)
                totalRecords++;
                chunkCounter++;

                // When chunk is full, print count and reset counter
                if (chunkCounter == chunkSize) {
                    System.out.println("Processed " + totalRecords + " records so far...");
                    chunkCounter = 0;
                }
            }

            // Print any remaining lines in last chunk
            if (chunkCounter > 0) {
                System.out.println("Processed " + totalRecords + " records so far...");
            }

            System.out.println("Total Records Processed: " + totalRecords);

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}

