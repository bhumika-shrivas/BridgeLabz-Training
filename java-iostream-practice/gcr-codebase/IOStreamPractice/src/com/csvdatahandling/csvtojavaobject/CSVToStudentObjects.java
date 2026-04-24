package com.csvdatahandling.csvtojavaobject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToStudentObjects {

    public static void main(String[] args) {

        String filePath =
            "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/csvtojavaobject/students.csv";

        List<Student> studentList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                // Create Student object
                Student student = new Student(id, name, age, marks);

                // Add to list
                studentList.add(student);
            }

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number format issue in CSV data.");
        }

        // -------- Print Student Objects --------
        System.out.println("Students from CSV as Java Objects:\n");

        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}

