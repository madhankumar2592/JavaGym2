package com.interview.daily

/**
 * Interview Question:
 * What is `max` used for in Java Streams?
 *
 * Explanation:
 * - It's a terminal operation that returns the maximum element of a stream.
 * - It takes a `Comparator` to determine the order of elements.
 * - It returns an `Optional` because the stream might be empty.
 */

/**
 * Problem Description:
 * Given a list of integers, find the maximum number using `max`.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: 5
 */
fun findMax(list: List<Int>): Int {
    // TODO: Implement this method
    return TODO()
}

fun main() {
    val input = listOf(1, 2, 3, 4, 5)
    val result = findMax(input)

    println("Max: $result")

    // Expected Output:
    // Max: 5
}

/*
// Solution Implementation

fun findMax(list: List<Int>): Int {
    return list.maxOrNull() ?: 0
}
*/
