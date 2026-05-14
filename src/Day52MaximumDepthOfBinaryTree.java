package com.interview.daily;

/**
 * Interview Question:
 * What is the depth of a binary tree?
 *
 * Explanation:
 * - The depth of a binary tree is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * - A leaf node is a node with no children.
 */



public class Day52MaximumDepthOfBinaryTree {

    /**
     * Problem Description:
     * Given the root of a binary tree, return its maximum depth.
     *
     * Example:
     * Input: [3, 9, 20, null, null, 15, 7]
     * Output: 3
     */

    public static int maxDepth(TreeNode root) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = maxDepth(root);

        System.out.println("Max Depth: " + result);

        // Expected Output:
        // Max Depth: 3
    }
}

/*
// Solution Implementation

public static int maxDepth(TreeNode root) {
    if (root == null) {
        return 0;
    }
    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);
    return Math.max(leftDepth, rightDepth) + 1;
}
*/
