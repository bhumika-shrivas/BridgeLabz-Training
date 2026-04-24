package com.jsondatahandling.practiceproblems.iplcensor;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.*;

public class IplCensorAnalyzer {

    static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {

        try {
            censorJson();
            censorCsv();
            System.out.println("Censorship completed for JSON and CSV files.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ---------------- JSON CENSOR ----------------
    static void censorJson() throws Exception {

        FileInputStream fis = new FileInputStream(
        		"O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/iplcensor/ipl_input.json");

        List<Map<String, Object>> matches =
                mapper.readValue(fis, new TypeReference<>() {});

        for (Map<String, Object> match : matches) {

            // Mask team names
            String team1 = (String) match.get("team1");
            String team2 = (String) match.get("team2");

            String maskedTeam1 = maskTeam(team1);
            String maskedTeam2 = maskTeam(team2);

            match.put("team1", maskedTeam1);
            match.put("team2", maskedTeam2);

            // Redact player of match
            match.put("player_of_match", "REDACTED");

            // Update score object keys
            Map<String, Integer> score =
                    (Map<String, Integer>) match.get("score");

            Map<String, Integer> newScore = new LinkedHashMap<>();
            newScore.put(maskedTeam1, score.get(team1));
            newScore.put(maskedTeam2, score.get(team2));

            match.put("score", newScore);
        }

        mapper.writerWithDefaultPrettyPrinter().writeValue(
                new File("O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/iplcensor/ipl_output_censored.json"),
                matches);
    }

    // ---------------- CSV CENSOR ----------------
    static void censorCsv() throws Exception {

        CSVReader reader = new CSVReader(new FileReader(
                "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/iplcensor/ipl_input.csv"));

        CSVWriter writer = new CSVWriter(new FileWriter(
        		"O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/jsondatahandling/practiceproblems/iplcensor/ipl_output_censored.csv"));

        String[] header = reader.readNext();
        writer.writeNext(header);

        String[] row;

        while ((row = reader.readNext()) != null) {

            row[1] = maskTeam(row[1]); // team1
            row[2] = maskTeam(row[2]); // team2
            row[6] = "REDACTED";        // player of match

            writer.writeNext(row);
        }

        reader.close();
        writer.close();
    }

    // ---------------- TEAM MASK LOGIC ----------------
    static String maskTeam(String team) {
        String[] parts = team.split(" ");
        return parts[0] + " ***";
    }
}
