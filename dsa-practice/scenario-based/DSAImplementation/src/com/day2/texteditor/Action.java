package com.day2.texteditor;

interface Action {
    void apply(StringBuilder text);
    void undo(StringBuilder text);
}
