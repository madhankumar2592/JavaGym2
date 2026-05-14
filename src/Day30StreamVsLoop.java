package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * When should you use streams vs. loops?
 *
 * Explanation:
 * - Use streams for declarative, functional-style programming. They are concise and expressive.
 * - Use loops for imperative programming, when you need more control over the iteration process.
 * - Streams can be slower for small datasets due to overhead, but can be faster for large datasets with parallel processing.
 */

public class Day30StreamVsLoop {

    /**
     * Problem Description:
     * Given a list of integers, filter out the even numbers and square the odd numbers.
     *
     * Example:
     * Input: [1, 2, 3, 4, 5]
     * Output: [1, 9, 25]
     */

    public static List<Integer> filterAndSquare(List<Integer> list) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = filterAndSquare(input);

        System.out.println("Filtered and Squared: " + result);

        // Expected Output:
        // Filtered and Squared: [1, 9, 25]
    }
}

/*
// Solution Implementation

public static List<Integer> filterAndSquare(List<Integer> list) {
    return list.stream()
            .filter(n -> n % 2 != 0)
            .map(n -> n * n)
            .collect(Collectors.toList());
}
*/
