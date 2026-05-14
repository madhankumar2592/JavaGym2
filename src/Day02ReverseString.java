package com.interview.daily;

/**
 * Interview Question:
 * Explain the concept of "Pass by Value" in Java.
 *
 * Explanation:
 * Java is strictly "Pass by Value".
 * - For primitives, the actual value is passed.
 * - For objects, the value of the reference (memory address) is passed.
 *   Reassigning the reference inside a method does not affect the original reference,
 *   but modifying the object's state (e.g., array elements, fields) does.
 */

public class Day02ReverseString {

    /**
     * Problem Description:
     * Reverse a given string without using StringBuilder.reverse() or similar built-in methods.
     *
     * Example:
     * Input: "backend"
     * Output: "dnekcab"
     */

    public static String reverseString(String input) {
        // TODO: Implement this method
        //two pointer and left right / swap
        int left = 0;
        int right = input.length()-1;
        char[] inputString  = input.toCharArray();

        while (left<right){

            char temp = inputString[left];
            inputString[left] = inputString[right];
            inputString[right] = temp;

            left++;
            right--;


        }


        return new String(inputString);
    }

    public static void main(String[] args) {
        String input = "backend";
        String result = reverseString(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);

        // Expected Output:
        // Input: backend
        // Output: dnekcab
    }
}

/*
// Solution Implementation

public static String reverseString(String input) {
    if (input == null) return null;
    char[] chars = input.toCharArray();
    int left = 0;
    int right = chars.length - 1;

    while (left < right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
    }
    return new String(chars);
}
*/
