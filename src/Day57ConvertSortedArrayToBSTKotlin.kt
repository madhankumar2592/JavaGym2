package com.interview.daily

/**
 * Interview Question:
 * How do you create a balanced BST from a sorted array?
 *
 * Explanation:
 * - The middle element of the array becomes the root of the tree.
 * - The left half of the array forms the left subtree.
 * - The right half of the array forms the right subtree.
 * - This process is repeated recursively.
 */

/**
 * Problem Description:
 * Given an integer array `nums` where the elements are sorted in ascending order,
 * convert it to a height-balanced binary search tree.
 *
 * Example:
 * Input: [-10, -3, 0, 5, 9]
 * Output: [0, -3, 9, -10, null, 5]
 */
fun sortedArrayToBST(nums: IntArray): TreeNode? {
    // TODO: Implement this method
    return null
}

fun main() {
    val nums = intArrayOf(-10, -3, 0, 5, 9)
    val root = sortedArrayToBST(nums)

    // You can add a print function to verify the tree structure
    println("Root: ${root!!.`val`}")
    println("Left: ${root.left!!.`val`}")
    println("Right: ${root.right!!.`val`}")

    // Expected Output:
    // Root: 0
    // Left: -3
    // Right: 9
}

/*
// Solution Implementation

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.isEmpty()) {
        return null
    }
    return sortedArrayToBST(nums, 0, nums.size - 1)
}

private fun sortedArrayToBST(nums: IntArray, left: Int, right: Int): TreeNode? {
    if (left > right) {
        return null
    }

    val mid = left + (right - left) / 2
    val node = TreeNode(nums[mid])
    node.left = sortedArrayToBST(nums, left, mid - 1)
    node.right = sortedArrayToBST(nums, mid + 1, right)

    return node
}
*/
