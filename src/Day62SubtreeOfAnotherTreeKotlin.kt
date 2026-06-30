package com.interview.daily

/**
 * Interview Question:
 * How do you check if one tree is a subtree of another?
 *
 * Explanation:
 * - A tree T is a subtree of a tree S if there exists a node n in S such that the subtree of n is identical to T.
 * - That is, if you cut off the tree at node n, the two trees would be identical.
 */

/**
 * Problem Description:
 * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
 *
 * Example:
 * Input: root = [3,4,5,1,2], subRoot = [4,1,2]
 * Output: true
 */
fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
    // TODO: Implement this method
    return false
}

fun main() {
    val root = TreeNode(3)
    root.left = TreeNode(4)
    root.right = TreeNode(5)
    root.left?.left = TreeNode(1)
    root.left?.right = TreeNode(2)

    val subRoot = TreeNode(4)
    subRoot.left = TreeNode(1)
    subRoot.right = TreeNode(2)

    val result = isSubtree(root, subRoot)

    println("Is Subtree: $result")

    // Expected Output:
    // Is Subtree: true
}

/*
// Solution Implementation

fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
    if (root == null) {
        return false
    }
    if (isSameTree(root, subRoot)) {
        return true
    }
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
}

private fun isSameTree(s: TreeNode?, t: TreeNode?): Boolean {
    if (s == null && t == null) {
        return true
    }
    if (s == null || t == null) {
        return false
    }
    if (s.`val` != t.`val`) {
        return false
    }
    return isSameTree(s.left, t.left) && isSameTree(s.right, t.right)
}
*/
