package com.interview.daily;

import java.util.Stack;

/**
 * Interview Question:
 * How do you design a stack that supports push, pop, top, and retrieving the minimum element in constant time?
 *
 * Explanation:
 * - Use an auxiliary stack to keep track of the minimum element at each level.
 * - When pushing `x`, push `min(x, currentMin)` onto the min stack.
 * - When popping, pop from both stacks.
 */

public class Day46MinStack {

    /**
     * Problem Description:
     * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
     *
     * Example:
     * MinStack minStack = new MinStack();
     * minStack.push(-2);
     * minStack.push(0);
     * minStack.push(-3);
     * minStack.getMin(); // returns -3
     * minStack.pop();
     * minStack.top();    // returns 0
     * minStack.getMin(); // returns -2
     */

    static class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            // TODO: Implement this method
        }

        public void pop() {
            // TODO: Implement this method
        }

        public int top() {
            // TODO: Implement this method
            return -1;
        }

        public int getMin() {
            // TODO: Implement this method
            return -1;
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println("Min: " + minStack.getMin());
        minStack.pop();
        System.out.println("Top: " + minStack.top());
        System.out.println("Min: " + minStack.getMin());

        // Expected Output:
        // Min: -3
        // Top: 0
        // Min: -2
    }
}

/*
// Solution Implementation

public void push(int val) {
    stack.push(val);
    if (minStack.isEmpty() || val <= minStack.peek()) {
        minStack.push(val);
    }
}

public void pop() {
    if (stack.peek().equals(minStack.peek())) {
        minStack.pop();
    }
    stack.pop();
}

public int top() {
    return stack.peek();
}

public int getMin() {
    return minStack.peek();
}
*/
