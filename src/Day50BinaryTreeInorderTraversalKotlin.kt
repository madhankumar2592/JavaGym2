package com.interview.daily

/**
 * Interview Question:
 * What is a Binary Tree?
 *
 * Explanation:
 * - A Binary Tree is a tree data structure in which each node has at most two children,
 *   referred to as the left child and the right child.
 * - Inorder traversal: Left -> Root -> Right.
 */

class TreeNode(val `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

/**
 * Problem Description:
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 * Example:
 * Input: [1, null, 2, 3]
 * Output: [1, 3, 2]
 */
fun inorderTraversal(root: TreeNode?): List<Int> {
    TODO("Implement this method")
}

fun main() {
    val root = TreeNode(1)
    root.right = TreeNode(2)
    root.right?.left = TreeNode(3)

    val result = inorderTraversal(root)

    println("Inorder Traversal: $result")

    // Expected Output:
    // Inorder Traversal: [1, 3, 2]
}

/*
// Solution Implementation

fun inorderTraversal(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()
    val stack = ArrayDeque<TreeNode>()
    var current = root

    while (current != null || stack.isNotEmpty()) {
        while (current != null) {
            stack.addLast(current)
            current = current.left
        }
        current = stack.removeLast()
        result.add(current.`val`)
        current = current.right
    }
    return result
}
*/
