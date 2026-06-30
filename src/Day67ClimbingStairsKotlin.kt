package com.interview.daily

/**
 * Interview Question:
 * What is dynamic programming?
 *
 * Explanation:
 * - Dynamic programming is a method for solving complex problems by breaking them down into simpler subproblems.
 * - It solves each subproblem only once and stores the results in a table (memoization) to avoid redundant computations.
 * - It's often used for optimization problems.
 */

/**
 * Problem Description:
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
fun climbStairs(n: Int): Int {
    // TODO: Implement this method
    return 0
}

fun main() {
    val n = 3
    val result = climbStairs(n)

    println("Ways to climb: $result")

    // Expected Output:
    // Ways to climb: 3
}

/*
// Solution Implementation

fun climbStairs(n: Int): Int {
    if (n <= 1) {
        return 1
    }

    val dp = IntArray(n + 1)
    dp[0] = 1
    dp[1] = 1

    for (i in 2..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    return dp[n]
}
*/
