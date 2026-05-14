package com.interview.daily;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is `IntSummaryStatistics` used for?
 *
 * Explanation:
 * - It's a class that collects statistics such as count, sum, min, average, and max.
 * - It's often used with `Collectors.summarizingInt()`.
 */

public class Day26StreamSummarizing {

    /**
     * Problem Description:
     * Given a list of integers, calculate the count, sum, min, average, and max using `IntSummaryStatistics`.
     *
     * Example:
     * Input: [1, 2, 3, 4, 5]
     * Output: IntSummaryStatistics{count=5, sum=15, min=1, average=3.000000, max=5}
     */

    public static IntSummaryStatistics calculateStatistics(List<Integer> list) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = calculateStatistics(input);

        System.out.println("Statistics: " + stats);

        // Expected Output:
        // Statistics: IntSummaryStatistics{count=5, sum=15, min=1, average=3.000000, max=5}
    }
}

/*
// Solution Implementation

public static IntSummaryStatistics calculateStatistics(List<Integer> list) {
    return list.stream()
            .collect(Collectors.summarizingInt(Integer::intValue));
}
*/
