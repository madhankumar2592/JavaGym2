package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is `Collectors.toMap` used for?
 *
 * Explanation:
 * - It's a terminal operation that collects elements into a `Map`.
 * - You specify a key mapper and a value mapper.
 * - You can also provide a merge function to handle duplicate keys.
 */

public class Day18StreamToMap {

    /**
     * Problem Description:
     * Given a list of strings, convert it into a map where the key is the string and the value is its length.
     * Assume all strings are unique.
     *
     * Example:
     * Input: ["apple", "banana", "cherry"]
     * Output: {apple=5, banana=6, cherry=6}
     */

    public static Map<String, Integer> convertToMap(List<String> list) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "cherry");
        Map<String, Integer> result = convertToMap(input);

        System.out.println("Map: " + result);

        // Expected Output:
        // Map: {apple=5, banana=6, cherry=6}
    }
}

/*
// Solution Implementation

public static Map<String, Integer> convertToMap(List<String> list) {
    return list.stream()
            .collect(Collectors.toMap(s -> s, String::length));
}
*/
