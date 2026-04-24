package com.jsondatahandling.practiceproblems.readandextractjsonfiles;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Scanner;

public class ExtractFieldsInput {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        // Read JSON array from file
        JsonNode root = mapper.readTree(new File("O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/readandextractjsonfiles/students.json"));

        // Ask user which field to extract
        System.out.print("Enter field to extract (name/email/age): ");
        String field = sc.nextLine();

        // Loop through each JSON object and print chosen field
        for (JsonNode student : root) {
            if (student.has(field)) {
                System.out.println(field + ": " + student.get(field).asText());
            }
        }
    }
}

