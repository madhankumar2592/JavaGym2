package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `sorted()` and `sorted(Comparator)` in Java Streams?
 *
 * Explanation:
 * - `sorted()`: Sorts elements based on their natural order (requires the class to implement `Comparable`).
 * - `sorted(Comparator)`: Sorts elements using a custom `Comparator`.
 */

/**
 * Problem Description:
 * Given a list of strings, sort them in alphabetical order using Java Streams.
 *
 * Example:
 * Input: ["banana", "apple", "cherry"]
 * Output: ["apple", "banana", "cherry"]
 */
fun sortStrings(list: List<String>): List<String>? {
    // TODO: Implement this method
    return TODO()
}

fun main() {
    val input = listOf("banana", "apple", "cherry")
    val result = sortStrings(input)

    println("Sorted List: $result")

    // Expected Output:
    // Sorted List: [apple, banana, cherry]
}

/*
// Solution Implementation

fun sortStrings(list: List<String>): List<String> {
    return list.sorted()
}
*/
