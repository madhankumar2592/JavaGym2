package com.interview.daily;

/**
 * Interview Question:
 * What is the diameter of a binary tree?
 *
 * Explanation:
 * - The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * - This path may or may not pass through the root.
 */



public class Day61DiameterOfBinaryTree {

    /**
     * Problem Description:
     * Given the root of a binary tree, return the length of the diameter of the tree.
     *
     * Example:
     * Input: [1, 2, 3, 4, 5]
     * Output: 3
     */

    public static int diameterOfBinaryTree(TreeNode root) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int result = diameterOfBinaryTree(root);

        System.out.println("Diameter: " + result);

        // Expected Output:
        // Diameter: 3
    }
}

/*
// Solution Implementation

public static int diameterOfBinaryTree(TreeNode root) {
    int[] maxDiameter = new int[1];
    calculateHeight(root, maxDiameter);
    return maxDiameter[0];
}

private static int calculateHeight(TreeNode node, int[] maxDiameter) {
    if (node == null) {
        return 0;
    }

    int leftHeight = calculateHeight(node.left, maxDiameter);
    int rightHeight = calculateHeight(node.right, maxDiameter);

    maxDiameter[0] = Math.max(maxDiameter[0], leftHeight + rightHeight);

    return Math.max(leftHeight, rightHeight) + 1;
}
*/
