package com.day8;

import java.util.Scanner;

/*GamerZone – High Score Ranking System (Quick Sort)
Story: A global multiplayer game needs to rank thousands of players in real-time based on their
scores after every match. The list is dynamic, large, and often unsorted. Quick Sort is used to
reorder players quickly for leaderboards.
Concepts Involved:
● Quick Sort
● Sorting dynamic, large datasets
● Performance-driven solution*/

public class GamerZone {

    static Scanner sc = new Scanner(System.in);

    // Arrays for player names and scores
    String[] playerNames = new String[1000];
    int[] scores = new int[1000];

    static int count = 0;

    // Method to add player score
    public void addPlayer() {

        System.out.print("Enter Player Name: ");
        playerNames[count] = sc.nextLine();

        System.out.print("Enter Player Score: ");
        scores[count] = sc.nextInt();
        sc.nextLine();

        System.out.println("Player score added successfully");
        count++;
    }

    // Method to display leaderboard
    public void displayPlayers() {

        if (count == 0) {
            System.out.println("No player data available");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(playerNames[i] + " -> " + scores[i]);
        }
    }

    // Partition method (descending order for leaderboard)
    int partition(int low, int high) {

        int pivot = scores[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (scores[j] >= pivot) {   // higher score first
                i++;

                int tempScore = scores[i];
                scores[i] = scores[j];
                scores[j] = tempScore;

                String tempName = playerNames[i];
                playerNames[i] = playerNames[j];
                playerNames[j] = tempName;
            }
        }

        int tempScore = scores[i + 1];
        scores[i + 1] = scores[high];
        scores[high] = tempScore;

        String tempName = playerNames[i + 1];
        playerNames[i + 1] = playerNames[high];
        playerNames[high] = tempName;

        return i + 1;
    }

    // Quick Sort method
    void quickSort(int low, int high) {

        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    public static void main(String[] args) {

        GamerZone ob = new GamerZone();
        int choice;

        System.out.println("GamerZone – High Score Ranking System");

        do {
            System.out.println(
                "\n1. Add Player Score" +
                "\n2. View Unsorted Player List" +
                "\n3. View Leaderboard (Sorted by Score)" +
                "\n4. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    ob.addPlayer();
                    break;

                case 2:
                    System.out.println("Unsorted Player Data:");
                    ob.displayPlayers();
                    break;

                case 3:
                    ob.quickSort(0, count - 1);
                    System.out.println("Leaderboard (Highest Score First):");
                    ob.displayPlayers();
                    break;

                case 4:
                    System.out.println("You are out of the program. Thank you!");
                    break;

                default:
                    System.out.println("Please enter a valid option");
            }

        } while (choice != 4);
    }
}
