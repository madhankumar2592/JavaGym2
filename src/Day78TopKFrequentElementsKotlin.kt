package com.interview.daily

import java.util.PriorityQueue

/**
 * Interview Question:
 * What is a Priority Queue?
 *
 * Explanation:
 * - A Priority Queue is an abstract data type similar to a regular queue or stack data structure in which each element additionally has a "priority" associated with it.
 * - In a priority queue, an element with high priority is served before an element with low priority.
 * - It's often implemented using a heap.
 */

/**
 * Problem Description:
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 * Example:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 */
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    // TODO: Implement this method
    return IntArray(0)
}

fun main() {
    val nums = intArrayOf(1, 1, 1, 2, 2, 3)
    val k = 2
    val result = topKFrequent(nums, k)

    print("Top K Frequent: ")
    result.forEach { num -> print("$num ") }
    println()

    // Expected Output:
    // Top K Frequent: 1 2
}

/*
// Solution Implementation

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val count = mutableMapOf<Int, Int>()
    for (n in nums) {
        count[n] = count.getOrDefault(n, 0) + 1
    }

    val heap = PriorityQueue<Int> { n1, n2 -> count.getValue(n1) - count.getValue(n2) }

    for (n in count.keys) {
        heap.add(n)
        if (heap.size > k) {
            heap.poll()
        }
    }

    val top = IntArray(k)
    for (i in k - 1 downTo 0) {
        top[i] = heap.poll()
    }
    return top
}
*/
