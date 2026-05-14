package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is the difference between `sorted()` and `sorted(Comparator)` in Java Streams?
 *
 * Explanation:
 * - `sorted()`: Sorts elements based on their natural order (requires the class to implement `Comparable`).
 * - `sorted(Comparator)`: Sorts elements using a custom `Comparator`.
 */

public class Day14StreamSorted {

    /**
     * Problem Description:
     * Given a list of strings, sort them in alphabetical order using Java Streams.
     *
     * Example:
     * Input: ["banana", "apple", "cherry"]
     * Output: ["apple", "banana", "cherry"]
     */

    public static List<String> sortStrings(List<String> list) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("banana", "apple", "cherry");
        List<String> result = sortStrings(input);

        System.out.println("Sorted List: " + result);

        // Expected Output:
        // Sorted List: [apple, banana, cherry]
    }
}

/*
// Solution Implementation

public static List<String> sortStrings(List<String> list) {
    return list.stream()
            .sorted()
            .collect(Collectors.toList());
}
*/
