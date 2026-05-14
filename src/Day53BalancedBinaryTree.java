package com.interview.daily;

/**
 * Interview Question:
 * What is a balanced binary tree?
 *
 * Explanation:
 * - A balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than 1.
 * - This ensures that the height of the tree is O(log N), which is important for efficient search and insertion.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Day53BalancedBinaryTree {

    /**
     * Problem Description:
     * Given a binary tree, determine if it is height-balanced.
     *
     * Example:
     * Input: [3, 9, 20, null, null, 15, 7]
     * Output: true
     */

    public static boolean isBalanced(TreeNode root) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        boolean result = isBalanced(root);

        System.out.println("Is Balanced: " + result);

        // Expected Output:
        // Is Balanced: true
    }
}

/*
// Solution Implementation

public static boolean isBalanced(TreeNode root) {
    return checkHeight(root) != -1;
}

private static int checkHeight(TreeNode root) {
    if (root == null) {
        return 0;
    }

    int leftHeight = checkHeight(root.left);
    if (leftHeight == -1) return -1;

    int rightHeight = checkHeight(root.right);
    if (rightHeight == -1) return -1;

    if (Math.abs(leftHeight - rightHeight) > 1) {
        return -1;
    }

    return Math.max(leftHeight, rightHeight) + 1;
}
*/
