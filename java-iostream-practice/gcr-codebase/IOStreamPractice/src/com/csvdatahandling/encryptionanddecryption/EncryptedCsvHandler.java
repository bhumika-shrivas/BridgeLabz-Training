package com.csvdatahandling.encryptionanddecryption;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class EncryptedCsvHandler {

    // Write encrypted CSV
    public static void writeEncryptedCsv(String path, List<Employee> employees) throws Exception {

        try (CSVWriter writer = new CSVWriter(new FileWriter(path))) {

            // Header
            writer.writeNext(new String[]{"ID", "Name", "Email", "Salary"});

            for (Employee e : employees) {

                // Encrypt sensitive fields
                String encEmail = AESEncryptionUtil.encrypt(e.getEmail());
                String encSalary = AESEncryptionUtil.encrypt(String.valueOf(e.getSalary()));

                writer.writeNext(new String[]{
                        String.valueOf(e.getId()),
                        e.getName(),
                        encEmail,
                        encSalary
                });
            }
        }

        System.out.println("Encrypted CSV Written Successfully");
    }

    // ✅ Read & decrypt CSV
    public static List<Employee> readDecryptedCsv(String path) throws Exception {

        List<Employee> list = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(path))) {

            String[] line;
            boolean header = true;

            while ((line = reader.readNext()) != null) {

                if (header) {
                    header = false;
                    continue;
                }

                int id = Integer.parseInt(line[0]);
                String name = line[1];

                // Decrypt sensitive fields
                String email = AESEncryptionUtil.decrypt(line[2]);
                double salary = Double.parseDouble(AESEncryptionUtil.decrypt(line[3]));

                list.add(new Employee(id, name, email, salary));
            }
        }

        return list;
    }

    // ✅ Main method
    public static void main(String[] args) {

        try {
            String csvPath =
                    "O:/Java Programming Workspace/java-io-streams-practice/" +
                    "gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/encryptionanddecryption/employees_secure.csv";

            // Sample data
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(1, "Arya", "arya@gmail.com", 55000));
            employees.add(new Employee(2, "Ravi", "ravi@gmail.com", 60000));
            employees.add(new Employee(3, "Neha", "neha@gmail.com", 52000));

            // Write encrypted CSV
            writeEncryptedCsv(csvPath, employees);

            // Read & decrypt CSV
            List<Employee> decrypted = readDecryptedCsv(csvPath);

            System.out.println("\nDecrypted Data:");
            for (Employee e : decrypted) {
                System.out.println(e.getId() + " " + e.getName() +
                        " " + e.getEmail() + " " + e.getSalary());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

