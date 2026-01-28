package com.streams.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemonstration {

    public static void main(String[] args) {

        String sourceFile = "src/com/streams/filehandling/source.txt";
        String destinationFile = "src/com/streams/filehandling/destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile);      // read file
            fos = new FileOutputStream(destinationFile); // creates file if not exists

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Source file not found or error while copying file.");

        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing the files.");
            }
        }
    }
}

