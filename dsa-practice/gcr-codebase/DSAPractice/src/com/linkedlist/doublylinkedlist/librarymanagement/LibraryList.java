package com.linkedlist.doublylinkedlist.librarymanagement;

class LibraryList {
    private BookNode head, tail;

    // Add at beginning
    void addAtBeginning(BookNode node) {
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    // Add at end
    void addAtEnd(BookNode node) {
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    // Add at position (1-based)
    void addAtPosition(int pos, BookNode node) {
        if (pos == 1) {
            addAtBeginning(node);
            return;
        }
        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            addAtEnd(node);
            return;
        }

        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    // Remove by Book ID
    void removeById(int bookId) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                System.out.println("Book removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Search by title
    void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No book found");
    }

    // Search by author
    void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No book found");
    }

    // Update availability
    void updateAvailability(int bookId, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.available = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Display forward
    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            print(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            print(temp);
            temp = temp.prev;
        }
    }

    // Count books
    void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books: " + count);
    }

    private void print(BookNode b) {
        System.out.println(
            b.bookId + " | " + b.title + " | " +
            b.author + " | " + b.genre +
            " | Available: " + b.available
        );
    }
}
