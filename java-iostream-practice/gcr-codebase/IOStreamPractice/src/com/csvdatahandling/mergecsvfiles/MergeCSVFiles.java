package com.csvdatahandling.mergecsvfiles;

import java.io.*;
import java.util.*;

class Student {
    int id;
    String name;
    int age;
    int marks;
    String grade;

    public Student(int id, String name, int age, int marks, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + marks + "," + grade;
    }
}

public class MergeCSVFiles {

    public static void main(String[] args) {

        String file1 = "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/mergecsvfiles/students1.csv";
        String file2 = "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/mergecsvfiles/students2.csv";
        String outputFile = "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/mergecsvfiles/merged_students.csv";

        Map<Integer, String[]> studentsMap = new HashMap<>();

        try {
            // -------- Read students1.csv --------
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            String line;
            boolean isHeader = true;

            while ((line = br1.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String age = data[2];

                studentsMap.put(id, new String[]{name, age});
            }
            br1.close();

            // -------- Read students2.csv --------
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            isHeader = true;

            List<Student> mergedList = new ArrayList<>();

            while ((line = br2.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                int marks = Integer.parseInt(data[1]);
                String grade = data[2];

                // Merge with data from first CSV
                if (studentsMap.containsKey(id)) {
                    String[] info = studentsMap.get(id);
                    String name = info[0];
                    int age = Integer.parseInt(info[1]);

                    mergedList.add(new Student(id, name, age, marks, grade));
                }
            }
            br2.close();

            // -------- Write merged_students.csv --------
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            // Header
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            for (Student s : mergedList) {
                bw.write(s.toString());
                bw.newLine();
            }

            bw.close();

            System.out.println("Merged CSV file created successfully: merged_students.csv");

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number format error in CSV.");
        }
    }
}

