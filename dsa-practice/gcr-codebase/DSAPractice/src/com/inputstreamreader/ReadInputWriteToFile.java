package com.inputstreamreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadInputWriteToFile {

    public static void main(String[] args) {

        String filePath = "output.txt"; // file will be created if not exists

        try (
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(filePath)
        ) {

            System.out.println("Enter text (type 'exit' to stop):");

            String line;
            while ((line = br.readLine()) != null) {

                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(line);
                fw.write(System.lineSeparator()); // new line
            }

            System.out.println("Input successfully written to file: " + filePath);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
