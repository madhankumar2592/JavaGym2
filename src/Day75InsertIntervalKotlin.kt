package com.interview.daily

/**
 * Interview Question:
 * What is the Insert Interval problem?
 *
 * Explanation:
 * - The Insert Interval problem is a variation of the Merge Intervals problem where you are given a set of non-overlapping intervals sorted by their start times.
 * - The goal is to insert a new interval into this set and merge if necessary.
 */

/**
 * Problem Description:
 * You are given an array of non-overlapping intervals `intervals` where `intervals[i] = [starti, endi]` represent the start and the end of the ith interval and `intervals` is sorted in ascending order by `starti`.
 * You are also given an interval `newInterval = [start, end]` that represents the start and end of another interval.
 * Insert `newInterval` into `intervals` such that `intervals` is still sorted in ascending order by `starti` and `intervals` still does not have any overlapping intervals (merge overlapping intervals if necessary).
 *
 * Example:
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 */
fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    // TODO: Implement this method
    TODO()
}

fun main() {
    val intervals = arrayOf(intArrayOf(1, 3), intArrayOf(6, 9))
    val newInterval = intArrayOf(2, 5)
    val result = insert(intervals, newInterval)

    print("Inserted and Merged Intervals: ")
    for (interval in result) {
        print("${interval.toList()} ")
    }
    println()

    // Expected Output:
    // Inserted and Merged Intervals: [1, 5] [6, 9]
}

/*
// Solution Implementation

fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    val result = mutableListOf<IntArray>()
    var i = 0
    var newInterval = newInterval

    // Add all intervals that come before the new interval
    while (i < intervals.size && intervals[i][1] < newInterval[0]) {
        result.add(intervals[i])
        i++
    }

    // Merge all overlapping intervals
    while (i < intervals.size && intervals[i][0] <= newInterval[1]) {
        newInterval = intArrayOf(
            minOf(newInterval[0], intervals[i][0]),
            maxOf(newInterval[1], intervals[i][1])
        )
        i++
    }
    result.add(newInterval)

    // Add all remaining intervals
    while (i < intervals.size) {
        result.add(intervals[i])
        i++
    }

    return result.toTypedArray()
}
*/
