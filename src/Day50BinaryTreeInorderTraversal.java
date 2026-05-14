

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Interview Question:
 * What is a Binary Tree?
 *
 * Explanation:
 * - A Binary Tree is a tree data structure in which each node has at most two children,
 *   referred to as the left child and the right child.
 * - Inorder traversal: Left -> Root -> Right.
 */



public class Day50BinaryTreeInorderTraversal {

    /**
     * Problem Description:
     * Given the root of a binary tree, return the inorder traversal of its nodes' values.
     *
     * Example:
     * Input: [1, null, 2, 3]
     * Output: [1, 3, 2]
     */

    public static List<Integer> inorderTraversal(TreeNode root) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = inorderTraversal(root);

        System.out.println("Inorder Traversal: " + result);

        // Expected Output:
        // Inorder Traversal: [1, 3, 2]
    }
}

/*
// Solution Implementation

public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;

    while (current != null || !stack.isEmpty()) {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        result.add(current.val);
        current = current.right;
    }
    return result;
}
*/
