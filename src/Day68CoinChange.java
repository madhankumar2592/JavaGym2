package com.interview.daily;

import java.util.Arrays;

/**
 * Interview Question:
 * What is the difference between greedy algorithms and dynamic programming?
 *
 * Explanation:
 * - Greedy algorithms make the locally optimal choice at each step with the hope of finding a global optimum.
 * - Dynamic programming breaks down a problem into subproblems and solves them optimally.
 * - Greedy algorithms don't always guarantee a globally optimal solution, while DP does.
 */

public class Day68CoinChange {

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

    public static int coinChange(int[] coins, int amount) {
        // TODO: Implement this method
        return -1;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = coinChange(coins, amount);

        System.out.println("Fewest coins: " + result);

        // Expected Output:
        // Fewest coins: 3
    }
}

/*
// Solution Implementation

public static int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);
    dp[0] = 0;

    for (int i = 1; i <= amount; i++) {
        for (int coin : coins) {
            if (i >= coin) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
    }

    return dp[amount] > amount ? -1 : dp[amount];
}
*/
