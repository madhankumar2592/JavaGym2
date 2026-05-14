package com.interview.daily;

/**
 * Interview Question:
 * What are Java Streams?
 *
 * Explanation:
 * - A sequence of elements from a source that supports aggregate operations.
 * - They are not a data structure; they process data from a source (e.g., Collection, Array).
 * - Operations can be intermediate (e.g., filter, map) or terminal (e.g., forEach, collect).
 * - They allow for functional-style programming and can be parallelized easily.
 */

public class Day07PalindromeCheck {

    /**
     * Problem Description:
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     *
     * Example:
     * Input: "A man, a plan, a canal: Panama"
     * Output: true
     */

    public static boolean isPalindrome(String s) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(input);

        System.out.println("Is Palindrome: " + result);

        // Expected Output:
        // Is Palindrome: true
    }
}

/*
// Solution Implementation

public static boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        char cLeft = s.charAt(left);
        char cRight = s.charAt(right);

        if (!Character.isLetterOrDigit(cLeft)) {
            left++;
        } else if (!Character.isLetterOrDigit(cRight)) {
            right--;
        } else {
            if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight)) {
                return false;
            }
            left++;
            right--;
        }
    }
    return true;
}
*/
