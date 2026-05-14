package com.interview.daily;

/**
 * Interview Question:
 * How do you check if two strings are rotations of each other?
 *
 * Explanation:
 * A string rotation means shifting characters.
 * Example: "abcde" -> "cdeab" is a rotation.
 *
 * A clever way to solve this is to concatenate the first string with itself.
 * If the second string is a rotation, it must be a substring of the concatenated string.
 * (s1 + s1).contains(s2)
 */

public class Day08StringRotation {

    /**
     * Problem Description:
     * Given two strings s1 and s2, write a method to check if s2 is a rotation of s1.
     *
     * Example:
     * Input: s1 = "waterbottle", s2 = "erbottlewat"
     * Output: true
     */

    public static boolean isRotation(String s1, String s2) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean result = isRotation(s1, s2);

        System.out.println("Is Rotation: " + result);

        // Expected Output:
        // Is Rotation: true
    }
}

/*
// Solution Implementation

public static boolean isRotation(String s1, String s2) {
    if (s1 == null || s2 == null) return false;
    if (s1.length() != s2.length()) return false;
    if (s1.length() == 0) return true; // Empty strings are rotations of each other

    String concatenated = s1 + s1;
    return concatenated.contains(s2);
}
*/
