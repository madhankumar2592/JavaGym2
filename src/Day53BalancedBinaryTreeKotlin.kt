package com.interview.daily

/**
 * Interview Question:
 * What is a balanced binary tree?
 *
 * Explanation:
 * - A balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than 1.
 * - This ensures that the height of the tree is O(log N), which is important for efficient search and insertion.
 */

class TreeNode(val `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/**
 * Problem Description:
 * Given a binary tree, determine if it is height-balanced.
 *
 * Example:
 * Input: [3, 9, 20, null, null, 15, 7]
 * Output: true
 */
fun isBalanced(root: TreeNode?): Boolean {
    // TODO: Implement this method
    return false
}

fun main() {
    val root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right?.left = TreeNode(15)
    root.right?.right = TreeNode(7)

    val result = isBalanced(root)

    println("Is Balanced: $result")

    // Expected Output:
    // Is Balanced: true
}

/*
// Solution Implementation

fun isBalanced(root: TreeNode?): Boolean {
    return checkHeight(root) != -1
}

private fun checkHeight(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }

    val leftHeight = checkHeight(root.left)
    if (leftHeight == -1) return -1

    val rightHeight = checkHeight(root.right)
    if (rightHeight == -1) return -1

    if (Math.abs(leftHeight - rightHeight) > 1) {
        return -1
    }

    return Math.max(leftHeight, rightHeight) + 1
}
*/
