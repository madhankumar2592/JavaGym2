package com.interview.daily

import java.util.Stack

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

/**
 * Problem Description:
 * Write a program to sort a stack such that the smallest items are on the top.
 * You can use an additional temporary stack, but you may not copy the elements into any other data structure (such as an array).
 *
 * Example:
 * Input: [3, 1, 4, 2] (top is 2)
 * Output: [1, 2, 3, 4] (top is 1)
 */
fun sort(s: Stack<Int>) {
    TODO("Implement this method")
}

fun main() {
    val stack = Stack<Int>()
    stack.push(3)
    stack.push(1)
    stack.push(4)
    stack.push(2)

    sort(stack)

    while (stack.isNotEmpty()) {
        print("${stack.pop()} ")
    }
    println()

    // Expected Output:
    // 1 2 3 4
}

/*
// Solution Implementation

fun sort(s: Stack<Int>) {
    val r = Stack<Int>()
    while (s.isNotEmpty()) {
        val tmp = s.pop()
        while (r.isNotEmpty() && r.peek() > tmp) {
            s.push(r.pop())
        }
        r.push(tmp)
    }

    while (r.isNotEmpty()) {
        s.push(r.pop())
    }
}
*/
