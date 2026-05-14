package com.interview.daily;

/**
 * Interview Question:
 * How would you design a stack with an increment operation?
 *
 * Explanation:
 * - A stack with an increment operation allows you to increment the bottom k elements by a certain value.
 * - This operation should be efficient, ideally O(1).
 * - You can achieve this by using an auxiliary array to store the increment values.
 */

public class Day88DesignStackWithIncrement {

    /**
     * Problem Description:
     * Design a stack which supports the following operations.
     * Implement the CustomStack class:
     * - CustomStack(int maxSize) Initializes the object with maxSize which is the maximum number of elements in the stack or do nothing if the stack reached the maxSize.
     * - void push(int x) Adds x to the top of the stack if the stack hasn't reached the maxSize.
     * - int pop() Pops and returns the top of stack or -1 if the stack is empty.
     * - void increment(int k, int val) Increments the bottom k elements of the stack by val. If there are less than k elements in the stack, just increment all the elements in the stack.
     *
     * Example:
     * CustomStack customStack = new CustomStack(3);
     * customStack.push(1);                          // stack becomes [1]
     * customStack.push(2);                          // stack becomes [1, 2]
     * customStack.pop();                            // return 2 --> Return top of the stack 2, stack becomes [1]
     * customStack.push(2);                          // stack becomes [1, 2]
     * customStack.push(3);                          // stack becomes [1, 2, 3]
     * customStack.push(4);                          // stack still [1, 2, 3], Don't add another elements as size is 4
     * customStack.increment(5, 100);                // stack becomes [101, 102, 103]
     * customStack.increment(2, 100);                // stack becomes [201, 202, 103]
     * customStack.pop();                            // return 103 --> Return top of the stack 103, stack becomes [201, 202]
     * customStack.pop();                            // return 202 --> Return top of the stack 202, stack becomes [201]
     * customStack.pop();                            // return 201 --> Return top of the stack 201, stack becomes []
     * customStack.pop();                            // return -1 --> Stack is empty return -1
     */

    static class CustomStack {
        private int[] stack;
        private int[] inc;
        private int top;

        public CustomStack(int maxSize) {
            stack = new int[maxSize];
            inc = new int[maxSize];
            top = -1;
        }

        public void push(int x) {
            // TODO: Implement this method
        }

        public int pop() {
            // TODO: Implement this method
            return -1;
        }

        public void increment(int k, int val) {
            // TODO: Implement this method
        }
    }

    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(3);
        customStack.push(1);
        customStack.push(2);
        System.out.println("Pop: " + customStack.pop());
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.increment(5, 100);
        customStack.increment(2, 100);
        System.out.println("Pop: " + customStack.pop());
        System.out.println("Pop: " + customStack.pop());
        System.out.println("Pop: " + customStack.pop());
        System.out.println("Pop: " + customStack.pop());

        // Expected Output:
        // Pop: 2
        // Pop: 103
        // Pop: 202
        // Pop: 201
        // Pop: -1
    }
}

/*
// Solution Implementation

public void push(int x) {
    if (top < stack.length - 1) {
        top++;
        stack[top] = x;
    }
}

public int pop() {
    if (top == -1) {
        return -1;
    }
    int result = stack[top] + inc[top];
    if (top > 0) {
        inc[top - 1] += inc[top];
    }
    inc[top] = 0;
    top--;
    return result;
}

public void increment(int k, int val) {
    int limit = Math.min(k - 1, top);
    if (limit >= 0) {
        inc[limit] += val;
    }
}
*/
