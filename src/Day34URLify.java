package com.interview.daily;

/**
 * Interview Question:
 * What is the difference between `String`, `StringBuilder`, and `StringBuffer`?
 *
 * Explanation:
 * - `String`: Immutable.
 * - `StringBuilder`: Mutable, not thread-safe.
 * - `StringBuffer`: Mutable, thread-safe (synchronized).
 */

public class Day34URLify {

    /**
     * Problem Description:
     * Write a method to replace all spaces in a string with '%20'.
     * You may assume that the string has sufficient space at the end to hold the additional characters,
     * and that you are given the "true" length of the string.
     * (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
     *
     * Example:
     * Input: "Mr John Smith    ", 13
     * Output: "Mr%20John%20Smith"
     */

    public static void replaceSpaces(char[] str, int trueLength) {
        // TODO: Implement this method
    }

    public static void main(String[] args) {
        String input = "Mr John Smith    ";
        char[] str = input.toCharArray();
        int trueLength = 13;
        replaceSpaces(str, trueLength);

        System.out.println("URLified: " + new String(str).trim());

        // Expected Output:
        // URLified: Mr%20John%20Smith
    }
}

/*
// Solution Implementation

public static void replaceSpaces(char[] str, int trueLength) {
    int spaceCount = 0;
    for (int i = 0; i < trueLength; i++) {
        if (str[i] == ' ') {
            spaceCount++;
        }
    }

    int index = trueLength + spaceCount * 2;
    if (trueLength < str.length) str[trueLength] = '\0'; // End array

    for (int i = trueLength - 1; i >= 0; i--) {
        if (str[i] == ' ') {
            str[index - 1] = '0';
            str[index - 2] = '2';
            str[index - 3] = '%';
            index -= 3;
        } else {
            str[index - 1] = str[i];
            index--;
        }
    }
}
*/
