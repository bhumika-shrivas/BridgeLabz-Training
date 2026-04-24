package com.streams.filterstreams;

import java.io.*;

public class UpperToLowerFileCopy {

    public static void main(String[] args) {

        String inputFile = "src/com/streams/filterstreams/input.txt";
        String outputFile = "src/com/streams/filterstreams/output.txt";

        // try-with-resources for auto close
        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        ) {

            int ch;

            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted to lowercase successfully!");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
