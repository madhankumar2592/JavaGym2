package com.interview.daily

/**
 * Interview Question:
 * What is the difference between greedy algorithms and dynamic programming?
 *
 * Explanation:
 * - Greedy algorithms make the locally optimal choice at each step with the hope of finding a global optimum.
 * - Dynamic programming breaks down a problem into subproblems and solves them optimally.
 * - Greedy algorithms don't always guarantee a globally optimal solution, while DP does.
 */

/**
 * Problem Description:
 * You are given an integer array `coins` representing coins of different denominations and an integer `amount` representing a total amount of money.
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 *
 * Example:
 * Input: coins = [1, 2, 5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 */
fun coinChange(coins: IntArray, amount: Int): Int {
    // TODO: Implement this method
    return -1
}

fun main() {
    val coins = intArrayOf(1, 2, 5)
    val amount = 11
    val result = coinChange(coins, amount)

    println("Fewest coins: $result")

    // Expected Output:
    // Fewest coins: 3
}

/*
// Solution Implementation

fun coinChange(coins: IntArray, amount: Int): Int {
    val dp = IntArray(amount + 1) { amount + 1 }
    dp[0] = 0

    for (i in 1..amount) {
        for (coin in coins) {
            if (i >= coin) {
                dp[i] = minOf(dp[i], dp[i - coin] + 1)
            }
        }
    }

    return if (dp[amount] > amount) -1 else dp[amount]
}
*/
