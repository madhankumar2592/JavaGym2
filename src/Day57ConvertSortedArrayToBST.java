package com.interview.daily;

/**
 * Interview Question:
 * How do you create a balanced BST from a sorted array?
 *
 * Explanation:
 * - The middle element of the array becomes the root of the tree.
 * - The left half of the array forms the left subtree.
 * - The right half of the array forms the right subtree.
 * - This process is repeated recursively.
 */



public class Day57ConvertSortedArrayToBST {

    /**
     * Problem Description:
     * Given an integer array `nums` where the elements are sorted in ascending order,
     * convert it to a height-balanced binary search tree.
     *
     * Example:
     * Input: [-10, -3, 0, 5, 9]
     * Output: [0, -3, 9, -10, null, 5]
     */

    public static TreeNode sortedArrayToBST(int[] nums) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = sortedArrayToBST(nums);

        // You can add a print function to verify the tree structure
        System.out.println("Root: " + root.val);
        System.out.println("Left: " + root.left.val);
        System.out.println("Right: " + root.right.val);

        // Expected Output:
        // Root: 0
        // Left: -3
        // Right: 9
    }
}

/*
// Solution Implementation

public static TreeNode sortedArrayToBST(int[] nums) {
    if (nums == null || nums.length == 0) {
        return null;
    }
    return sortedArrayToBST(nums, 0, nums.length - 1);
}

private static TreeNode sortedArrayToBST(int[] nums, int left, int right) {
    if (left > right) {
        return null;
    }

    int mid = left + (right - left) / 2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = sortedArrayToBST(nums, left, mid - 1);
    node.right = sortedArrayToBST(nums, mid + 1, right);

    return node;
}
*/
