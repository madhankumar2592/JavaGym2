package com.interview.daily

/**
 * Interview Question:
 * What is `Collectors.partitioningBy` used for?
 *
 * Explanation:
 * - It's a terminal operation that partitions elements into two groups based on a predicate.
 * - The result is a `Map<Boolean, List<T>>` where `true` contains elements that satisfy the predicate, and `false` contains those that don't.
 */

/**
 * Problem Description:
 * Given a list of integers, partition them into even and odd numbers.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: {false=[1, 3, 5], true=[2, 4]}
 */
fun partitionEvenOdd(list: List<Int>): Map<Boolean, List<Int>> {
    TODO("Implement this method")
}

fun main() {
    val input = listOf(1, 2, 3, 4, 5)
    val result = partitionEvenOdd(input)

    println("Partitioned: $result")

    // Expected Output:
    // Partitioned: {false=[1, 3, 5], true=[2, 4]}
}

/*
// Solution Implementation

fun partitionEvenOdd(list: List<Int>): Map<Boolean, List<Int>> {
    return list.groupBy { n -> n % 2 == 0 }
}
*/
