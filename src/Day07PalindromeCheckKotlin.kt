package com.interview.daily

/**
 * Interview Question:
 * What are Java Streams?
 *
 * Explanation:
 * - A sequence of elements from a source that supports aggregate operations.
 * - They are not a data structure; they process data from a source (e.g., Collection, Array).
 * - Operations can be intermediate (e.g., filter, map) or terminal (e.g., forEach, collect).
 * - They allow for functional-style programming and can be parallelized easily.
 */

/**
 * Problem Description:
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Example:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 */
fun isPalindrome(s: String): Boolean {
    // TODO: Implement this method
    return false
}

fun main() {
    val input = "A man, a plan, a canal: Panama"
    val result = isPalindrome(input)

    println("Is Palindrome: $result")

    // Expected Output:
    // Is Palindrome: true
}

/*
// Solution Implementation

fun isPalindrome(s: String): Boolean {
    var left = 0
    var right = s.length - 1

    while (left < right) {
        val cLeft = s[left]
        val cRight = s[right]

        if (!cLeft.isLetterOrDigit()) {
            left++
        } else if (!cRight.isLetterOrDigit()) {
            right--
        } else {
            if (cLeft.lowercaseChar() != cRight.lowercaseChar()) {
                return false
            }
            left++
            right--
        }
    }
    return true
}
*/
