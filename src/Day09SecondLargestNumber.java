package com.interview.daily;

/**
 * Interview Question:
 * What is the difference between `final`, `finally`, and `finalize`?
 *
 * Explanation:
 * - `final`: A keyword used to declare constants, prevent method overriding, and prevent class inheritance.
 * - `finally`: A block in a `try-catch` statement that is always executed, regardless of whether an exception is thrown.
 * - `finalize`: A method called by the garbage collector before an object is reclaimed. Its use is discouraged.
 */

public class Day09SecondLargestNumber {

    /**
     * Problem Description:
     * Find the second largest number in an integer array.
     *
     * Example:
     * Input: [1, 2, 3, 4, 5]
     * Output: 4
     */

    public static int findSecondLargest(int[] nums) {
        // TODO: Implement this method
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        int result = findSecondLargest(input);

        System.out.println("Second Largest: " + result);

        // Expected Output:
        // Second Largest: 4
    }
}

/*
// Solution Implementation

public static int findSecondLargest(int[] nums) {
    if (nums == null || nums.length < 2) {
        throw new IllegalArgumentException("Input array must have at least two elements.");
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : nums) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
    }

    return secondLargest;
}
*/
