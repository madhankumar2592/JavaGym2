package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is `Collectors.groupingBy` used for?
 *
 * Explanation:
 * - It's a terminal operation used to group elements of a stream into a `Map`.
 * - The keys of the map are determined by a classifier function, and the values are lists of elements that map to that key.
 */

public class Day15StreamGroupingBy {

    /**
     * Problem Description:
     * Given a list of strings, group them by their length.
     *
     * Example:
     * Input: ["apple", "banana", "cherry", "date"]
     * Output: {4=[date], 5=[apple], 6=[banana, cherry]}
     */

    public static Map<Integer, List<String>> groupStringsByLength(List<String> list) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "date");
        Map<Integer, List<String>> result = groupStringsByLength(input);

        System.out.println("Grouped by Length: " + result);

        // Expected Output:
        // Grouped by Length: {4=[date], 5=[apple], 6=[banana, cherry]}
    }
}

/*
// Solution Implementation

public static Map<Integer, List<String>> groupStringsByLength(List<String> list) {
    return list.stream()
            .collect(Collectors.groupingBy(String::length));
}
*/
