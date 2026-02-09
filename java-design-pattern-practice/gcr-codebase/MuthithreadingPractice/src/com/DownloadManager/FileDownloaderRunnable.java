package com.DownloadManager;

class FileDownloaderRunnable implements Runnable {

    private String fileName;

    public FileDownloaderRunnable(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            for (int progress = 0; progress <= 100; progress += 10) {
                System.out.println(
                    "[" + Thread.currentThread().getName() + "] Downloading "
                    + fileName + ": " + progress + "%"
                );
                Thread.sleep((int)(Math.random() * 500)); // random delay
            }
        } catch (InterruptedException e) {
            System.out.println(fileName + " download interrupted");
        }
    }
}