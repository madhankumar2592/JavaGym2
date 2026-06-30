package com.interview.daily

/**
 * Interview Question:
 * What is the Lowest Common Ancestor (LCA) of two nodes in a binary tree?
 *
 * Explanation:
 * - The LCA of two nodes `p` and `q` is the lowest node in the tree that has both `p` and `q` as descendants.
 * - A node can be a descendant of itself.
 */

class TreeNode(val `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/**
 * Problem Description:
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 *
 * Example:
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * Output: 6
 */
fun lowestCommonAncestor(root: TreeNode?, p: TreeNode, q: TreeNode): TreeNode? {
    // TODO: Implement this method
    return null
}

fun main() {
    val root = TreeNode(6)
    root.left = TreeNode(2)
    root.right = TreeNode(8)
    root.left!!.left = TreeNode(0)
    root.left!!.right = TreeNode(4)
    root.right!!.left = TreeNode(7)
    root.right!!.right = TreeNode(9)
    root.left!!.right!!.left = TreeNode(3)
    root.left!!.right!!.right = TreeNode(5)

    val p = root.left!!
    val q = root.right!!

    val result = lowestCommonAncestor(root, p, q)

    println("LCA: ${result?.`val`}")

    // Expected Output:
    // LCA: 6
}

/*
// Solution Implementation

fun lowestCommonAncestor(root: TreeNode?, p: TreeNode, q: TreeNode): TreeNode? {
    return when {
        root == null -> null
        root.`val` > p.`val` && root.`val` > q.`val` -> lowestCommonAncestor(root.left, p, q)
        root.`val` < p.`val` && root.`val` < q.`val` -> lowestCommonAncestor(root.right, p, q)
        else -> root
    }
}
*/
