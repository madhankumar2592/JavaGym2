package com.interview.daily;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Interview Question:
 * What is the Meeting Rooms II problem?
 *
 * Explanation:
 * - The Meeting Rooms II problem is a classic interval problem where you are given an array of meeting time intervals.
 * - The goal is to find the minimum number of conference rooms required.
 * - This is equivalent to finding the maximum number of overlapping intervals at any point in time.
 */

public class Day77MeetingRoomsII {

    /**
     * Problem Description:
     * Given an array of meeting time intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.
     *
     * Example:
     * Input: intervals = [[0,30],[5,10],[15,20]]
     * Output: 2
     * Explanation: We need two rooms. Room 1: [0,30], Room 2: [5,10], [15,20].
     */

    public static int minMeetingRooms(int[][] intervals) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        int result = minMeetingRooms(intervals);

        System.out.println("Min Meeting Rooms: " + result);

        // Expected Output:
        // Min Meeting Rooms: 2
    }
}

/*
// Solution Implementation

public static int minMeetingRooms(int[][] intervals) {
    if (intervals == null || intervals.length == 0) {
        return 0;
    }

    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    PriorityQueue<Integer> allocator = new PriorityQueue<>();
    allocator.add(intervals[0][1]);

    for (int i = 1; i < intervals.length; i++) {
        if (intervals[i][0] >= allocator.peek()) {
            allocator.poll();
        }
        allocator.add(intervals[i][1]);
    }

    return allocator.size();
}
*/
