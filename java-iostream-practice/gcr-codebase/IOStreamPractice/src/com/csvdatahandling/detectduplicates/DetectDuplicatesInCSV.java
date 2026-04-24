package com.csvdatahandling.detectduplicates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DetectDuplicatesInCSV {

    public static void main(String[] args) {

        String filePath = 
            "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/detectduplicates/students.csv";

        Map<String, Integer> idCountMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            System.out.println("Duplicate Records Found:\n");

            while ((line = br.readLine()) != null) {

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];

                // Update count
                idCountMap.put(id, idCountMap.getOrDefault(id, 0) + 1);
            }

            // Print duplicates
            for (Map.Entry<String, Integer> entry : idCountMap.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println("ID: " + entry.getKey() + " appears " + entry.getValue() + " times.");
                }
            }

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}

