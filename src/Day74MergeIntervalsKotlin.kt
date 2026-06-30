package com.interview.daily

/**
 * Interview Question:
 * What is the Merge Intervals problem?
 *
 * Explanation:
 * - The Merge Intervals problem is a classic interval problem where you are given a collection of intervals.
 * - The goal is to merge all overlapping intervals.
 * - For example, [1,3] and [2,6] overlap and should be merged into [1,6].
 */

/**
 * Problem Description:
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 *
 * Example:
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 */
fun merge(intervals: Array<IntArray>): Array<IntArray> {
    // TODO: Implement this method
    return emptyArray()
}

fun main() {
    val intervals = arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))
    val result = merge(intervals)

    print("Merged Intervals: ")
    result.forEach { interval -> print("${interval.toList()} ") }
    println()

    // Expected Output:
    // Merged Intervals: [1, 6] [8, 10] [15, 18]
}

/*
// Solution Implementation

fun merge(intervals: Array<IntArray>): Array<IntArray> {
    if (intervals.size <= 1) return intervals

    val sorted = intervals.sortedBy { it[0] }
    val result = mutableListOf<IntArray>()
    var currentInterval = sorted[0].copyOf()
    result.add(currentInterval)

    for (interval in sorted) {
        if (interval[0] <= currentInterval[1]) {
            currentInterval[1] = maxOf(currentInterval[1], interval[1])
        } else {
            currentInterval = interval.copyOf()
            result.add(currentInterval)
        }
    }

    return result.toTypedArray()
}
*/
