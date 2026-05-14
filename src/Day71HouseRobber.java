package com.interview.daily;

/**
 * Interview Question:
 * What is the House Robber problem?
 *
 * Explanation:
 * - The House Robber problem is a classic dynamic programming problem where you are a robber planning to rob houses along a street.
 * - Each house has a certain amount of money.
 * - The constraint is that you cannot rob two adjacent houses.
 * - The goal is to maximize the amount of money you can rob.
 */

public class Day71HouseRobber {

    /**
     * Problem Description:
     * You are a professional robber planning to rob houses along a street.
     * Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
     * Given an integer array `nums` representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
     *
     * Example:
     * Input: nums = [1,2,3,1]
     * Output: 4
     * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3). Total amount you can rob = 1 + 3 = 4.
     */

    public static int rob(int[] nums) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int result = rob(nums);

        System.out.println("Max Robbery Amount: " + result);

        // Expected Output:
        // Max Robbery Amount: 4
    }
}

/*
// Solution Implementation

public static int rob(int[] nums) {
    if (nums == null || nums.length == 0) {
        return 0;
    }
    if (nums.length == 1) {
        return nums[0];
    }

    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);

    for (int i = 2; i < nums.length; i++) {
        dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
    }

    return dp[nums.length - 1];
}
*/
