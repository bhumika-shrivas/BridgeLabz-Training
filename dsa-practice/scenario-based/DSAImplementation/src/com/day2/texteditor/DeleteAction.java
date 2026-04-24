package com.day2.texteditor;

class DeleteAction implements Action {
    private final String deleted;
    private final int position;

    DeleteAction(String deleted, int position) {
        this.deleted = deleted;
        this.position = position;
    }

    public void apply(StringBuilder text) {
        text.delete(position, position + deleted.length());
    }

    public void undo(StringBuilder text) {
        text.insert(position, deleted);
    }
}
