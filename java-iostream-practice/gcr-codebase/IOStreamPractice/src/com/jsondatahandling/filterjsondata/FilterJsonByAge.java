package com.jsondatahandling.practiceproblems.filterjsondata;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterJsonByAge {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/filterjsondata/students.json"));

        System.out.println("Users older than 25:");
        for (JsonNode student : root) {
            if (student.get("age").asInt() > 25) {
                System.out.println(student.get("name").asText() + " - Age: " + student.get("age").asInt());
            }
        }
    }
}

