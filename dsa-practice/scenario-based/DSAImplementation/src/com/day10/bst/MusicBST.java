package com.day10.bst;

import java.util.Scanner;

/* Story: Music App - Organize Songs by Track ID
A music streaming app organizes tracks in a library using track IDs.
Scenarios:
● 🔹 Scenario 1: Search Track — Users want to search a song using track ID.
● 🔹 Scenario 2: Insert New Track — Add new releases to the library.
● 🔹 Scenario 3: Show Playlist Alphabetically — In-order traversal by song title.*/

class TrackNode {
    int trackId;
    String title;
    TrackNode left, right;

    TrackNode(int trackId, String title) {
        this.trackId = trackId;
        this.title = title;
    }
}

public class MusicBST {

    TrackNode root;
    static Scanner sc = new Scanner(System.in);

    TrackNode insert(TrackNode root, int id, String title) {
        if (root == null) return new TrackNode(id, title);
        if (id < root.trackId) root.left = insert(root.left, id, title);
        else if (id > root.trackId) root.right = insert(root.right, id, title);
        return root;
    }

    TrackNode search(TrackNode root, int id) {
        if (root == null || root.trackId == id) return root;
        return id < root.trackId ? search(root.left, id) : search(root.right, id);
    }

    void inorder(TrackNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Track ID: " + root.trackId + " | " + root.title);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        MusicBST bst = new MusicBST();
        int choice;

        do {
            System.out.println("\n🎵 Music Library");
            System.out.println("1. Add Track");
            System.out.println("2. Search Track");
            System.out.println("3. Show Playlist");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Track ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Song Title: ");
                    String title = sc.nextLine();
                    bst.root = bst.insert(bst.root, id, title);
                }
                case 2 -> {
                    System.out.print("Track ID: ");
                    TrackNode t = bst.search(bst.root, sc.nextInt());
                    System.out.println(t != null ? t.title : "Not Found");
                }
                case 3 -> bst.inorder(bst.root);
            }
        } while (choice != 4);
    }
}
