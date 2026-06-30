package com.interview.daily

/**
 * Interview Question:
 * What is the Longest Common Subsequence (LCS) problem?
 *
 * Explanation:
 * - The LCS problem is to find the longest subsequence common to all sequences in a set of sequences (often just two sequences).
 * - A subsequence is a sequence that can be derived from another sequence by deleting zero or more elements without changing the order of the remaining elements.
 */

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
fun longestCommonSubsequence(text1: String, text2: String): Int {
    TODO("Implement this method")
}

fun main() {
    val text1 = "abcde"
    val text2 = "ace"
    val result = longestCommonSubsequence(text1, text2)

    println("LCS Length: $result")

    // Expected Output:
    // LCS Length: 3
}

/*
// Solution Implementation

fun longestCommonSubsequence(text1: String, text2: String): Int {
    val m = text1.length
    val n = text2.length
    val dp = Array(m + 1) { IntArray(n + 1) }

    for (i in 1..m) {
        for (j in 1..n) {
            if (text1[i - 1] == text2[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1
            } else {
                dp[i][j] = maxOf(dp[i - 1][j], dp[i][j - 1])
            }
        }
    }

    return dp[m][n]
}
*/
