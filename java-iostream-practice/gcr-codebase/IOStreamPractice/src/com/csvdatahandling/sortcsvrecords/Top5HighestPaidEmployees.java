package com.csvdatahandling.sortcsvrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Top5HighestPaidEmployees {

	public static void main(String[] args) {

        String filePath =
            "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/sortcsvrecords/employees.csv";

        ArrayList<Employee> list = new ArrayList<>();

        // -------- Step 1: Read CSV and store in ArrayList --------
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                if (isHeader) { // skip header
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String dept = data[2];
                double salary = Double.parseDouble(data[3]);

                list.add(new Employee(id, name, dept, salary));
            }

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
            return;
        }

        // -------- Step 2: Sort by Salary (Descending) --------
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.salary, e1.salary); // descending
            }
        });

        // -------- Step 3: Print Top 5 --------
        System.out.println("Top 5 Highest Paid Employees:\n");

        int limit = Math.min(5, list.size());

        for (int i = 0; i < limit; i++) {
            Employee e = list.get(i);

            System.out.println("Name       : " + e.name);
            System.out.println("Department : " + e.department);
            System.out.println("Salary     : " + (int) e.salary);
            System.out.println("-------------------------");
        }
    }
}
