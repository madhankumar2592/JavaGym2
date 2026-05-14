package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is the difference between `map` and `flatMap` in Java Streams?
 *
 * Explanation:
 * - `map`: Transforms each element into another object. One-to-one mapping.
 * - `flatMap`: Transforms each element into a stream of objects, then flattens the streams into a single stream. One-to-many mapping.
 */

public class Day11StreamMap {

    /**
     * Problem Description:
     * Given a list of strings, convert each string to uppercase using Java Streams.
     *
     * Example:
     * Input: ["hello", "world"]
     * Output: ["HELLO", "WORLD"]
     */

    public static List<String> toUpperCase(List<String> list) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("hello", "world");
        List<String> result = toUpperCase(input);

        System.out.println("Uppercase List: " + result);

        // Expected Output:
        // Uppercase List: [HELLO, WORLD]
    }
}

/*
// Solution Implementation

public static List<String> toUpperCase(List<String> list) {
    return list.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
}
*/
