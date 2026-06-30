package com.interview.daily

/**
 * Interview Question:
 * What is the diameter of a binary tree?
 *
 * Explanation:
 * - The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * - This path may or may not pass through the root.
 */

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/**
 * Problem Description:
 * Given the root of a binary tree, return the length of the diameter of the tree.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: 3
 */
fun diameterOfBinaryTree(root: TreeNode?): Int {
    TODO("Implement this method")
}

fun main() {
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left!!.left = TreeNode(4)
    root.left!!.right = TreeNode(5)

    val result = diameterOfBinaryTree(root)

    println("Diameter: $result")

    // Expected Output:
    // Diameter: 3
}

/*
// Solution Implementation

fun diameterOfBinaryTree(root: TreeNode?): Int {
    val maxDiameter = intArrayOf(0)
    calculateHeight(root, maxDiameter)
    return maxDiameter[0]
}

fun calculateHeight(node: TreeNode?, maxDiameter: IntArray): Int {
    if (node == null) {
        return 0
    }

    val leftHeight = calculateHeight(node.left, maxDiameter)
    val rightHeight = calculateHeight(node.right, maxDiameter)

    maxDiameter[0] = maxOf(maxDiameter[0], leftHeight + rightHeight)

    return maxOf(leftHeight, rightHeight) + 1
}
*/
