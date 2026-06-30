package com.interview.daily

import java.util.Stack

/**
 * Interview Question:
 * How does a Queue work?
 *
 * Explanation:
 * - A Queue follows the FIFO (First-In, First-Out) principle.
 * - The first element added is the first one to be removed.
 * - Key operations: enqueue (add), dequeue (remove), peek (view front), isEmpty.
 */

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
class MyQueue {
    private val s1: Stack<Int> = Stack()
    private val s2: Stack<Int> = Stack()

    fun enqueue(x: Int) {
        TODO("Implement this method")
    }

    fun dequeue(): Int {
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
    val queue = MyQueue()
    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)

    println("Dequeued: ${queue.dequeue()}")
    println("Peek: ${queue.peek()}")
    println("Is Empty: ${queue.isEmpty()}")

    // Expected Output:
    // Dequeued: 10
    // Peek: 20
    // Is Empty: false
}

/*
// Solution Implementation

fun enqueue(x: Int) {
    s1.push(x)
}

fun dequeue(): Int {
    if (s2.isEmpty()) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop())
        }
    }
    return s2.pop()
}

fun peek(): Int {
    if (s2.isEmpty()) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop())
        }
    }
    return s2.peek()
}

fun isEmpty(): Boolean {
    return s1.isEmpty() && s2.isEmpty()
}
*/
