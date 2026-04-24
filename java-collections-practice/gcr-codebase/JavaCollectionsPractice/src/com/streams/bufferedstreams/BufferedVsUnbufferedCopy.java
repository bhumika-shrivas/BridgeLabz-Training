package com.streams.bufferedstreams;

import java.io.*;

public class BufferedVsUnbufferedCopy {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {

        String sourceFile = "D:\\poco m40\\poco\\TransferLapi\\MP4_20230928_231103VLOG.mp4";

        String unbufferedDest = "src/com/streams/bufferedstreams/unbuffered_copy.dat";
        String bufferedDest = "src/com/streams/bufferedstreams/buffered_copy.dat";

        copyUsingUnbufferedStreams(sourceFile, unbufferedDest);
        copyUsingBufferedStreams(sourceFile, bufferedDest);
    }

    // Normal File Streams
    private static void copyUsingUnbufferedStreams(String src, String dest) {

        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("Unbuffered Copy Time (ns): " + (endTime - startTime));

        } catch (IOException e) {
            System.out.println("Unbuffered Copy Error: " + e.getMessage());
        }
    }

    // Buffered Streams
    private static void copyUsingBufferedStreams(String src, String dest) {

        long startTime = System.nanoTime();

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(src), BUFFER_SIZE);
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(dest), BUFFER_SIZE)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("Buffered Copy Time (ns): " + (endTime - startTime));

        } catch (IOException e) {
            System.out.println("Buffered Copy Error: " + e.getMessage());
        }
    }
}

