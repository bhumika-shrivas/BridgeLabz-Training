package com.stackandqueue.queueusingstacks;

// Implementation
import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    // Enqueue operation
    public void enqueue(int x) {
        in.push(x);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        return out.pop();
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        return out.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }
}
