package com.interview.daily

import java.util.Stack

/**
 * Interview Question:
 * How do you find the Kth smallest element in a BST?
 *
 * Explanation:
 * - Perform an inorder traversal of the BST.
 * - The inorder traversal of a BST yields elements in sorted order.
 * - The Kth element in the inorder traversal is the Kth smallest element.
 */

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/**
 * Problem Description:
 * Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
 *
 * Example:
 * Input: root = [3,1,4,null,2], k = 1
 * Output: 1
 */
fun kthSmallest(root: TreeNode?, k: Int): Int {
    TODO("Implement this method")
}

fun main() {
    val root = TreeNode(3)
    root.left = TreeNode(1)
    root.right = TreeNode(4)
    root.left!!.right = TreeNode(2)

    val result = kthSmallest(root, 1)

    println("Kth Smallest: $result")

    // Expected Output:
    // Kth Smallest: 1
}

/*
// Solution Implementation

fun kthSmallest(root: TreeNode?, k: Int): Int {
    val stack = Stack<TreeNode>()
    var current = root
    var remaining = k

    while (current != null || stack.isNotEmpty()) {
        while (current != null) {
            stack.push(current)
            current = current.left
        }
        current = stack.pop()
        remaining--
        if (remaining == 0) {
            return current.`val`
        }
        current = current.right
    }
    return -1
}
*/
