package com.interview.daily;

/**
 * Interview Question:
 * What is Kadane's Algorithm?
 *
 * Explanation:
 * - Kadane's Algorithm is an efficient algorithm to find the maximum sum contiguous subarray within a one-dimensional array of numbers.
 * - It works by iterating through the array and keeping track of the maximum sum ending at each position.
 */

public class Day70MaximumSubarray {

    /**
     * Problem Description:
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     *
     * Example:
     * Input: [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     */

    public static int maxSubArray(int[] nums) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);

        System.out.println("Max Subarray Sum: " + result);

        // Expected Output:
        // Max Subarray Sum: 6
    }
}

/*
// Solution Implementation

public static int maxSubArray(int[] nums) {
    int maxSoFar = nums[0];
    int maxEndingHere = nums[0];

    for (int i = 1; i < nums.length; i++) {
        maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
        maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }

    return maxSoFar;
}
*/
