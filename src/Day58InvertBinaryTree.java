

/**
 * Interview Question:
 * What is the difference between a binary tree and a binary search tree?
 *
 * Explanation:
 * - A binary tree is a tree where each node has at most two children.
 * - A binary search tree is a binary tree with the additional property that the left subtree of a node contains only nodes with values less than the node's value, and the right subtree contains only nodes with values greater than the node's value.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Day58InvertBinaryTree {

    /**
     * Problem Description:
     * Given the root of a binary tree, invert the tree, and return its root.
     *
     * Example:
     * Input: [4, 2, 7, 1, 3, 6, 9]
     * Output: [4, 7, 2, 9, 6, 3, 1]
     */

    public static TreeNode invertTree(TreeNode root) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode invertedRoot = invertTree(root);

        // You can add a print function to verify the inverted tree structure
        System.out.println("Root: " + invertedRoot.val);
        System.out.println("Left: " + invertedRoot.left.val);
        System.out.println("Right: " + invertedRoot.right.val);

        // Expected Output:
        // Root: 4
        // Left: 7
        // Right: 2
    }
}

/*
// Solution Implementation

public static TreeNode invertTree(TreeNode root) {
    if (root == null) {
        return null;
    }

    TreeNode temp = root.left;
    root.left = invertTree(root.right);
    root.right = invertTree(temp);

    return root;
}
*/
