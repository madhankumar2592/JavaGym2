package com.interview.daily;

import java.util.Arrays;

/**
 * Interview Question:
 * What is the difference between Comparable and Comparator?
 *
 * Explanation:
 * - Comparable: Natural ordering (compareTo method). Implemented by the class itself.
 *   Example: String, Integer implement Comparable.
 * - Comparator: Custom ordering (compare method). Implemented by a separate class or lambda.
 *   Example: Collections.sort(list, new CustomComparator());
 */

public class Day05ValidAnagram {

    /**
     * Problem Description:
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     *
     * Example:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     */

    public static boolean isAnagram(String s, String t) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s, t);

        System.out.println("Is Anagram: " + result);

        // Expected Output:
        // Is Anagram: true
    }
}

/*
// Solution Implementation

public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    }
    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }
    for (int i : count) {
        if (i != 0) {
            return false;
        }
    }
    return true;
}
*/
