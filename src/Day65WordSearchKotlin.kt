package com.interview.daily

/**
 * Interview Question:
 * What is backtracking?
 *
 * Explanation:
 * - Backtracking is a general algorithm for finding all (or some) solutions to some computational problems, notably constraint satisfaction problems.
 * - It incrementally builds candidates to the solutions, and abandons a candidate ("backtracks") as soon as it determines that the candidate cannot possibly be completed to a valid solution.
 */

/**
 * Problem Description:
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 *
 * Example:
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * Output: true
 */
fun exist(board: Array<CharArray>, word: String): Boolean {
    TODO("Implement this method")
}

fun main() {
    val board = arrayOf(
        charArrayOf('A', 'B', 'C', 'E'),
        charArrayOf('S', 'F', 'C', 'S'),
        charArrayOf('A', 'D', 'E', 'E')
    )
    val word = "ABCCED"
    val result = exist(board, word)

    println("Word Exists: $result")

    // Expected Output:
    // Word Exists: true
}

/*
// Solution Implementation

fun exist(board: Array<CharArray>, word: String): Boolean {
    for (i in board.indices) {
        for (j in board[0].indices) {
            if (existHelper(board, i, j, word, 0)) {
                return true
            }
        }
    }
    return false
}

private fun existHelper(board: Array<CharArray>, i: Int, j: Int, word: String, index: Int): Boolean {
    if (index == word.length) {
        return true
    }
    if (i < 0 || i >= board.size || j < 0 || j >= board[0].size || board[i][j] != word[index]) {
        return false
    }

    val temp = board[i][j]
    board[i][j] = ' ' // Mark as visited

    val found = existHelper(board, i + 1, j, word, index + 1)
            || existHelper(board, i - 1, j, word, index + 1)
            || existHelper(board, i, j + 1, word, index + 1)
            || existHelper(board, i, j - 1, word, index + 1)

    board[i][j] = temp // Backtrack

    return found
}
*/
