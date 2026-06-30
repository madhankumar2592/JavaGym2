package com.interview.daily

/**
 * Interview Question:
 * What is the depth of a binary tree?
 *
 * Explanation:
 * - The depth of a binary tree is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * - A leaf node is a node with no children.
 */

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/**
 * Problem Description:
 * Given the root of a binary tree, return its maximum depth.
 *
 * Example:
 * Input: [3, 9, 20, null, null, 15, 7]
 * Output: 3
 */
fun maxDepth(root: TreeNode?): Int {
    TODO("Implement this method")
}

fun main() {
    val root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right?.left = TreeNode(15)
    root.right?.right = TreeNode(7)

    val result = maxDepth(root)

    println("Max Depth: $result")

    // Expected Output:
    // Max Depth: 3
}

/*
// Solution Implementation

fun maxDepth(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }
    val leftDepth = maxDepth(root.left)
    val rightDepth = maxDepth(root.right)
    return maxOf(leftDepth, rightDepth) + 1
}
*/
