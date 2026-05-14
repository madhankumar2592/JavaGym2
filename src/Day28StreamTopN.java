package com.interview.daily;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interview Question:
 * How do you find the top N elements in a list using streams?
 *
 * Explanation:
 * You can use a combination of `sorted`, `limit`, and `collect`.
 * - `sorted(Comparator.reverseOrder())`: Sorts the elements in descending order.
 * - `limit(N)`: Restricts the stream to the first N elements.
 * - `collect(Collectors.toList())`: Collects the top N elements into a list.
 */

public class Day28StreamTopN {

    /**
     * Problem Description:
     * Given a list of integers, find the top 3 numbers.
     *
     * Example:
     * Input: [1, 5, 2, 8, 3, 9, 4]
     * Output: [9, 8, 5]
     */

    public static List<Integer> findTopN(List<Integer> list, int n) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 5, 2, 8, 3, 9, 4);
        List<Integer> result = findTopN(input, 3);

        System.out.println("Top 3: " + result);

        // Expected Output:
        // Top 3: [9, 8, 5]
    }
}

/*
// Solution Implementation

public static List<Integer> findTopN(List<Integer> list, int n) {
    return list.stream()
            .sorted(Comparator.reverseOrder())
            .limit(n)
            .collect(Collectors.toList());
}
*/
