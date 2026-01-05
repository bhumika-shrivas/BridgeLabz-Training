package com.linkedlist.circularlinkedlist.roundrobinalgo;

class RoundRobinScheduler {
    private ProcessNode head = null;

    // Add process at end
    void addProcess(ProcessNode node) {
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    // Remove process by PID
    void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode curr = head, prev = null;

        do {
            if (curr.pid == pid) {
                if (curr == head) {
                    ProcessNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Simulate Round Robin
    void simulate(int timeQuantum) {
        if (head == null) return;

        int time = 0;
        int completed = 0;
        int totalWT = 0, totalTAT = 0;

        int totalProcesses = countProcesses();
        ProcessNode curr = head;

        while (completed < totalProcesses) {

            if (curr.remainingTime > 0) {
                System.out.println("\nExecuting Process P" + curr.pid);

                if (curr.remainingTime > timeQuantum) {
                    time += timeQuantum;
                    curr.remainingTime -= timeQuantum;
                } else {
                    time += curr.remainingTime;
                    curr.remainingTime = 0;

                    curr.turnAroundTime = time;
                    curr.waitingTime = curr.turnAroundTime - curr.burstTime;

                    totalWT += curr.waitingTime;
                    totalTAT += curr.turnAroundTime;

                    completed++;
                    System.out.println("Process P" + curr.pid + " completed");
                }

                displayQueue();
            }
            curr = curr.next;
        }

        System.out.println("\nAverage Waiting Time: " + (double) totalWT / totalProcesses);
        System.out.println("Average Turnaround Time: " + (double) totalTAT / totalProcesses);
    }

    // Display queue
    void displayQueue() {
        if (head == null) return;

        ProcessNode temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print(
                "P" + temp.pid + "(" + temp.remainingTime + ") -> "
            );
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        ProcessNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}
