package com.interview.daily;

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

public class Day72UniquePaths {

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

    public static int uniquePaths(int m, int n) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int result = uniquePaths(m, n);

        System.out.println("Unique Paths: " + result);

        // Expected Output:
        // Unique Paths: 28
    }
}

/*
// Solution Implementation

public static int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];

    for (int i = 0; i < m; i++) {
        dp[i][0] = 1;
    }
    for (int j = 0; j < n; j++) {
        dp[0][j] = 1;
    }

    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
    }

    return dp[m - 1][n - 1];
}
*/
