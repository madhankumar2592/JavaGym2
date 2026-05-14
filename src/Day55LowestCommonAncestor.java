package com.interview.daily;

/**
 * Interview Question:
 * What is the Lowest Common Ancestor (LCA) of two nodes in a binary tree?
 *
 * Explanation:
 * - The LCA of two nodes `p` and `q` is the lowest node in the tree that has both `p` and `q` as descendants.
 * - A node can be a descendant of itself.
 */



public class Day55LowestCommonAncestor {

    /**
     * Problem Description:
     * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
     *
     * Example:
     * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
     * Output: 6
     */

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode p = root.left;
        TreeNode q = root.right;

        TreeNode result = lowestCommonAncestor(root, p, q);

        System.out.println("LCA: " + result.val);

        // Expected Output:
        // LCA: 6
    }
}

/*
// Solution Implementation

public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root.val > p.val && root.val > q.val) {
        return lowestCommonAncestor(root.left, p, q);
    } else if (root.val < p.val && root.val < q.val) {
        return lowestCommonAncestor(root.right, p, q);
    } else {
        return root;
    }
}
*/
