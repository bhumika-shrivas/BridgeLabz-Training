package com.csvdatahandling.modifycsvfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateSalaryAndWriteCSV {

    public static void main(String[] args) {

        String inputFilePath =
            "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/modifycsvfile/employees.csv";

        String outputFilePath =
            "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/modifycsvfile/updated_employees.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))
        ) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                // Write header as it is
                if (isHeader) {
                    bw.write(line);
                    bw.newLine();
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                // Increase salary by 10% if department is IT
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10); // or salary *= 1.10
                }

                // Write updated (or same) record to new file
                String updatedLine =
                        id + "," + name + "," + department + "," + (int) salary;

                bw.write(updatedLine);
                bw.newLine();
            }

            System.out.println("Updated CSV file created: updated_employees.csv");

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Salary format error in CSV.");
        }
    }
}

