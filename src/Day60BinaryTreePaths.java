package com.interview.daily;

import java.util.ArrayList;
import java.util.List;

/**
 * Interview Question:
 * What is a path in a binary tree?
 *
 * Explanation:
 * - A path is a sequence of nodes from the root to a leaf node.
 * - A leaf node is a node with no children.
 */



public class Day60BinaryTreePaths {

    /**
     * Problem Description:
     * Given the root of a binary tree, return all root-to-leaf paths in any order.
     *
     * Example:
     * Input: [1, 2, 3, null, 5]
     * Output: ["1->2->5", "1->3"]
     */

    public static List<String> binaryTreePaths(TreeNode root) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> result = binaryTreePaths(root);

        System.out.println("Paths: " + result);

        // Expected Output:
        // Paths: [1->2->5, 1->3]
    }
}

/*
// Solution Implementation

public static List<String> binaryTreePaths(TreeNode root) {
    List<String> paths = new ArrayList<>();
    if (root != null) {
        constructPaths(root, "", paths);
    }
    return paths;
}

private static void constructPaths(TreeNode root, String path, List<String> paths) {
    if (root != null) {
        path += Integer.toString(root.val);
        if (root.left == null && root.right == null) {
            paths.add(path);
        } else {
            path += "->";
            constructPaths(root.left, path, paths);
            constructPaths(root.right, path, paths);
        }
    }
}
*/
