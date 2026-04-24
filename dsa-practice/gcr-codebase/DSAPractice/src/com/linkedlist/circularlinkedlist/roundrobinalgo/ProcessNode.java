package com.linkedlist.circularlinkedlist.roundrobinalgo;

class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;

    int waitingTime = 0;
    int turnAroundTime = 0;

    ProcessNode next;

    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
