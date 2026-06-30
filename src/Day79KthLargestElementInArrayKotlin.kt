package com.interview.daily

import java.util.PriorityQueue

/**
 * Interview Question:
 * What is the Kth Largest Element problem?
 *
 * Explanation:
 * - The Kth Largest Element problem is to find the Kth largest element in an unsorted array.
 * - Note that it is the Kth largest element in the sorted order, not the Kth distinct element.
 */

/**
 * Problem Description:
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Example:
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 */
fun findKthLargest(nums: IntArray, k: Int): Int {
    // TODO: Implement this method
    return 0
}

fun main() {
    val nums = intArrayOf(3, 2, 1, 5, 6, 4)
    val k = 2
    val result = findKthLargest(nums, k)

    println("Kth Largest: $result")

    // Expected Output:
    // Kth Largest: 5
}

/*
// Solution Implementation

fun findKthLargest(nums: IntArray, k: Int): Int {
    val heap = PriorityQueue<Int>()
    for (n in nums) {
        heap.add(n)
        if (heap.size > k) {
            heap.poll()
        }
    }
    return heap.peek()
}
*/
