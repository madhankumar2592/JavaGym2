package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `Stack` and `Deque`?
 *
 * Explanation:
 * - `Stack`: LIFO. Legacy class, synchronized.
 * - `Deque`: Double-ended queue. Can be used as a stack (LIFO) or a queue (FIFO). Not synchronized.
 * - `Deque` (e.g., `ArrayDeque`) is generally preferred over `Stack` for stack operations.
 */

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
fun isValid(s: String): Boolean {
    TODO("Implement this method")
}

fun main() {
    val input = "()[]{}"
    val result = isValid(input)

    println("Is Valid: $result")

    // Expected Output:
    // Is Valid: true
}

/*
// Solution Implementation

fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    for (c in s) {
        when (c) {
            '(' -> stack.addLast(')')
            '{' -> stack.addLast('}')
            '[' -> stack.addLast(']')
            else -> if (stack.isEmpty() || stack.removeLast() != c) return false
        }
    }
    return stack.isEmpty()
}
*/
