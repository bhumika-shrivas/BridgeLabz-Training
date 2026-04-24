package com.day1.browserbuddy;

class HistoryNode {
    String url;
    HistoryNode prev;
    HistoryNode next;

    HistoryNode(String url) {
        this.url = url;
    }
}
