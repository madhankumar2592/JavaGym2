package com.interview.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Interview Question:
 * What is the Insert Interval problem?
 *
 * Explanation:
 * - The Insert Interval problem is a variation of the Merge Intervals problem where you are given a set of non-overlapping intervals sorted by their start times.
 * - The goal is to insert a new interval into this set and merge if necessary.
 */

public class Day75InsertInterval {

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

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        // TODO: Implement this method
        return new int[0][0];
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] result = insert(intervals, newInterval);

        System.out.print("Inserted and Merged Intervals: ");
        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval) + " ");
        }
        System.out.println();

        // Expected Output:
        // Inserted and Merged Intervals: [1, 5] [6, 9]
    }
}

/*
// Solution Implementation

public static int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> result = new ArrayList<>();
    int i = 0;

    // Add all intervals that come before the new interval
    while (i < intervals.length && intervals[i][1] < newInterval[0]) {
        result.add(intervals[i]);
        i++;
    }

    // Merge all overlapping intervals
    while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
        newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
        newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
        i++;
    }
    result.add(newInterval);

    // Add all remaining intervals
    while (i < intervals.length) {
        result.add(intervals[i]);
        i++;
    }

    return result.toArray(new int[result.size()][]);
}
*/
