package com.linkedlist.circularlinkedlist.taskscheduler;

class TaskCircularList {
    private TaskNode head = null;
    private TaskNode current = null;

    // Add at beginning
    void addAtBeginning(TaskNode node) {
        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        node.next = head;
        temp.next = node;
        head = node;
    }

    // Add at end
    void addAtEnd(TaskNode node) {
        if (head == null) {
            addAtBeginning(node);
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    // Add at specific position (1-based)
    void addAtPosition(int pos, TaskNode node) {
        if (pos == 1) {
            addAtBeginning(node);
            return;
        }
        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;

        node.next = temp.next;
        temp.next = node;
    }

    // Remove by Task ID
    void removeById(int taskId) {
        if (head == null) {
            System.out.println("List empty");
            return;
        }

        TaskNode temp = head, prev = null;

        do {
            if (temp.taskId == taskId) {
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task removed");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    // View current task & move to next
    void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }
        print(current);
        current = current.next;
    }

    // Display all tasks
    void displayAll() {
        if (head == null) {
            System.out.println("No tasks");
            return;
        }
        TaskNode temp = head;
        do {
            print(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    void searchByPriority(int priority) {
        if (head == null) return;

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tasks with this priority");
    }

    private void print(TaskNode t) {
        System.out.println(
            t.taskId + " | " + t.taskName +
            " | Priority: " + t.priority +
            " | Due: " + t.dueDate
        );
    }
}
