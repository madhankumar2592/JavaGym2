package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is `Collectors.joining` used for?
 *
 * Explanation:
 * - It's a terminal operation that concatenates the elements of a stream into a single string.
 * - You can specify a delimiter, prefix, and suffix.
 */

public class Day17StreamJoining {

    /**
     * Problem Description:
     * Given a list of strings, join them into a single comma-separated string.
     *
     * Example:
     * Input: ["apple", "banana", "cherry"]
     * Output: "apple,banana,cherry"
     */

    public static String joinStrings(List<String> list) {
        // TODO: Implement this method
        return "";
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "cherry");
        String result = joinStrings(input);

        System.out.println("Joined String: " + result);

        // Expected Output:
        // Joined String: apple,banana,cherry
    }
}

/*
// Solution Implementation

public static String joinStrings(List<String> list) {
    return list.stream()
            .collect(Collectors.joining(","));
}
*/
