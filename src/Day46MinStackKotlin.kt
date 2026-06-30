package com.interview.daily

import java.util.Stack

/**
 * Interview Question:
 * How do you design a stack that supports push, pop, top, and retrieving the minimum element in constant time?
 *
 * Explanation:
 * - Use an auxiliary stack to keep track of the minimum element at each level.
 * - When pushing `x`, push `min(x, currentMin)` onto the min stack.
 * - When popping, pop from both stacks.
 */

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
class MinStack {
    private val stack = Stack<Int>()
    private val minStack = Stack<Int>()

    fun push(v: Int) {
        // TODO: Implement this method
    }

    fun pop() {
        // TODO: Implement this method
    }

    fun top(): Int {
        // TODO: Implement this method
        return -1
    }

    fun getMin(): Int {
        // TODO: Implement this method
        return -1
    }
}

fun main() {
    val minStack = MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)

    println("Min: ${minStack.getMin()}")
    minStack.pop()
    println("Top: ${minStack.top()}")
    println("Min: ${minStack.getMin()}")

    // Expected Output:
    // Min: -3
    // Top: 0
    // Min: -2
}

/*
// Solution Implementation

fun push(v: Int) {
    stack.push(v)
    if (minStack.isEmpty() || v <= minStack.peek()) {
        minStack.push(v)
    }
}

fun pop() {
    if (stack.peek() == minStack.peek()) {
        minStack.pop()
    }
    stack.pop()
}

fun top(): Int {
    return stack.peek()
}

fun getMin(): Int {
    return minStack.peek()
}
*/
