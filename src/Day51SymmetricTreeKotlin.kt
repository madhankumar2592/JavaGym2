package com.interview.daily

/**
 * Interview Question:
 * What is a symmetric tree?
 *
 * Explanation:
 * - A symmetric tree is a tree that is a mirror image of itself.
 * - The left subtree is a mirror image of the right subtree.
 */

class TreeNode(val `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

/**
 * Problem Description:
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 * Example:
 * Input: [1, 2, 2, 3, 4, 4, 3]
 * Output: true
 */
fun isSymmetric(root: TreeNode?): Boolean {
    TODO("Implement this method")
}

fun main() {
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(2)
    root.left!!.left = TreeNode(3)
    root.left!!.right = TreeNode(4)
    root.right!!.left = TreeNode(4)
    root.right!!.right = TreeNode(3)

    val result = isSymmetric(root)

    println("Is Symmetric: $result")

    // Expected Output:
    // Is Symmetric: true
}

/*
// Solution Implementation

fun isSymmetric(root: TreeNode?): Boolean {
    if (root == null) {
        return true
    }
    return isMirror(root.left, root.right)
}

fun isMirror(t1: TreeNode?, t2: TreeNode?): Boolean {
    if (t1 == null && t2 == null) {
        return true
    }
    if (t1 == null || t2 == null) {
        return false
    }
    return (t1.`val` == t2.`val`)
            && isMirror(t1.right, t2.left)
            && isMirror(t1.left, t2.right)
}
*/
