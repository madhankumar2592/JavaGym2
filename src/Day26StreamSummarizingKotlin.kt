package com.interview.daily

import java.util.IntSummaryStatistics

/**
 * Interview Question:
 * What is `IntSummaryStatistics` used for?
 *
 * Explanation:
 * - It's a class that collects statistics such as count, sum, min, average, and max.
 * - It's often used with `Collectors.summarizingInt()`.
 */

/**
 * Problem Description:
 * Given a list of integers, calculate the count, sum, min, average, and max using `IntSummaryStatistics`.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: IntSummaryStatistics{count=5, sum=15, min=1, average=3.000000, max=5}
 */
fun calculateStatistics(list: List<Int>): IntSummaryStatistics {
    // TODO: Implement this method
    TODO()
}

fun main() {
    val input = listOf(1, 2, 3, 4, 5)
    val stats = calculateStatistics(input)

    println("Statistics: $stats")

    // Expected Output:
    // Statistics: IntSummaryStatistics{count=5, sum=15, min=1, average=3.000000, max=5}
}

/*
// Solution Implementation

fun calculateStatistics(list: List<Int>): IntSummaryStatistics {
    return list.stream()
            .collect(java.util.stream.Collectors.summarizingInt { it })
}
*/
