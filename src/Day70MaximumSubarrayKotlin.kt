package com.interview.daily

/**
 * Interview Question:
 * What is Kadane's Algorithm?
 *
 * Explanation:
 * - Kadane's Algorithm is an efficient algorithm to find the maximum sum contiguous subarray within a one-dimensional array of numbers.
 * - It works by iterating through the array and keeping track of the maximum sum ending at each position.
 */

/**
 * Problem Description:
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
fun maxSubArray(nums: IntArray): Int {
    // TODO: Implement this method
    return 0
}

fun main() {
    val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val result = maxSubArray(nums)

    println("Max Subarray Sum: $result")

    // Expected Output:
    // Max Subarray Sum: 6
}

/*
// Solution Implementation

fun maxSubArray(nums: IntArray): Int {
    var maxSoFar = nums[0]
    var maxEndingHere = nums[0]

    for (i in 1 until nums.size) {
        maxEndingHere = maxOf(nums[i], maxEndingHere + nums[i])
        maxSoFar = maxOf(maxSoFar, maxEndingHere)
    }

    return maxSoFar
}
*/
