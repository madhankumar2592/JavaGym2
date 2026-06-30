/**
 * Interview Question:
 * What is the difference between a binary tree and a binary search tree?
 *
 * Explanation:
 * - A binary tree is a tree where each node has at most two children.
 * - A binary search tree is a binary tree with the additional property that the left subtree of a node contains only nodes with values less than the node's value, and the right subtree contains only nodes with values greater than the node's value.
 */

package com.interview.daily

class TreeNode(val `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/**
 * Problem Description:
 * Given the root of a binary tree, invert the tree, and return its root.
 *
 * Example:
 * Input: [4, 2, 7, 1, 3, 6, 9]
 * Output: [4, 7, 2, 9, 6, 3, 1]
 */
fun invertTree(root: TreeNode?): TreeNode? {
    TODO("Implement this method")
}

fun main() {
    val root = TreeNode(4).apply {
        left = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }
        right = TreeNode(7).apply {
            left = TreeNode(6)
            right = TreeNode(9)
        }
    }

    val invertedRoot = invertTree(root)

    // You can add a print function to verify the inverted tree structure
    println("Root: " + invertedRoot?.`val`)
    println("Left: " + invertedRoot?.left?.`val`)
    println("Right: " + invertedRoot?.right?.`val`)

    // Expected Output:
    // Root: 4
    // Left: 7
    // Right: 2
}

/*
// Solution Implementation

fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) {
        return null
    }

    val temp = root.left
    root.left = invertTree(root.right)
    root.right = invertTree(temp)

    return root
}
*/
