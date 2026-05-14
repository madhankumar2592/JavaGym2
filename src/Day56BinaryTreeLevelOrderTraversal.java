package com.interview.daily;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Interview Question:
 * What is a level-order traversal?
 *
 * Explanation:
 * - Level-order traversal visits nodes level by level, from left to right.
 * - It's also known as Breadth-First Search (BFS).
 */



public class Day56BinaryTreeLevelOrderTraversal {

    /**
     * Problem Description:
     * Given the root of a binary tree, return the level order traversal of its nodes' values.
     * (i.e., from left to right, level by level).
     *
     * Example:
     * Input: [3, 9, 20, null, null, 15, 7]
     * Output: [[3], [9, 20], [15, 7]]
     */

    public static List<List<Integer>> levelOrder(TreeNode root) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = levelOrder(root);

        System.out.println("Level Order Traversal: " + result);

        // Expected Output:
        // Level Order Traversal: [[3], [9, 20], [15, 7]]
    }
}

/*
// Solution Implementation

public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
        return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        List<Integer> currentLevel = new ArrayList<>();

        for (int i = 0; i < levelSize; i++) {
            TreeNode currentNode = queue.poll();
            currentLevel.add(currentNode.val);

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
        result.add(currentLevel);
    }
    return result;
}
*/
