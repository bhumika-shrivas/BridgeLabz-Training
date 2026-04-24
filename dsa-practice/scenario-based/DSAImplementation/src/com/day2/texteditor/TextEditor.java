package com.day2.texteditor;

import java.util.Stack;

class TextEditor {
    private final StringBuilder text = new StringBuilder();
    private final Stack<Action> undoStack = new Stack<>();
    private final Stack<Action> redoStack = new Stack<>();

    void insert(String value, int position) {
        Action action = new InsertAction(value, position);
        action.apply(text);
        undoStack.push(action);
        redoStack.clear(); // critical rule
    }

    void delete(int position, int length) {
        String removed = text.substring(position, position + length);
        Action action = new DeleteAction(removed, position);
        action.apply(text);
        undoStack.push(action);
        redoStack.clear();
    }

    void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }
        Action action = undoStack.pop();
        action.undo(text);
        redoStack.push(action);
    }

    void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }
        Action action = redoStack.pop();
        action.apply(text);
        undoStack.push(action);
    }

    String getText() {
        return text.toString();
    }
}
