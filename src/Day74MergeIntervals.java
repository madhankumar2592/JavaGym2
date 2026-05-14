package com.interview.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Interview Question:
 * What is the Merge Intervals problem?
 *
 * Explanation:
 * - The Merge Intervals problem is a classic interval problem where you are given a collection of intervals.
 * - The goal is to merge all overlapping intervals.
 * - For example, [1,3] and [2,6] overlap and should be merged into [1,6].
 */

public class Day74MergeIntervals {

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

    public static int[][] merge(int[][] intervals) {
        // TODO: Implement this method
        return new int[0][0];
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);

        System.out.print("Merged Intervals: ");
        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval) + " ");
        }
        System.out.println();

        // Expected Output:
        // Merged Intervals: [1, 6] [8, 10] [15, 18]
    }
}

/*
// Solution Implementation

public static int[][] merge(int[][] intervals) {
    if (intervals.length <= 1) {
        return intervals;
    }

    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> result = new ArrayList<>();
    int[] currentInterval = intervals[0];
    result.add(currentInterval);

    for (int[] interval : intervals) {
        if (interval[0] <= currentInterval[1]) {
            currentInterval[1] = Math.max(currentInterval[1], interval[1]);
        } else {
            currentInterval = interval;
            result.add(currentInterval);
        }
    }

    return result.toArray(new int[result.size()][]);
}
*/
