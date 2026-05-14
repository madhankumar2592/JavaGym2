package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is `parallelStream` used for?
 *
 * Explanation:
 * - It's a method that returns a parallel stream, which processes elements concurrently using multiple threads.
 * - It can improve performance for large datasets or computationally expensive operations.
 * - However, it can also introduce overhead and potential concurrency issues.
 */

public class Day27StreamParallel {

    /**
     * Problem Description:
     * Given a list of integers, calculate the sum of their squares using a parallel stream.
     *
     * Example:
     * Input: [1, 2, 3, 4, 5]
     * Output: 55
     */

    public static int sumOfSquares(List<Integer> list) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        int result = sumOfSquares(input);

        System.out.println("Sum of Squares: " + result);

        // Expected Output:
        // Sum of Squares: 55
    }
}

/*
// Solution Implementation

public static int sumOfSquares(List<Integer> list) {
    return list.parallelStream()
            .mapToInt(n -> n * n)
            .sum();
}
*/
