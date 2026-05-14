package com.interview.daily;

import java.util.PriorityQueue;

/**
 * Interview Question:
 * What is the Median of a data stream?
 *
 * Explanation:
 * - The median is the middle value in an ordered integer list.
 * - If the size of the list is even, there is no middle value and the median is the mean of the two middle values.
 * - The goal is to efficiently find the median as new numbers are added to the stream.
 */

public class Day80FindMedianFromDataStream {

    /**
     * Problem Description:
     * The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value and the median is the mean of the two middle values.
     * Implement the MedianFinder class:
     * - MedianFinder() initializes the MedianFinder object.
     * - void addNum(int num) adds the integer num from the data stream to the data structure.
     * - double findMedian() returns the median of all elements so far.
     *
     * Example:
     * MedianFinder medianFinder = new MedianFinder();
     * medianFinder.addNum(1);    // arr = [1]
     * medianFinder.addNum(2);    // arr = [1, 2]
     * medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
     * medianFinder.addNum(3);    // arr[1, 2, 3]
     * medianFinder.findMedian(); // return 2.0
     */

    static class MedianFinder {
        private PriorityQueue<Integer> maxHeap; // Stores the smaller half
        private PriorityQueue<Integer> minHeap; // Stores the larger half

        public MedianFinder() {
            maxHeap = new PriorityQueue<>((a, b) -> b - a);
            minHeap = new PriorityQueue<>();
        }

        public void addNum(int num) {
            // TODO: Implement this method
        }

        public double findMedian() {
            // TODO: Implement this method
            return 0.0;
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println("Median: " + medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println("Median: " + medianFinder.findMedian());

        // Expected Output:
        // Median: 1.5
        // Median: 2.0
    }
}

/*
// Solution Implementation

public void addNum(int num) {
    maxHeap.offer(num);
    minHeap.offer(maxHeap.poll());
    if (maxHeap.size() < minHeap.size()) {
        maxHeap.offer(minHeap.poll());
    }
}

public double findMedian() {
    if (maxHeap.size() == minHeap.size()) {
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    } else {
        return maxHeap.peek();
    }
}
*/
