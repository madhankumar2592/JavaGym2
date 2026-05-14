package com.interview.daily;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Interview Question:
 * What is the difference between `HashMap` and `LinkedHashMap`?
 *
 * Explanation:
 * - `HashMap`: Does not maintain insertion order.
 * - `LinkedHashMap`: Maintains insertion order.
 * - `LinkedHashMap` is useful when you need to iterate over keys in the order they were inserted.
 */

public class Day10FirstNonRepeatingChar {

    /**
     * Problem Description:
     * Find the first non-repeating character in a string.
     *
     * Example:
     * Input: "leetcode"
     * Output: 'l'
     */

    public static char firstUniqChar(String s) {
        // TODO: Implement this method
        return ' ';
    }

    public static void main(String[] args) {
        String input = "leetcode";
        char result = firstUniqChar(input);

        System.out.println("First Non-Repeating Char: " + result);

        // Expected Output:
        // First Non-Repeating Char: l
    }
}

/*
// Solution Implementation

public static char firstUniqChar(String s) {
    Map<Character, Integer> countMap = new LinkedHashMap<>();
    for (char c : s.toCharArray()) {
        countMap.put(c, countMap.getOrDefault(c, 0) + 1);
    }

    for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
        if (entry.getValue() == 1) {
            return entry.getKey();
        }
    }
    return ' '; // Or throw an exception if no unique char found
}
*/
