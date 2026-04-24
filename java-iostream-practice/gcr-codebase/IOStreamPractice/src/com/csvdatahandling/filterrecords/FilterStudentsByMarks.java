package com.csvdatahandling.filterrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudentsByMarks {

    public static void main(String[] args) {

        String filePath =
            "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/readcsvfileandprintdata/students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            System.out.println("Students who scored more than 80:\n");

            while ((line = br.readLine()) != null) {

                // Skip header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                int marks = Integer.parseInt(data[3]); // convert marks to int

                // Filter condition
                if (marks > 80) {
                    System.out.println("ID    : " + id);
                    System.out.println("Name  : " + name);
                    System.out.println("Marks : " + marks);
                    System.out.println("----------------------");
                }
            }

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Marks format is invalid in CSV.");
        }
    }
}
