package com.interview.daily;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * What is `Collectors.counting` used for?
 *
 * Explanation:
 * - It's a downstream collector used to count the number of elements in each group.
 * - It's often used with `groupingBy` to get the frequency of elements.
 */

public class Day16StreamCounting {

    /**
     * Problem Description:
     * Given a list of strings, count the frequency of each string.
     *
     * Example:
     * Input: ["apple", "banana", "apple", "cherry", "banana", "apple"]
     * Output: {apple=3, banana=2, cherry=1}
     */

    public static Map<String, Long> countWordFrequency(List<String> list) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Long> result = countWordFrequency(input);

        System.out.println("Word Frequency: " + result);

        // Expected Output:
        // Word Frequency: {apple=3, banana=2, cherry=1}
    }
}

/*
// Solution Implementation

public static Map<String, Long> countWordFrequency(List<String> list) {
    return list.stream()
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
}
*/
