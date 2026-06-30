package com.interview.daily

/**
 * Interview Question:
 * How do you create a custom collector in Java Streams?
 *
 * Explanation:
 * You can create a custom collector using `Collector.of()`.
 * It requires:
 * - A supplier: Creates a new result container.
 * - An accumulator: Incorporates an element into the result container.
 * - A combiner: Merges two result containers.
 * - A finisher: Transforms the final result container into the desired result.
 */

/**
 * Problem Description:
 * Given a list of strings, concatenate them into a single string with a custom delimiter and prefix/suffix.
 *
 * Example:
 * Input: ["apple", "banana", "cherry"]
 * Output: "[apple, banana, cherry]"
 */
fun customJoin(list: List<String>): String {
    TODO("Implement this method")
}

fun main() {
    val input = listOf("apple", "banana", "cherry")
    val result = customJoin(input)

    println("Custom Join: $result")

    // Expected Output:
    // Custom Join: [apple, banana, cherry]
}

/*
// Solution Implementation

fun customJoin(list: List<String>): String {
    return list.joinToString(separator = ", ", prefix = "[", postfix = "]")
}
*/
