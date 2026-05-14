package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is `flatMap` used for in Java Streams?
 *
 * Explanation:
 * - It's an intermediate operation that transforms each element into a stream of objects, then flattens the streams into a single stream.
 * - It's useful for working with nested collections or when you want to transform one element into multiple elements.
 */

public class Day20StreamFlatMap {

    /**
     * Problem Description:
     * Given a list of lists of integers, flatten it into a single list of integers.
     *
     * Example:
     * Input: [[1, 2], [3, 4], [5]]
     * Output: [1, 2, 3, 4, 5]
     */

    public static List<Integer> flattenList(List<List<Integer>> listOfLists) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5)
        );
        List<Integer> result = flattenList(input);

        System.out.println("Flattened List: " + result);

        // Expected Output:
        // Flattened List: [1, 2, 3, 4, 5]
    }
}

/*
// Solution Implementation

public static List<Integer> flattenList(List<List<Integer>> listOfLists) {
    return listOfLists.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());
}
*/
