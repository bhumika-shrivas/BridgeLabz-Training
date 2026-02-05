package com.jsondatahandling.practiceproblems.parseandfilterjson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Scanner;

public class FilterJsonInput {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        // Read JSON array from file
        JsonNode root = mapper.readTree(new File("O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/parseandfilterjson/students.json"));

        // Ask user for filter age
        System.out.print("Filter age greater than: ");
        int ageLimit = sc.nextInt();

        // Loop and print only those with age > ageLimit
        for (JsonNode student : root) {
            if (student.get("age").asInt() > ageLimit) {
                System.out.println(student.toPrettyString());
            }
        }
    }
}

