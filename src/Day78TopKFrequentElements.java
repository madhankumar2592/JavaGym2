package com.interview.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Interview Question:
 * What is a Priority Queue?
 *
 * Explanation:
 * - A Priority Queue is an abstract data type similar to a regular queue or stack data structure in which each element additionally has a "priority" associated with it.
 * - In a priority queue, an element with high priority is served before an element with low priority.
 * - It's often implemented using a heap.
 */

public class Day78TopKFrequentElements {

    /**
     * Problem Description:
     * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
     *
     * Example:
     * Input: nums = [1,1,1,2,2,3], k = 2
     * Output: [1,2]
     */

    public static int[] topKFrequent(int[] nums, int k) {
        // TODO: Implement this method
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = topKFrequent(nums, k);

        System.out.print("Top K Frequent: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Expected Output:
        // Top K Frequent: 1 2
    }
}

/*
// Solution Implementation

public static int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> count = new HashMap<>();
    for (int n : nums) {
        count.put(n, count.getOrDefault(n, 0) + 1);
    }

    PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));

    for (int n : count.keySet()) {
        heap.add(n);
        if (heap.size() > k) {
            heap.poll();
        }
    }

    int[] top = new int[k];
    for (int i = k - 1; i >= 0; --i) {
        top[i] = heap.poll();
    }
    return top;
}
*/
