package com.interview.daily;

import java.util.Stack;

/**
 * Interview Question:
 * How does a Queue work?
 *
 * Explanation:
 * - A Queue follows the FIFO (First-In, First-Out) principle.
 * - The first element added is the first one to be removed.
 * - Key operations: enqueue (add), dequeue (remove), peek (view front), isEmpty.
 */

public class Day45QueueUsingStacks {

    /**
     * Problem Description:
     * Implement a Queue using two Stacks.
     * It should support enqueue, dequeue, peek, and isEmpty operations.
     *
     * Example:
     * MyQueue q = new MyQueue();
     * q.enqueue(10);
     * q.enqueue(20);
     * q.dequeue(); // returns 10
     * q.peek(); // returns 20
     */

    static class MyQueue {
        private Stack<Integer> s1;
        private Stack<Integer> s2;

        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void enqueue(int x) {
            // TODO: Implement this method
        }

        public int dequeue() {
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
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Is Empty: " + queue.isEmpty());

        // Expected Output:
        // Dequeued: 10
        // Peek: 20
        // Is Empty: false
    }
}

/*
// Solution Implementation

public void enqueue(int x) {
    s1.push(x);
}

public int dequeue() {
    if (s2.isEmpty()) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
    }
    return s2.pop();
}

public int peek() {
    if (s2.isEmpty()) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
    }
    return s2.peek();
}

public boolean isEmpty() {
    return s1.isEmpty() && s2.isEmpty();
}
*/
