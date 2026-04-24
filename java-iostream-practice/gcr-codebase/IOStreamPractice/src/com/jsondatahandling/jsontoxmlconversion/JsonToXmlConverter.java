package com.jsondatahandling.practiceproblems.jsontoxmlconversion;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileInputStream;
import java.io.File;

public class JsonToXmlConverter {

    public static void main(String[] args) {

        try {

            ObjectMapper jsonMapper = new ObjectMapper();
            XmlMapper xmlMapper = new XmlMapper();

            String jsonPath =
                "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/jsontoxmlconversion/student.json";

            // Read JSON file
            JsonNode jsonNode = jsonMapper.readTree(new FileInputStream(jsonPath));

            // Convert JSON to XML (as String)
            String xml = xmlMapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(jsonNode);

            System.out.println("Converted XML:\n" + xml);

            String xmlPath =
                "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/jsontoxmlconversion/student.xml";

            // Write XML to file
            xmlMapper.writeValue(new File(xmlPath), jsonNode);

            System.out.println("JSON successfully converted to XML!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
