package com.interview.daily

/**
 * Interview Question:
 * What is `Collectors.joining` used for?
 *
 * Explanation:
 * - It's a terminal operation that concatenates the elements of a stream into a single string.
 * - You can specify a delimiter, prefix, and suffix.
 */

/**
 * Problem Description:
 * Given a list of strings, join them into a single comma-separated string.
 *
 * Example:
 * Input: ["apple", "banana", "cherry"]
 * Output: "apple,banana,cherry"
 */
fun joinStrings(list: List<String>): String {
    // TODO: Implement this method
    return TODO()
}

fun main() {
    val input = listOf("apple", "banana", "cherry")
    val result = joinStrings(input)

    println("Joined String: $result")

    // Expected Output:
    // Joined String: apple,banana,cherry
}

/*
// Solution Implementation

fun joinStrings(list: List<String>): String {
    return list.joinToString(",")
}
*/
