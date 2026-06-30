package com.interview.daily

import java.util.LinkedList

/**
 * Interview Question:
 * What is a level-order traversal?
 *
 * Explanation:
 * - Level-order traversal visits nodes level by level, from left to right.
 * - It's also known as Breadth-First Search (BFS).
 */

class TreeNode(val `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

/**
 * Problem Description:
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 *
 * Example:
 * Input: [3, 9, 20, null, null, 15, 7]
 * Output: [[3], [9, 20], [15, 7]]
 */
fun levelOrder(root: TreeNode?): List<List<Int>> {
    TODO("Implement this method")
}

fun main() {
    val root = TreeNode(3).apply {
        left = TreeNode(9)
        right = TreeNode(20).apply {
            left = TreeNode(15)
            right = TreeNode(7)
        }
    }

    val result = levelOrder(root)

    println("Level Order Traversal: $result")

    // Expected Output:
    // Level Order Traversal: [[3], [9, 20], [15, 7]]
}

/*
// Solution Implementation

fun levelOrder(root: TreeNode?): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    if (root == null) return result

    val queue: LinkedList<TreeNode> = LinkedList()
    queue.offer(root)

    while (queue.isNotEmpty()) {
        val levelSize = queue.size
        val currentLevel = mutableListOf<Int>()

        repeat(levelSize) {
            val currentNode = queue.poll()!!
            currentLevel.add(currentNode.`val`)
            currentNode.left?.let { queue.offer(it) }
            currentNode.right?.let { queue.offer(it) }
        }
        result.add(currentLevel)
    }
    return result
}
*/
