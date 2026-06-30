package com.interview.daily

/**
 * Interview Question:
 * How would you design a stack with an increment operation?
 *
 * Explanation:
 * - A stack with an increment operation allows you to increment the bottom k elements by a certain value.
 * - This operation should be efficient, ideally O(1).
 * - You can achieve this by using an auxiliary array to store the increment values.
 */

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
class CustomStack(maxSize: Int) {
    private val stack = IntArray(maxSize)
    private val inc = IntArray(maxSize)
    private var top = -1

    fun push(x: Int) {
        // TODO: Implement this method
    }

    fun pop(): Int {
        // TODO: Implement this method
        return -1
    }

    fun increment(k: Int, `val`: Int) {
        // TODO: Implement this method
    }
}

fun main() {
    val customStack = CustomStack(3)
    customStack.push(1)
    customStack.push(2)
    println("Pop: ${customStack.pop()}")
    customStack.push(2)
    customStack.push(3)
    customStack.push(4)
    customStack.increment(5, 100)
    customStack.increment(2, 100)
    println("Pop: ${customStack.pop()}")
    println("Pop: ${customStack.pop()}")
    println("Pop: ${customStack.pop()}")
    println("Pop: ${customStack.pop()}")

    // Expected Output:
    // Pop: 2
    // Pop: 103
    // Pop: 202
    // Pop: 201
    // Pop: -1
}

/*
// Solution Implementation

fun push(x: Int) {
    if (top < stack.size - 1) {
        top++
        stack[top] = x
    }
}

fun pop(): Int {
    if (top == -1) {
        return -1
    }
    val result = stack[top] + inc[top]
    if (top > 0) {
        inc[top - 1] += inc[top]
    }
    inc[top] = 0
    top--
    return result
}

fun increment(k: Int, `val`: Int) {
    val limit = minOf(k - 1, top)
    if (limit >= 0) {
        inc[limit] += `val`
    }
}
*/
