package com.jsondatahandling.practiceproblems.validateemail;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Set;

public class ValidateEmailJsonSchema {

    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();

            // RELATIVE PATH from project root
            InputStream schemaStream = new FileInputStream(
                    "src/com/jsondatahandling/practiceproblems/validateemail/email-schema.json");

            InputStream jsonStream = new FileInputStream(
                    "src/com/jsondatahandling/practiceproblems/validateemail/user.json");

            JsonNode schemaNode = mapper.readTree(schemaStream);
            JsonNode jsonNode = mapper.readTree(jsonStream);

            JsonSchemaFactory factory =
                    JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

            JsonSchema schema = factory.getSchema(schemaNode);

            Set<ValidationMessage> errors = schema.validate(jsonNode);

            if (errors.isEmpty()) {
                System.out.println("Email is VALID");
            } else {
                System.out.println("Email is INVALID");
                for (ValidationMessage msg : errors) {
                    System.out.println(msg.getMessage());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
