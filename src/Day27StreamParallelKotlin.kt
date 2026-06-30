package com.interview.daily

/**
 * Interview Question:
 * What is `parallelStream` used for?
 *
 * Explanation:
 * - It's a method that returns a parallel stream, which processes elements concurrently using multiple threads.
 * - It can improve performance for large datasets or computationally expensive operations.
 * - However, it can also introduce overhead and potential concurrency issues.
 */

/**
 * Problem Description:
 * Given a list of integers, calculate the sum of their squares using a parallel stream.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: 55
 */
fun sumOfSquares(list: List<Int>): Int {
    // TODO: Implement this method
    return 0
}

fun main() {
    val input = listOf(1, 2, 3, 4, 5)
    val result = sumOfSquares(input)

    println("Sum of Squares: $result")

    // Expected Output:
    // Sum of Squares: 55
}

/*
// Solution Implementation

fun sumOfSquares(list: List<Int>): Int {
    return list.parallelStream()
        .mapToInt { n -> n * n }
        .sum()
}
*/
