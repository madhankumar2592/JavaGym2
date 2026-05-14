package com.interview.daily;

/**
 * Interview Question:
 * What is dynamic programming?
 *
 * Explanation:
 * - Dynamic programming is a method for solving complex problems by breaking them down into simpler subproblems.
 * - It solves each subproblem only once and stores the results in a table (memoization) to avoid redundant computations.
 * - It's often used for optimization problems.
 */

public class Day67ClimbingStairs {

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

    public static int climbStairs(int n) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        int n = 3;
        int result = climbStairs(n);

        System.out.println("Ways to climb: " + result);

        // Expected Output:
        // Ways to climb: 3
    }
}

/*
// Solution Implementation

public static int climbStairs(int n) {
    if (n <= 1) {
        return 1;
    }

    int[] dp = new int[n + 1];
    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
}
*/
