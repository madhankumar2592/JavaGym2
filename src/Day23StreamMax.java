package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Interview Question:
 * What is `max` used for in Java Streams?
 *
 * Explanation:
 * - It's a terminal operation that returns the maximum element of a stream.
 * - It takes a `Comparator` to determine the order of elements.
 * - It returns an `Optional` because the stream might be empty.
 */

public class Day23StreamMax {

    /**
     * Problem Description:
     * Given a list of integers, find the maximum number using `max`.
     *
     * Example:
     * Input: [1, 2, 3, 4, 5]
     * Output: 5
     */

    public static int findMax(List<Integer> list) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        int result = findMax(input);

        System.out.println("Max: " + result);

        // Expected Output:
        // Max: 5
    }
}

/*
// Solution Implementation

public static int findMax(List<Integer> list) {
    return list.stream()
            .max(Integer::compareTo)
            .orElse(0);
}
*/
