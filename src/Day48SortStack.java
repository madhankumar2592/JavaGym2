package com.interview.daily;

import java.util.Stack;

/**
 * Interview Question:
 * How do you sort a stack using only one additional stack?
 *
 * Explanation:
 * - Use an auxiliary stack to store sorted elements.
 * - Pop an element from the original stack.
 * - While the auxiliary stack is not empty and its top is greater than the popped element, pop from the auxiliary stack and push back to the original stack.
 * - Push the popped element onto the auxiliary stack.
 * - Repeat until the original stack is empty.
 */

public class Day48SortStack {

    /**
     * Problem Description:
     * Write a program to sort a stack such that the smallest items are on the top.
     * You can use an additional temporary stack, but you may not copy the elements into any other data structure (such as an array).
     *
     * Example:
     * Input: [3, 1, 4, 2] (top is 2)
     * Output: [1, 2, 3, 4] (top is 1)
     */

    public static void sort(Stack<Integer> s) {
        // TODO: Implement this method
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sort(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        // Expected Output:
        // 1 2 3 4
    }
}

/*
// Solution Implementation

public static void sort(Stack<Integer> s) {
    Stack<Integer> r = new Stack<>();
    while (!s.isEmpty()) {
        int tmp = s.pop();
        while (!r.isEmpty() && r.peek() > tmp) {
            s.push(r.pop());
        }
        r.push(tmp);
    }

    while (!r.isEmpty()) {
        s.push(r.pop());
    }
}
*/
