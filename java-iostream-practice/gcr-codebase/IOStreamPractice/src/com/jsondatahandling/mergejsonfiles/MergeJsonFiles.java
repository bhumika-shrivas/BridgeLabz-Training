package com.jsondatahandling.practiceproblems.mergejsonfiles;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.FileInputStream;

public class MergeJsonFiles {

    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();

            // Read both JSON files
            JsonNode userNode = mapper.readTree(
                    new FileInputStream("O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/mergejsonfiles/user.json"));

            JsonNode addressNode = mapper.readTree(
                    new FileInputStream("O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/mergejsonfiles/address.json"));


            // Create merged object
            ObjectNode mergedNode = mapper.createObjectNode();

            mergedNode.setAll((ObjectNode) userNode);
            mergedNode.setAll((ObjectNode) addressNode);

            // Write merged JSON to file
            mapper.writerWithDefaultPrettyPrinter().writeValue(
                    new File("O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/mergejsonfiles/userdeatils.json")
,
                    mergedNode);

            System.out.println("JSON files merged successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

