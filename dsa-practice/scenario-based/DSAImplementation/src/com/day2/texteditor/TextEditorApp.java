package com.day2.texteditor;

import java.util.Scanner;

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
            1. Insert
            2. Delete
            3. Undo
            4. Redo
            5. Show Text
            6. Exit
            """);

            int ch = sc.nextInt(); sc.nextLine();

            switch (ch) {
                case 1 -> {
                    System.out.print("Text: ");
                    String v = sc.nextLine();
                    System.out.print("Position: ");
                    int p = sc.nextInt();
                    editor.insert(v, p);
                }
                case 2 -> {
                    System.out.print("Position: ");
                    int p = sc.nextInt();
                    System.out.print("Length: ");
                    int l = sc.nextInt();
                    editor.delete(p, l);
                }
                case 3 -> editor.undo();
                case 4 -> editor.redo();
                case 5 -> System.out.println("Current Text: " + editor.getText());
                case 6 -> { return; }
            }
        }
    }
}
