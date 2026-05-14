package com.interview.daily;

import java.util.PriorityQueue;

/**
 * Interview Question:
 * What is the Kth Largest Element problem?
 *
 * Explanation:
 * - The Kth Largest Element problem is to find the Kth largest element in an unsorted array.
 * - Note that it is the Kth largest element in the sorted order, not the Kth distinct element.
 */

public class Day79KthLargestElementInArray {

    /**
     * Problem Description:
     * Given an integer array nums and an integer k, return the kth largest element in the array.
     * Note that it is the kth largest element in the sorted order, not the kth distinct element.
     *
     * Example:
     * Input: nums = [3,2,1,5,6,4], k = 2
     * Output: 5
     */

    public static int findKthLargest(int[] nums, int k) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = findKthLargest(nums, k);

        System.out.println("Kth Largest: " + result);

        // Expected Output:
        // Kth Largest: 5
    }
}

/*
// Solution Implementation

public static int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for (int n : nums) {
        heap.add(n);
        if (heap.size() > k) {
            heap.poll();
        }
    }
    return heap.peek();
}
*/
