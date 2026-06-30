package com.interview.daily

/**
 * Interview Question:
 * What is the difference between DFS and BFS?
 *
 * Explanation:
 * - DFS (Depth-First Search): Explores as far as possible along each branch before backtracking. Uses a stack (or recursion).
 * - BFS (Breadth-First Search): Explores all neighbors at the present depth prior to moving on to nodes at the next depth level. Uses a queue.
 */

/**
 * Problem Description:
 * Given an m x n 2D binary grid `grid` which represents a map of '1's (land) and '0's (water), return the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 *
 * Example:
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 */
fun numIslands(grid: Array<CharArray>): Int {
    // TODO: Implement this method
    return 0
}

fun main() {
    val grid = arrayOf(
        charArrayOf('1', '1', '1', '1', '0'),
        charArrayOf('1', '1', '0', '1', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '0', '0', '0')
    )
    val result = numIslands(grid)

    println("Number of Islands: $result")

    // Expected Output:
    // Number of Islands: 1
}

/*
// Solution Implementation

fun numIslands(grid: Array<CharArray>): Int {
    if (grid.isEmpty()) return 0

    var numIslands = 0
    for (i in grid.indices) {
        for (j in grid[0].indices) {
            if (grid[i][j] == '1') {
                numIslands++
                dfs(grid, i, j)
            }
        }
    }
    return numIslands
}

private fun dfs(grid: Array<CharArray>, i: Int, j: Int) {
    if (i < 0 || i >= grid.size || j < 0 || j >= grid[0].size || grid[i][j] == '0') {
        return
    }

    grid[i][j] = '0' // Mark as visited

    dfs(grid, i + 1, j)
    dfs(grid, i - 1, j)
    dfs(grid, i, j + 1)
    dfs(grid, i, j - 1)
}
*/
