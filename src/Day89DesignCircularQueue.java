package com.interview.daily;

/**
 * Interview Question:
 * What is a Circular Queue?
 *
 * Explanation:
 * - A Circular Queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle.
 * - It is also called "Ring Buffer".
 * - One of the benefits of the circular queue is that we can make use of the spaces in front of the queue.
 */

public class Day89DesignCircularQueue {

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

    static class MyCircularQueue {
        private int[] queue;
        private int head;
        private int count;
        private int capacity;

        public MyCircularQueue(int k) {
            capacity = k;
            queue = new int[k];
            head = 0;
            count = 0;
        }

        public boolean enQueue(int value) {
            // TODO: Implement this method
            return false;
        }

        public boolean deQueue() {
            // TODO: Implement this method
            return false;
        }

        public int Front() {
            // TODO: Implement this method
            return -1;
        }

        public int Rear() {
            // TODO: Implement this method
            return -1;
        }

        public boolean isEmpty() {
            // TODO: Implement this method
            return false;
        }

        public boolean isFull() {
            // TODO: Implement this method
            return false;
        }
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println(myCircularQueue.enQueue(1));
        System.out.println(myCircularQueue.enQueue(2));
        System.out.println(myCircularQueue.enQueue(3));
        System.out.println(myCircularQueue.enQueue(4));
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.isFull());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.enQueue(4));
        System.out.println(myCircularQueue.Rear());

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
}

/*
// Solution Implementation

public boolean enQueue(int value) {
    if (isFull()) {
        return false;
    }
    queue[(head + count) % capacity] = value;
    count++;
    return true;
}

public boolean deQueue() {
    if (isEmpty()) {
        return false;
    }
    head = (head + 1) % capacity;
    count--;
    return true;
}

public int Front() {
    if (isEmpty()) {
        return -1;
    }
    return queue[head];
}

public int Rear() {
    if (isEmpty()) {
        return -1;
    }
    return queue[(head + count - 1) % capacity];
}

public boolean isEmpty() {
    return count == 0;
}

public boolean isFull() {
    return count == capacity;
}
*/
