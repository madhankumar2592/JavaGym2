package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Interview Question:
 * What is `reduce` used for in Java Streams?
 *
 * Explanation:
 * - It's a terminal operation that combines elements of a stream into a single result.
 * - It takes an identity value and an accumulator function.
 * - It's useful for summing numbers, concatenating strings, or finding the max/min element.
 */

public class Day21StreamReduce {

    /**
     * Problem Description:
     * Given a list of integers, calculate the sum of all numbers using `reduce`.
     *
     * Example:
     * Input: [1, 2, 3, 4, 5]
     * Output: 15
     */

    public static int sumNumbers(List<Integer> list) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        int result = sumNumbers(input);

        System.out.println("Sum: " + result);

        // Expected Output:
        // Sum: 15
    }
}

/*
// Solution Implementation

public static int sumNumbers(List<Integer> list) {
    return list.stream()
            .reduce(0, Integer::sum);
}
*/
