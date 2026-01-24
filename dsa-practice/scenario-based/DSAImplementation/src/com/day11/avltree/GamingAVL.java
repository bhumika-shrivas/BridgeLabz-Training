package com.day11.avltree;

import java.util.*;

/*Story: Gaming App - Real-Time Leaderboard
Gamers earn and lose points rapidly.
Scenarios:
● 🔹 Scenario 1: Insert/Update Player — New players join or existing ones gain points.
● 🔹 Scenario 2: Display Top Players — Return top 10 players in rank.
● 🔹 Scenario 3: Remove Player — Handle user bans or exits efficiently.*/

class PlayerNode {
    int score, height;
    String name;
    PlayerNode left, right;

    PlayerNode(String name, int score) {
        this.name = name;
        this.score = score;
        height = 1;
    }
}

public class GamingAVL {

    PlayerNode root;
    static Scanner sc = new Scanner(System.in);

    int height(PlayerNode n) {
        return n == null ? 0 : n.height;
    }

    int balance(PlayerNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    PlayerNode rightRotate(PlayerNode y) {
        PlayerNode x = y.left;
        PlayerNode t = x.right;

        x.right = y;
        y.left = t;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    PlayerNode leftRotate(PlayerNode x) {
        PlayerNode y = x.right;
        PlayerNode t = y.left;

        y.left = x;
        x.right = t;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    PlayerNode insert(PlayerNode node, String name, int score) {
        if (node == null) return new PlayerNode(name, score);

        if (score > node.score)
            node.left = insert(node.left, name, score);
        else
            node.right = insert(node.right, name, score);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int bal = balance(node);

        if (bal > 1 && score > node.left.score) return rightRotate(node);
        if (bal < -1 && score < node.right.score) return leftRotate(node);
        if (bal > 1 && score < node.left.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (bal < -1 && score > node.right.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void showTop(PlayerNode node, int[] count) {
        if (node == null || count[0] == 10) return;
        showTop(node.left, count);
        if (count[0] < 10) {
            System.out.println(node.name + " -> " + node.score);
            count[0]++;
        }
        showTop(node.right, count);
    }

    public static void main(String[] args) {

        GamingAVL avl = new GamingAVL();
        int ch;

        do {
            System.out.println("\nGaming Leaderboard");
            System.out.println("1. Add / Update Player");
            System.out.println("2. Show Top Players");
            System.out.println("3. Exit");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> {
                    System.out.print("Player Name: ");
                    String n = sc.nextLine();
                    System.out.print("Score: ");
                    int s = sc.nextInt();
                    avl.root = avl.insert(avl.root, n, s);
                }
                case 2 -> {
                    System.out.println("🏆 Top Players:");
                    avl.showTop(avl.root, new int[]{0});
                }
            }
        } while (ch != 3);
    }
}
