package com.interview.daily

/**
 * Interview Question:
 * What is the Jump Game problem?
 *
 * Explanation:
 * - The Jump Game problem is a classic dynamic programming problem where you are given an array of non-negative integers.
 * - You are initially positioned at the first index of the array.
 * - Each element in the array represents your maximum jump length at that position.
 * - Determine if you can reach the last index.
 */

/**
 * Problem Description:
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise.
 *
 * Example:
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
fun canJump(nums: IntArray): Boolean {
    TODO("Implement this method")
}

fun main() {
    val nums = intArrayOf(2, 3, 1, 1, 4)
    val result = canJump(nums)

    println("Can Jump: $result")

    // Expected Output:
    // Can Jump: true
}

/*
// Solution Implementation

fun canJump(nums: IntArray): Boolean {
    var maxReach = 0
    for (i in nums.indices) {
        if (i > maxReach) {
            return false
        }
        maxReach = maxOf(maxReach, i + nums[i])
    }
    return true
}
*/
