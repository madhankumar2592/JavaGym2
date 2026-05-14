package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is the difference between `filter` and `map` in Java Streams?
 *
 * Explanation:
 * - `filter`: Selects elements based on a predicate (boolean condition).
 * - `map`: Transforms elements into another object.
 */

public class Day12StreamFilter {

    /**
     * Problem Description:
     * Given a list of integers, filter out the even numbers and return a list of odd numbers.
     *
     * Example:
     * Input: [1, 2, 3, 4, 5]
     * Output: [1, 3, 5]
     */

    public static List<Integer> filterOddNumbers(List<Integer> list) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = filterOddNumbers(input);

        System.out.println("Odd Numbers: " + result);

        // Expected Output:
        // Odd Numbers: [1, 3, 5]
    }
}

/*
// Solution Implementation

public static List<Integer> filterOddNumbers(List<Integer> list) {
    return list.stream()
            .filter(n -> n % 2 != 0)
            .collect(Collectors.toList());
}
*/
