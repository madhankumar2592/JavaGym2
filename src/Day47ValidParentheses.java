package com.interview.daily;

import java.util.Stack;

/**
 * Interview Question:
 * What is the difference between `Stack` and `Deque`?
 *
 * Explanation:
 * - `Stack`: LIFO. Legacy class, synchronized.
 * - `Deque`: Double-ended queue. Can be used as a stack (LIFO) or a queue (FIFO). Not synchronized.
 * - `Deque` (e.g., `ArrayDeque`) is generally preferred over `Stack` for stack operations.
 */

public class Day47ValidParentheses {

    /**
     * Problem Description:
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * An input string is valid if:
     * 1. Open brackets must be closed by the same type of brackets.
     * 2. Open brackets must be closed in the correct order.
     *
     * Example:
     * Input: "()[]{}"
     * Output: true
     */

    public static boolean isValid(String s) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        String input = "()[]{}";
        boolean result = isValid(input);

        System.out.println("Is Valid: " + result);

        // Expected Output:
        // Is Valid: true
    }
}

/*
// Solution Implementation

public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
        if (c == '(') {
            stack.push(')');
        } else if (c == '{') {
            stack.push('}');
        } else if (c == '[') {
            stack.push(']');
        } else if (stack.isEmpty() || stack.pop() != c) {
            return false;
        }
    }
    return stack.isEmpty();
}
*/
