package com.day2.texteditor;

class InsertAction implements Action {
    private final String value;
    private final int position;

    InsertAction(String value, int position) {
        this.value = value;
        this.position = position;
    }

    public void apply(StringBuilder text) {
        text.insert(position, value);
    }

    public void undo(StringBuilder text) {
        text.delete(position, position + value.length());
    }
}
