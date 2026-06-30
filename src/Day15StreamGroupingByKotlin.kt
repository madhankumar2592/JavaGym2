package com.interview.daily

/**
 * Interview Question:
 * What is `Collectors.groupingBy` used for?
 *
 * Explanation:
 * - It's a terminal operation used to group elements of a stream into a `Map`.
 * - The keys of the map are determined by a classifier function, and the values are lists of elements that map to that key.
 */

/**
 * Problem Description:
 * Given a list of strings, group them by their length.
 *
 * Example:
 * Input: ["apple", "banana", "cherry", "date"]
 * Output: {4=[date], 5=[apple], 6=[banana, cherry]}
 */
fun groupStringsByLength(list: List<String>): Map<Int, List<String>> {
    // TODO: Implement this method
    TODO()
}

fun main() {
    val input = listOf("apple", "banana", "cherry", "date")
    val result = groupStringsByLength(input)

    println("Grouped by Length: $result")

    // Expected Output:
    // Grouped by Length: {4=[date], 5=[apple], 6=[banana, cherry]}
}

/*
// Solution Implementation

fun groupStringsByLength(list: List<String>): Map<Int, List<String>> {
    return list.groupBy { it.length }
}
*/
