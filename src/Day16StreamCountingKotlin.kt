package com.interview.daily

/**
 * Interview Question:
 * What is `Collectors.counting` used for?
 *
 * Explanation:
 * - It's a downstream collector used to count the number of elements in each group.
 * - It's often used with `groupingBy` to get the frequency of elements.
 */

/**
 * Problem Description:
 * Given a list of strings, count the frequency of each string.
 *
 * Example:
 * Input: ["apple", "banana", "apple", "cherry", "banana", "apple"]
 * Output: {apple=3, banana=2, cherry=1}
 */
fun countWordFrequency(list: List<String>): Map<String, Long>? {
    // TODO: Implement this method
    return TODO()
}

fun main() {
    val input = listOf("apple", "banana", "apple", "cherry", "banana", "apple")
    val result = countWordFrequency(input)

    println("Word Frequency: $result")

    // Expected Output:
    // Word Frequency: {apple=3, banana=2, cherry=1}
}

/*
// Solution Implementation

fun countWordFrequency(list: List<String>): Map<String, Long> {
    return list.groupBy { it }.mapValues { it.value.size.toLong() }
}
*/
