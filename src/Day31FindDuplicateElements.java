package com.interview.daily;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * How do you find duplicate elements in a list using streams?
 *
 * Explanation:
 * You can use a combination of `Collections.frequency` and `filter`.
 * - `filter(i -> Collections.frequency(list, i) > 1)`: Filters elements that appear more than once.
 * - `distinct()`: Removes duplicates from the result.
 */

public class Day31FindDuplicateElements {

    /**
     * Problem Description:
     * Given a list of integers, find the duplicate elements.
     *
     * Example:
     * Input: [1, 2, 3, 2, 4, 5, 4]
     * Output: [2, 4]
     */

    public static Set<Integer> findDuplicates(List<Integer> list) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 2, 4, 5, 4);
        Set<Integer> result = findDuplicates(input);

        System.out.println("Duplicates: " + result);

        // Expected Output:
        // Duplicates: [2, 4]
    }
}

/*
// Solution Implementation

public static Set<Integer> findDuplicates(List<Integer> list) {
    Set<Integer> seen = new HashSet<>();
    return list.stream()
            .filter(n -> !seen.add(n))
            .collect(Collectors.toSet());
}
*/
