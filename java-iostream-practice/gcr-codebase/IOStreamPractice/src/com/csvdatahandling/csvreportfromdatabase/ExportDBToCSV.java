package com.csvdatahandling.csvreportfromdatabase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class ExportDBToCSV {

    public static void main(String[] args) {

    	String url = "jdbc:mysql://127.0.0.1:3306/cg"; //database name
    	String user = "root";                          //MySQL username
    	String password = "Aryamishra@24";            //MySQL password


        String csvFile = "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/csvreportfromdatabase/employees_report.csv";

        String query = "SELECT emp_id, name, department, salary FROM employees";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {

            // Write CSV header
            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();

            // Write each row
            while (rs.next()) {
                int id = rs.getInt("emp_id");
                String name = rs.getString("name");
                String dept = rs.getString("department");
                double salary = rs.getDouble("salary");

                String line = id + "," + name + "," + dept + "," + salary;
                bw.write(line);
                bw.newLine();
            }

            System.out.println("CSV report generated successfully: " + csvFile);

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
