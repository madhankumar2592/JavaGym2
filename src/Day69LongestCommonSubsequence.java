package com.interview.daily;

/**
 * Interview Question:
 * What is the Longest Common Subsequence (LCS) problem?
 *
 * Explanation:
 * - The LCS problem is to find the longest subsequence common to all sequences in a set of sequences (often just two sequences).
 * - A subsequence is a sequence that can be derived from another sequence by deleting zero or more elements without changing the order of the remaining elements.
 */

public class Day69LongestCommonSubsequence {

    /**
     * Problem Description:
     * Given two strings text1 and text2, return the length of their longest common subsequence.
     * If there is no common subsequence, return 0.
     *
     * Example:
     * Input: text1 = "abcde", text2 = "ace"
     * Output: 3
     * Explanation: The longest common subsequence is "ace" and its length is 3.
     */

    public static int longestCommonSubsequence(String text1, String text2) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        int result = longestCommonSubsequence(text1, text2);

        System.out.println("LCS Length: " + result);

        // Expected Output:
        // LCS Length: 3
    }
}

/*
// Solution Implementation

public static int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length();
    int n = text2.length();
    int[][] dp = new int[m + 1][n + 1];

    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                dp[i][j] = dp[i - 1][j - 1] + 1;
            } else {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
    }

    return dp[m][n];
}
*/
