package com.interview.daily;

import java.util.Stack;

/**
 * Interview Question:
 * How do you find the Kth smallest element in a BST?
 *
 * Explanation:
 * - Perform an inorder traversal of the BST.
 * - The inorder traversal of a BST yields elements in sorted order.
 * - The Kth element in the inorder traversal is the Kth smallest element.
 */



public class Day59KthSmallestElementInBST {

    /**
     * Problem Description:
     * Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
     *
     * Example:
     * Input: root = [3,1,4,null,2], k = 1
     * Output: 1
     */

    public static int kthSmallest(TreeNode root, int k) {
        // TODO: Implement this method
        return -1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        int result = kthSmallest(root, 1);

        System.out.println("Kth Smallest: " + result);

        // Expected Output:
        // Kth Smallest: 1
    }
}

/*
// Solution Implementation

public static int kthSmallest(TreeNode root, int k) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;

    while (current != null || !stack.isEmpty()) {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        k--;
        if (k == 0) {
            return current.val;
        }
        current = current.right;
    }
    return -1;
}
*/
