package com.linkedlist.doublylinkedlist.texteditor;

import java.util.Scanner;

public class TextEditorApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();
        int choice;

        do {
            System.out.println("\n1.Type Text  2.Undo  3.Redo  4.Display  0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    editor.addState(sc.nextLine());
                    break;
                case 2:
                    editor.undo();
                    break;
                case 3:
                    editor.redo();
                    break;
                case 4:
                    editor.display();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
