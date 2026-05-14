package com.interview.daily;

/**
 * Interview Question:
 * What is the difference between DFS and BFS?
 *
 * Explanation:
 * - DFS (Depth-First Search): Explores as far as possible along each branch before backtracking. Uses a stack (or recursion).
 * - BFS (Breadth-First Search): Explores all neighbors at the present depth prior to moving on to nodes at the next depth level. Uses a queue.
 */

public class Day66NumberOfIslands {

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

    public static int numIslands(char[][] grid) {
        // TODO: Implement this method
        return 0;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int result = numIslands(grid);

        System.out.println("Number of Islands: " + result);

        // Expected Output:
        // Number of Islands: 1
    }
}

/*
// Solution Implementation

public static int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0) {
        return 0;
    }

    int numIslands = 0;
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == '1') {
                numIslands++;
                dfs(grid, i, j);
            }
        }
    }
    return numIslands;
}

private static void dfs(char[][] grid, int i, int j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
        return;
    }

    grid[i][j] = '0'; // Mark as visited

    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);
}
*/
