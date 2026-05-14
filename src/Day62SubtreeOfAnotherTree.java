package com.interview.daily;

/**
 * Interview Question:
 * How do you check if one tree is a subtree of another?
 *
 * Explanation:
 * - A tree T is a subtree of a tree S if there exists a node n in S such that the subtree of n is identical to T.
 * - That is, if you cut off the tree at node n, the two trees would be identical.
 */



public class Day62SubtreeOfAnotherTree {

    /**
     * Problem Description:
     * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
     *
     * Example:
     * Input: root = [3,4,5,1,2], subRoot = [4,1,2]
     * Output: true
     */

    public static boolean isSubtree(com.interview.daily.TreeNode root, com.interview.daily.TreeNode subRoot) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        boolean result = isSubtree(root, subRoot);

        System.out.println("Is Subtree: " + result);

        // Expected Output:
        // Is Subtree: true
    }
}

/*
// Solution Implementation

public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (root == null) {
        return false;
    }
    if (isSameTree(root, subRoot)) {
        return true;
    }
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
}

private static boolean isSameTree(TreeNode s, TreeNode t) {
    if (s == null && t == null) {
        return true;
    }
    if (s == null || t == null) {
        return false;
    }
    if (s.val != t.val) {
        return false;
    }
    return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
}
*/
