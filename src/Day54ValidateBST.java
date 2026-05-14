package com.interview.daily;

/**
 * Interview Question:
 * What is a Binary Search Tree (BST)?
 *
 * Explanation:
 * - A BST is a binary tree where for every node:
 *   - The left subtree contains only nodes with keys less than the node's key.
 *   - The right subtree contains only nodes with keys greater than the node's key.
 *   - Both the left and right subtrees must also be binary search trees.
 */



public class Day54ValidateBST {

    /**
     * Problem Description:
     * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
     *
     * Example:
     * Input: [2, 1, 3]
     * Output: true
     */

    public static boolean isValidBST(TreeNode root) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean result = isValidBST(root);

        System.out.println("Is Valid BST: " + result);

        // Expected Output:
        // Is Valid BST: true
    }
}

/*
// Solution Implementation

public static boolean isValidBST(TreeNode root) {
    return isValidBST(root, null, null);
}

private static boolean isValidBST(TreeNode node, Integer min, Integer max) {
    if (node == null) {
        return true;
    }

    if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
        return false;
    }

    return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
}
*/
