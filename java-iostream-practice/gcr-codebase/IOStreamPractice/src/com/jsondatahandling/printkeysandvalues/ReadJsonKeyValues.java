package com.jsondatahandling.practiceproblems.printkeysandvalues;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJsonKeyValues {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/printkeysandvalues/students.json"));

        for (JsonNode student : root) {
            System.out.println("Student:");
            student.fieldNames().forEachRemaining(field -> {
                System.out.println(field + ": " + student.get(field).asText());
            });
            System.out.println("-----------------");
        }
    }
}

