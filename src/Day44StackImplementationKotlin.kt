package com.interview.daily

/**
 * Interview Question:
 * How does a Stack work?
 *
 * Explanation:
 * - A Stack follows the LIFO (Last-In, First-Out) principle.
 * - The last element added is the first one to be removed.
 * - Key operations: push (add), pop (remove), peek (view top), isEmpty.
 */

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
class MyStack(size: Int) {
    private val arr = IntArray(size)
    private val capacity = size
    private var top = -1

    fun push(x: Int) {
        TODO("Implement this method")
    }

    fun pop(): Int {
        TODO("Implement this method")
    }

    fun peek(): Int {
        TODO("Implement this method")
    }

    fun isEmpty(): Boolean {
        TODO("Implement this method")
    }
}

fun main() {
    val stack = MyStack(5)
    stack.push(10)
    stack.push(20)
    stack.push(30)

    println("Popped: ${stack.pop()}")
    println("Peek: ${stack.peek()}")
    println("Is Empty: ${stack.isEmpty()}")

    // Expected Output:
    // Popped: 30
    // Peek: 20
    // Is Empty: false
}

/*
// Solution Implementation

fun push(x: Int) {
    if (top == capacity - 1) {
        println("Stack Overflow")
        return
    }
    arr[++top] = x
}

fun pop(): Int {
    if (isEmpty()) {
        println("Stack Underflow")
        return -1
    }
    return arr[top--]
}

fun peek(): Int {
    if (isEmpty()) {
        return -1
    }
    return arr[top]
}

fun isEmpty(): Boolean {
    return top == -1
}
*/
