package com.interview.daily;

/**
 * Interview Question:
 * What is the difference between `String` and `char[]`?
 *
 * Explanation:
 * - `String` is immutable, meaning its value cannot be changed after creation.
 * - `char[]` is mutable, meaning its elements can be changed.
 * - `String` is more convenient for string operations, while `char[]` is more efficient for in-place modifications.
 */

public class Day32StringCompression {

    /**
     * Problem Description:
     * Implement a method to perform basic string compression using the counts of repeated characters.
     * For example, the string "aabcccccaaa" would become "a2b1c5a3".
     * If the "compressed" string would not become smaller than the original string, your method should return the original string.
     *
     * Example:
     * Input: "aabcccccaaa"
     * Output: "a2b1c5a3"
     */

    public static String compressString(String s) {
        // TODO: Implement this method
        return "";
    }

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String result = compressString(input);

        System.out.println("Compressed String: " + result);

        // Expected Output:
        // Compressed String: a2b1c5a3
    }
}

/*
// Solution Implementation

public static String compressString(String s) {
    if (s == null || s.isEmpty()) {
        return s;
    }

    StringBuilder compressed = new StringBuilder();
    int count = 1;

    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == s.charAt(i - 1)) {
            count++;
        } else {
            compressed.append(s.charAt(i - 1));
            compressed.append(count);
            count = 1;
        }
    }

    compressed.append(s.charAt(s.length() - 1));
    compressed.append(count);

    return compressed.length() < s.length() ? compressed.toString() : s;
}
*/
