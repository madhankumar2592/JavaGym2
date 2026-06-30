package com.interview.daily

/**
 * Interview Question:
 * What is `reduce` used for in Java Streams?
 *
 * Explanation:
 * - It's a terminal operation that combines elements of a stream into a single result.
 * - It takes an identity value and an accumulator function.
 * - It's useful for summing numbers, concatenating strings, or finding the max/min element.
 */

/**
 * Problem Description:
 * Given a list of integers, calculate the sum of all numbers using `reduce`.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: 15
 */
fun sumNumbers(list: List<Int>): Int {
    // TODO: Implement this method
    return 0
}

fun main() {
    val input = listOf(1, 2, 3, 4, 5)
    val result = sumNumbers(input)

    println("Sum: $result")

    // Expected Output:
    // Sum: 15
}

/*
// Solution Implementation

fun sumNumbers(list: List<Int>): Int {
    return list.fold(0) { acc, n -> acc + n }
}
*/
