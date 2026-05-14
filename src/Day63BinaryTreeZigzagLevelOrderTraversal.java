package com.interview.daily;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Interview Question:
 * What is a zigzag level-order traversal?
 *
 * Explanation:
 * - Zigzag level-order traversal visits nodes level by level, alternating between left-to-right and right-to-left.
 * - It's also known as a spiral traversal.
 */



public class Day63BinaryTreeZigzagLevelOrderTraversal {

    /**
     * Problem Description:
     * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
     * (i.e., from left to right, then right to left for the next level and alternate between).
     *
     * Example:
     * Input: [3, 9, 20, null, null, 15, 7]
     * Output: [[3], [20, 9], [15, 7]]
     */

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = zigzagLevelOrder(root);

        System.out.println("Zigzag Level Order Traversal: " + result);

        // Expected Output:
        // Zigzag Level Order Traversal: [[3], [20, 9], [15, 7]]
    }
}

/*
// Solution Implementation

public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
        return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    boolean leftToRight = true;

    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        LinkedList<Integer> currentLevel = new LinkedList<>();

        for (int i = 0; i < levelSize; i++) {
            TreeNode currentNode = queue.poll();
            if (leftToRight) {
                currentLevel.addLast(currentNode.val);
            } else {
                currentLevel.addFirst(currentNode.val);
            }

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
        result.add(currentLevel);
        leftToRight = !leftToRight;
    }
    return result;
}
*/
