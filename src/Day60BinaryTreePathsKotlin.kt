package com.interview.daily

/**
 * Interview Question:
 * What is a path in a binary tree?
 *
 * Explanation:
 * - A path is a sequence of nodes from the root to a leaf node.
 * - A leaf node is a node with no children.
 */

class TreeNode(val `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

/**
 * Problem Description:
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 *
 * Example:
 * Input: [1, 2, 3, null, 5]
 * Output: ["1->2->5", "1->3"]
 */
fun binaryTreePaths(root: TreeNode?): List<String> {
    TODO("Implement this method")
}

fun main() {
    val root = TreeNode(1).apply {
        left = TreeNode(2).apply {
            right = TreeNode(5)
        }
        right = TreeNode(3)
    }

    val result = binaryTreePaths(root)

    println("Paths: $result")

    // Expected Output:
    // Paths: [1->2->5, 1->3]
}

/*
// Solution Implementation

fun binaryTreePaths(root: TreeNode?): List<String> {
    val paths = mutableListOf<String>()
    if (root != null) {
        constructPaths(root, "", paths)
    }
    return paths
}

private fun constructPaths(root: TreeNode?, path: String, paths: MutableList<String>) {
    if (root != null) {
        val currentPath = path + root.`val`.toString()
        if (root.left == null && root.right == null) {
            paths.add(currentPath)
        } else {
            val nextPath = "$currentPath->"
            constructPaths(root.left, nextPath, paths)
            constructPaths(root.right, nextPath, paths)
        }
    }
}
*/
