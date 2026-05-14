package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is `Collectors.partitioningBy` used for?
 *
 * Explanation:
 * - It's a terminal operation that partitions elements into two groups based on a predicate.
 * - The result is a `Map<Boolean, List<T>>` where `true` contains elements that satisfy the predicate, and `false` contains those that don't.
 */

public class Day19StreamPartitioningBy {

    /**
     * Problem Description:
     * Given a list of integers, partition them into even and odd numbers.
     *
     * Example:
     * Input: [1, 2, 3, 4, 5]
     * Output: {false=[1, 3, 5], true=[2, 4]}
     */

    public static Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> list) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        Map<Boolean, List<Integer>> result = partitionEvenOdd(input);

        System.out.println("Partitioned: " + result);

        // Expected Output:
        // Partitioned: {false=[1, 3, 5], true=[2, 4]}
    }
}

/*
// Solution Implementation

public static Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> list) {
    return list.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
}
*/
