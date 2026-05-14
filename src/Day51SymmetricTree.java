package com.interview.daily;

/**
 * Interview Question:
 * What is a symmetric tree?
 *
 * Explanation:
 * - A symmetric tree is a tree that is a mirror image of itself.
 * - The left subtree is a mirror image of the right subtree.
 */



public class Day51SymmetricTree {

    /**
     * Problem Description:
     * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
     *
     * Example:
     * Input: [1, 2, 2, 3, 4, 4, 3]
     * Output: true
     */

    public static boolean isSymmetric(TreeNode root) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        boolean result = isSymmetric(root);

        System.out.println("Is Symmetric: " + result);

        // Expected Output:
        // Is Symmetric: true
    }
}

/*
// Solution Implementation

public static boolean isSymmetric(TreeNode root) {
    if (root == null) {
        return true;
    }
    return isMirror(root.left, root.right);
}

private static boolean isMirror(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
        return true;
    }
    if (t1 == null || t2 == null) {
        return false;
    }
    return (t1.val == t2.val)
            && isMirror(t1.right, t2.left)
            && isMirror(t1.left, t2.right);
}
*/
