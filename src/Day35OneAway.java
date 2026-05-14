package com.interview.daily;

/**
 * Interview Question:
 * What is the difference between `String` and `StringBuilder`?
 *
 * Explanation:
 * - `String`: Immutable.
 * - `StringBuilder`: Mutable, not thread-safe.
 */

public class Day35OneAway {

    /**
     * Problem Description:
     * There are three types of edits that can be performed on strings: insert a character,
     * remove a character, or replace a character. Given two strings, write a function to check if they are
     * one edit (or zero edits) away.
     *
     * Example:
     * Input: "pale", "ple"
     * Output: true
     */

    public static boolean oneEditAway(String first, String second) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        String first = "pale";
        String second = "ple";
        boolean result = oneEditAway(first, second);

        System.out.println("One Edit Away: " + result);

        // Expected Output:
        // One Edit Away: true
    }
}

/*
// Solution Implementation

public static boolean oneEditAway(String first, String second) {
    if (Math.abs(first.length() - second.length()) > 1) {
        return false;
    }

    String s1 = first.length() < second.length() ? first : second;
    String s2 = first.length() < second.length() ? second : first;

    int index1 = 0;
    int index2 = 0;
    boolean foundDifference = false;

    while (index2 < s2.length() && index1 < s1.length()) {
        if (s1.charAt(index1) != s2.charAt(index2)) {
            if (foundDifference) return false;
            foundDifference = true;

            if (s1.length() == s2.length()) {
                index1++;
            }
        } else {
            index1++;
        }
        index2++;
    }
    return true;
}
*/
