package com.linkedlist.doublylinkedlist.texteditor;

class TextEditor {
    private TextNode head, tail, current;
    private int size = 0;
    private final int MAX = 10;

    // Add new state
    void addState(String text) {
        TextNode node = new TextNode(text);

        // clear redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = countNodes();
        }

        if (head == null) {
            head = tail = current = node;
            size = 1;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
        current = node;
        size++;

        if (size > MAX) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo
    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo
    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // Display current state
    void display() {
        if (current == null)
            System.out.println("Editor empty");
        else
            System.out.println("Current Text: " + current.content);
    }

    private int countNodes() {
        int c = 0;
        TextNode t = head;
        while (t != null) {
            c++;
            t = t.next;
        }
        return c;
    }
}
