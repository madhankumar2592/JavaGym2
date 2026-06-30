package com.interview.daily

import java.util.LinkedList

/**
 * Interview Question:
 * What is a zigzag level-order traversal?
 *
 * Explanation:
 * - Zigzag level-order traversal visits nodes level by level, alternating between left-to-right and right-to-left.
 * - It's also known as a spiral traversal.
 */

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/**
 * Problem Description:
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
 * (i.e., from left to right, then right to left for the next level and alternate between).
 *
 * Example:
 * Input: [3, 9, 20, null, null, 15, 7]
 * Output: [[3], [20, 9], [15, 7]]
 */
fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    TODO("Implement this method")
}

fun main() {
    val root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right?.left = TreeNode(15)
    root.right?.right = TreeNode(7)

    val result = zigzagLevelOrder(root)

    println("Zigzag Level Order Traversal: $result")

    // Expected Output:
    // Zigzag Level Order Traversal: [[3], [20, 9], [15, 7]]
}

/*
// Solution Implementation

fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    if (root == null) return result

    val queue: LinkedList<TreeNode> = LinkedList()
    queue.offer(root)
    var leftToRight = true

    while (queue.isNotEmpty()) {
        val levelSize = queue.size
        val currentLevel = LinkedList<Int>()

        repeat(levelSize) {
            val currentNode = queue.poll()!!
            if (leftToRight) {
                currentLevel.addLast(currentNode.`val`)
            } else {
                currentLevel.addFirst(currentNode.`val`)
            }
            currentNode.left?.let { queue.offer(it) }
            currentNode.right?.let { queue.offer(it) }
        }
        result.add(currentLevel)
        leftToRight = !leftToRight
    }
    return result
}
*/
