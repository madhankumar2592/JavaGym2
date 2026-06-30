package com.interview.daily

/**
 * Interview Question:
 * What is the House Robber problem?
 *
 * Explanation:
 * - The House Robber problem is a classic dynamic programming problem where you are a robber planning to rob houses along a street.
 * - Each house has a certain amount of money.
 * - The constraint is that you cannot rob two adjacent houses.
 * - The goal is to maximize the amount of money you can rob.
 */

/**
 * Problem Description:
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given an integer array `nums` representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 *
 * Example:
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3). Total amount you can rob = 1 + 3 = 4.
 */
fun rob(nums: IntArray): Int {
    TODO("Implement this method")
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    val result = rob(nums)

    println("Max Robbery Amount: $result")

    // Expected Output:
    // Max Robbery Amount: 4
}

/*
// Solution Implementation

fun rob(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    if (nums.size == 1) return nums[0]

    val dp = IntArray(nums.size)
    dp[0] = nums[0]
    dp[1] = maxOf(nums[0], nums[1])

    for (i in 2 until nums.size) {
        dp[i] = maxOf(dp[i - 1], dp[i - 2] + nums[i])
    }

    return dp[nums.size - 1]
}
*/
