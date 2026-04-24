package com.day1.browserbuddy;

class BrowserTab {
    private HistoryNode current;

    // Visit a new page
    void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);

        if (current != null) {
            current.next = null;     // ❗ delete forward history
            newNode.prev = current;
            current.next = newNode;
        }
        current = newNode;
        System.out.println("Visited: " + url);
    }

    // Back operation
    void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page");
        }
    }

    // Forward operation
    void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No next page");
        }
    }

    String getCurrentPage() {
        return current != null ? current.url : "Empty Tab";
    }
}
