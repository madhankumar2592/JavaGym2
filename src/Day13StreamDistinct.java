package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is the difference between `distinct` and `sorted` in Java Streams?
 *
 * Explanation:
 * - `distinct`: Removes duplicate elements from the stream.
 * - `sorted`: Sorts the elements of the stream.
 */

public class Day13StreamDistinct {

    /**
     * Problem Description:
     * Given a list of integers, remove duplicate numbers using Java Streams.
     *
     * Example:
     * Input: [1, 2, 2, 3, 4, 4, 5]
     * Output: [1, 2, 3, 4, 5]
     */

    public static List<Integer> removeDuplicates(List<Integer> list) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> result = removeDuplicates(input);

        System.out.println("Unique Numbers: " + result);

        // Expected Output:
        // Unique Numbers: [1, 2, 3, 4, 5]
    }
}

/*
// Solution Implementation

public static List<Integer> removeDuplicates(List<Integer> list) {
    return list.stream()
            .distinct()
            .collect(Collectors.toList());
}
*/
