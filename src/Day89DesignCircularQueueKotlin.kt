package com.interview.daily

/**
 * Interview Question:
 * What is a Circular Queue?
 *
 * Explanation:
 * - A Circular Queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle.
 * - It is also called "Ring Buffer".
 * - One of the benefits of the circular queue is that we can make use of the spaces in front of the queue.
 */

/**
 * Problem Description:
 * Design your implementation of the circular queue. The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer".
 * One of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue. But using the circular queue, we can use the space to store new values.
 * Implementation the MyCircularQueue class:
 * - MyCircularQueue(k) Initializes the object with the size of the queue to be k.
 * - int Front() Gets the front item from the queue. If the queue is empty, return -1.
 * - int Rear() Gets the last item from the queue. If the queue is empty, return -1.
 * - boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
 * - boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
 * - boolean isEmpty() Checks whether the circular queue is empty or not.
 * - boolean isFull() Checks whether the circular queue is full or not.
 *
 * Example:
 * MyCircularQueue myCircularQueue = new MyCircularQueue(3);
 * myCircularQueue.enQueue(1); // return True
 * myCircularQueue.enQueue(2); // return True
 * myCircularQueue.enQueue(3); // return True
 * myCircularQueue.enQueue(4); // return False
 * myCircularQueue.Rear();     // return 3
 * myCircularQueue.isFull();   // return True
 * myCircularQueue.deQueue();  // return True
 * myCircularQueue.enQueue(4); // return True
 * myCircularQueue.Rear();     // return 4
 */
class MyCircularQueue(private val capacity: Int) {
    private val queue = IntArray(capacity)
    private var head = 0
    private var count = 0

    fun enQueue(value: Int): Boolean {
        TODO("Implement this method")
    }

    fun deQueue(): Boolean {
        TODO("Implement this method")
    }

    fun front(): Int {
        TODO("Implement this method")
    }

    fun rear(): Int {
        TODO("Implement this method")
    }

    fun isEmpty(): Boolean {
        TODO("Implement this method")
    }

    fun isFull(): Boolean {
        TODO("Implement this method")
    }
}

fun main() {
    val myCircularQueue = MyCircularQueue(3)
    println(myCircularQueue.enQueue(1))
    println(myCircularQueue.enQueue(2))
    println(myCircularQueue.enQueue(3))
    println(myCircularQueue.enQueue(4))
    println(myCircularQueue.rear())
    println(myCircularQueue.isFull())
    println(myCircularQueue.deQueue())
    println(myCircularQueue.enQueue(4))
    println(myCircularQueue.rear())

    // Expected Output:
    // true
    // true
    // true
    // false
    // 3
    // true
    // true
    // true
    // 4
}

/*
// Solution Implementation

fun enQueue(value: Int): Boolean {
    if (isFull()) {
        return false
    }
    queue[(head + count) % capacity] = value
    count++
    return true
}

fun deQueue(): Boolean {
    if (isEmpty()) {
        return false
    }
    head = (head + 1) % capacity
    count--
    return true
}

fun front(): Int {
    if (isEmpty()) {
        return -1
    }
    return queue[head]
}

fun rear(): Int {
    if (isEmpty()) {
        return -1
    }
    return queue[(head + count - 1) % capacity]
}

fun isEmpty(): Boolean {
    return count == 0
}

fun isFull(): Boolean {
    return count == capacity
}
*/
