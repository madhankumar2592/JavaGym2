package com.interview.daily

/**
 * Interview Question:
 * What is the Meeting Rooms problem?
 *
 * Explanation:
 * - The Meeting Rooms problem is a classic interval problem where you are given an array of meeting time intervals.
 * - The goal is to determine if a person can attend all meetings.
 * - This is equivalent to checking if there are any overlapping intervals.
 */

/**
 * Problem Description:
 * Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.
 *
 * Example:
 * Input: intervals = [[0,30],[5,10],[15,20]]
 * Output: false
 * Explanation: The person cannot attend all meetings because [0,30] overlaps with [5,10] and [15,20].
 */
fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
    // TODO: Implement this method
    return false
}

fun main() {
    val intervals = arrayOf(intArrayOf(0, 30), intArrayOf(5, 10), intArrayOf(15, 20))
    val result = canAttendMeetings(intervals)

    println("Can Attend Meetings: $result")

    // Expected Output:
    // Can Attend Meetings: false
}

/*
// Solution Implementation

fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
    intervals.sortWith { a, b -> a[0].compareTo(b[0]) }

    return (0 until intervals.size - 1).none { i ->
        intervals[i][1] > intervals[i + 1][0]
    }
}
*/
