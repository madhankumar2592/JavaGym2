package com.interview.daily;

/**
 * Interview Question:
 * How does a Stack work?
 *
 * Explanation:
 * - A Stack follows the LIFO (Last-In, First-Out) principle.
 * - The last element added is the first one to be removed.
 * - Key operations: push (add), pop (remove), peek (view top), isEmpty.
 */

public class Day44StackImplementation {

    /**
     * Problem Description:
     * Implement a Stack using an array.
     * It should support push, pop, peek, and isEmpty operations.
     *
     * Example:
     * Stack s = new Stack(5);
     * s.push(10);
     * s.push(20);
     * s.pop(); // returns 20
     * s.peek(); // returns 10
     */

    static class MyStack {
        private int[] arr;
        private int top;
        private int capacity;

        public MyStack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        public void push(int x) {
            // TODO: Implement this method
        }

        public int pop() {
            // TODO: Implement this method
            return -1;
        }

        public int peek() {
            // TODO: Implement this method
            return -1;
        }

        public boolean isEmpty() {
            // TODO: Implement this method
            return false;
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Is Empty: " + stack.isEmpty());

        // Expected Output:
        // Popped: 30
        // Peek: 20
        // Is Empty: false
    }
}

/*
// Solution Implementation

public void push(int x) {
    if (top == capacity - 1) {
        System.out.println("Stack Overflow");
        return;
    }
    arr[++top] = x;
}

public int pop() {
    if (isEmpty()) {
        System.out.println("Stack Underflow");
        return -1;
    }
    return arr[top--];
}

public int peek() {
    if (isEmpty()) {
        return -1;
    }
    return arr[top];
}

public boolean isEmpty() {
    return top == -1;
}
*/
