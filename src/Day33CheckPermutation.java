package com.interview.daily;

import java.util.Arrays;

/**
 * Interview Question:
 * What is the difference between `==` and `equals()`?
 *
 * Explanation:
 * - `==`: Compares object references (memory addresses).
 * - `equals()`: Compares object values.
 * - For primitive types, `==` compares values.
 * - For strings, `==` compares references, while `equals()` compares content.
 */

public class Day33CheckPermutation {

    /**
     * Problem Description:
     * Given two strings, write a method to decide if one is a permutation of the other.
     *
     * Example:
     * Input: "abc", "bca"
     * Output: true
     */

    public static boolean isPermutation(String s1, String s2) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        boolean result = isPermutation(s1, s2);

        System.out.println("Is Permutation: " + result);

        // Expected Output:
        // Is Permutation: true
    }
}

/*
// Solution Implementation

public static boolean isPermutation(String s1, String s2) {
    if (s1.length() != s2.length()) {
        return false;
    }
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    return Arrays.equals(c1, c2);
}
*/
