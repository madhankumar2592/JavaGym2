package com.interview.daily

import java.util.PriorityQueue

/**
 * Interview Question:
 * What is the Meeting Rooms II problem?
 *
 * Explanation:
 * - The Meeting Rooms II problem is a classic interval problem where you are given an array of meeting time intervals.
 * - The goal is to find the minimum number of conference rooms required.
 * - This is equivalent to finding the maximum number of overlapping intervals at any point in time.
 */

/**
 * Problem Description:
 * Given an array of meeting time intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.
 *
 * Example:
 * Input: intervals = [[0,30],[5,10],[15,20]]
 * Output: 2
 * Explanation: We need two rooms. Room 1: [0,30], Room 2: [5,10], [15,20].
 */
fun minMeetingRooms(intervals: Array<IntArray>): Int {
    // TODO: Implement this method
    return 0
}

fun main() {
    val intervals = arrayOf(intArrayOf(0, 30), intArrayOf(5, 10), intArrayOf(15, 20))
    val result = minMeetingRooms(intervals)

    println("Min Meeting Rooms: $result")

    // Expected Output:
    // Min Meeting Rooms: 2
}

/*
// Solution Implementation

fun minMeetingRooms(intervals: Array<IntArray>): Int {
    if (intervals.isEmpty()) {
        return 0
    }

    intervals.sortWith { a, b -> a[0] - b[0] }

    val allocator = PriorityQueue<Int>()
    allocator.add(intervals[0][1])

    for (i in 1 until intervals.size) {
        if (intervals[i][0] >= allocator.peek()!!) {
            allocator.poll()
        }
        allocator.add(intervals[i][1])
    }

    return allocator.size
}
*/
