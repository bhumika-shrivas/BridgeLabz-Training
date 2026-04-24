package com.stackandqueue.stackusingrecursion;

// Implementation
import java.util.Stack;

class SortStackRecursively {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        sortStack(stack);
        insertSorted(stack, top);
    }

    // Function to insert element in sorted order
    private static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, element);
        stack.push(top);
    }
}
