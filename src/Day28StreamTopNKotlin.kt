package com.interview.daily

/**
 * Interview Question:
 * How do you find the top N elements in a list using streams?
 *
 * Explanation:
 * You can use a combination of `sorted`, `limit`, and `collect`.
 * - `sorted(Comparator.reverseOrder())`: Sorts the elements in descending order.
 * - `limit(N)`: Restricts the stream to the first N elements.
 * - `collect(Collectors.toList())`: Collects the top N elements into a list.
 */

/**
 * Problem Description:
 * Given a list of integers, find the top 3 numbers.
 *
 * Example:
 * Input: [1, 5, 2, 8, 3, 9, 4]
 * Output: [9, 8, 5]
 */
fun findTopN(list: List<Int>, n: Int): List<Int> {
    // TODO: Implement this method
    TODO()
}

fun main() {
    val input = listOf(1, 5, 2, 8, 3, 9, 4)
    val result = findTopN(input, 3)

    println("Top 3: $result")

    // Expected Output:
    // Top 3: [9, 8, 5]
}

/*
// Solution Implementation

fun findTopN(list: List<Int>, n: Int): List<Int> {
    return list.sortedDescending().take(n)
}
*/
