package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `String` and `char[]`?
 *
 * Explanation:
 * - `String` is immutable, meaning its value cannot be changed after creation.
 * - `char[]` is mutable, meaning its elements can be changed.
 * - `String` is more convenient for string operations, while `char[]` is more efficient for in-place modifications.
 */

/**
 * Problem Description:
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string "aabcccccaaa" would become "a2b1c5a3".
 * If the "compressed" string would not become smaller than the original string, your method should return the original string.
 *
 * Example:
 * Input: "aabcccccaaa"
 * Output: "a2b1c5a3"
 */
fun compressString(s: String): String {
    TODO("Implement this method")
}

fun main() {
    val input = "aabcccccaaa"
    val result = compressString(input)

    println("Compressed String: $result")

    // Expected Output:
    // Compressed String: a2b1c5a3
}

/*
// Solution Implementation

fun compressString(s: String): String {
    if (s.isEmpty()) return s

    val compressed = buildString {
        var count = 1
        for (i in 1 until s.length) {
            if (s[i] == s[i - 1]) {
                count++
            } else {
                append(s[i - 1])
                append(count)
                count = 1
            }
        }
        append(s.last())
        append(count)
    }

    return if (compressed.length < s.length) compressed else s
}
*/
