package com.csvdatahandling.writedatatocsvfile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {

    public static void main(String[] args) {

        String filePath =
            "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/writedatatocsvfile/employees.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            // -------- Write Header --------
            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            // -------- Write Employee Records --------
            bw.write("101,Amit,HR,35000");
            bw.newLine();

            bw.write("102,Neha,IT,50000");
            bw.newLine();

            bw.write("103,Rohit,Finance,45000");
            bw.newLine();

            bw.write("104,Priya,Marketing,40000");
            bw.newLine();

            bw.write("105,Karan,IT,55000");
            bw.newLine();

            System.out.println("employees.csv file created and data written successfully!");

        } catch (IOException e) {
            System.out.println("Error while writing CSV: " + e.getMessage());
        }
    }
}

