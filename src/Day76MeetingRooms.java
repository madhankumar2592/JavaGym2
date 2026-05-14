package com.interview.daily;

import java.util.Arrays;

/**
 * Interview Question:
 * What is the Meeting Rooms problem?
 *
 * Explanation:
 * - The Meeting Rooms problem is a classic interval problem where you are given an array of meeting time intervals.
 * - The goal is to determine if a person can attend all meetings.
 * - This is equivalent to checking if there are any overlapping intervals.
 */

public class Day76MeetingRooms {

    /**
     * Problem Description:
     * Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.
     *
     * Example:
     * Input: intervals = [[0,30],[5,10],[15,20]]
     * Output: false
     * Explanation: The person cannot attend all meetings because [0,30] overlaps with [5,10] and [15,20].
     */

    public static boolean canAttendMeetings(int[][] intervals) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean result = canAttendMeetings(intervals);

        System.out.println("Can Attend Meetings: " + result);

        // Expected Output:
        // Can Attend Meetings: false
    }
}

/*
// Solution Implementation

public static boolean canAttendMeetings(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    for (int i = 0; i < intervals.length - 1; i++) {
        if (intervals[i][1] > intervals[i + 1][0]) {
            return false;
        }
    }

    return true;
}
*/
