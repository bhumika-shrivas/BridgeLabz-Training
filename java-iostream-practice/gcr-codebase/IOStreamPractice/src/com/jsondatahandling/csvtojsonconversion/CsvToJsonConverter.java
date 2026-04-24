package com.jsondatahandling.practiceproblems.csvtojsonconversion;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class CsvToJsonConverter {

    public static void main(String[] args) {

        try {

            CSVReader reader = new CSVReader(new FileReader(
            		"O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/csvtojsonconversion/students.csv"));


            ObjectMapper mapper = new ObjectMapper();

            List<Map<String, String>> jsonList = new ArrayList<>();

            // Read header
            String[] headers = reader.readNext();

            String[] row;

            // Read each data row
            while ((row = reader.readNext()) != null) {

                Map<String, String> obj = new LinkedHashMap<>();

                for (int i = 0; i < headers.length; i++) {
                    obj.put(headers[i], row[i]);
                }

                jsonList.add(obj);
            }

            reader.close();

            // Write JSON file
            mapper.writerWithDefaultPrettyPrinter().writeValue(
                    new FileWriter("O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/csvtojsonconversion/students.json"),
                    jsonList);

            System.out.println("CSV successfully converted to JSON!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

