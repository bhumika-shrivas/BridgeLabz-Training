package com.csvdatahandling.jsontocsv;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonCsvConverter {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // ✅ Convert JSON file to CSV
    public static void jsonToCsv(String jsonFilePath, String csvFilePath) throws IOException {

        // Read JSON into List<Student>
        List<Student> students = objectMapper.readValue(
                new File(jsonFilePath),
                new TypeReference<List<Student>>() {}
        );

        // Write CSV
        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {

            // Header
            String[] header = {"id", "name", "age"};
            writer.writeNext(header);

            // Data
            for (Student s : students) {
                String[] data = {
                        String.valueOf(s.getId()),
                        s.getName(),
                        String.valueOf(s.getAge())
                };
                writer.writeNext(data);
            }
        }

        System.out.println("JSON converted to CSV: " + csvFilePath);
    }

    // ✅ Convert CSV file to JSON
    public static void csvToJson(String csvFilePath, String jsonFilePath) throws IOException, CsvValidationException, NumberFormatException {

        List<Student> students = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {

            String[] line;
            boolean isHeader = true;

            while ((line = reader.readNext()) != null) {

                if (isHeader) {   // skip header row
                    isHeader = false;
                    continue;
                }

                int id = Integer.parseInt(line[0]);
                String name = line[1];
                int age = Integer.parseInt(line[2]);

                students.add(new Student(id, name, age));
            }
        }

        // Write JSON
        objectMapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File(jsonFilePath), students);

        System.out.println("CSV converted to JSON: " + jsonFilePath);
    }

    // ✅ Main method
    public static void main(String[] args) {

        try {
            String basePath =
                    "O:/Java Programming Workspace/java-io-streams-practice/" +
                    "gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/jsontocsv/";

            String jsonInput = basePath + "students.json";
            String csvOutput = basePath + "students.csv";
            String jsonOutput = basePath + "students_from_csv.json";

            jsonToCsv(jsonInput, csvOutput);
            csvToJson(csvOutput, jsonOutput);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
