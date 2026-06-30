package com.interview.daily

/**
 * Interview Question:
 * What is the Unique Paths problem?
 *
 * Explanation:
 * - The Unique Paths problem is a classic dynamic programming problem where you are given a grid of size m x n.
 * - You start at the top-left corner and want to reach the bottom-right corner.
 * - You can only move either down or right at any point in time.
 * - The goal is to find the number of unique paths.
 */

/**
 * Problem Description:
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
 * The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
 * The robot can only move either down or right at any point in time.
 * Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 *
 * Example:
 * Input: m = 3, n = 7
 * Output: 28
 */
fun uniquePaths(m: Int, n: Int): Int {
    // TODO: Implement this method
    return 0
}

fun main() {
    val m = 3
    val n = 7
    val result = uniquePaths(m, n)

    println("Unique Paths: $result")

    // Expected Output:
    // Unique Paths: 28
}

/*
// Solution Implementation

fun uniquePaths(m: Int, n: Int): Int {
    val dp = Array(m) { IntArray(n) }

    for (i in 0 until m) {
        dp[i][0] = 1
    }
    for (j in 0 until n) {
        dp[0][j] = 1
    }

    for (i in 1 until m) {
        for (j in 1 until n) {
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        }
    }

    return dp[m - 1][n - 1]
}
*/
