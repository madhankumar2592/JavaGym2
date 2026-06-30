package com.interview.daily

/**
 * Interview Question:
 * What is a Binary Search Tree (BST)?
 *
 * Explanation:
 * - A BST is a binary tree where for every node:
 *   - The left subtree contains only nodes with keys less than the node's key.
 *   - The right subtree contains only nodes with keys greater than the node's key.
 *   - Both the left and right subtrees must also be binary search trees.
 */

/**
 * Problem Description:
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Example:
 * Input: [2, 1, 3]
 * Output: true
 */
fun isValidBST(root: TreeNode?): Boolean {
    TODO("Implement this method")
}

fun main() {
    val root = TreeNode(2)
    root.left = TreeNode(1)
    root.right = TreeNode(3)

    val result = isValidBST(root)

    println("Is Valid BST: $result")

    // Expected Output:
    // Is Valid BST: true
}

/*
// Solution Implementation

fun isValidBST(root: TreeNode?): Boolean {
    return isValidBST(root, null, null)
}

private fun isValidBST(node: TreeNode?, min: Int?, max: Int?): Boolean {
    if (node == null) {
        return true
    }

    if ((min != null && node.`val` <= min) || (max != null && node.`val` >= max)) {
        return false
    }

    return isValidBST(node.left, min, node.`val`) && isValidBST(node.right, node.`val`, max)
}
*/
