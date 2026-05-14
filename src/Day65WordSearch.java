package com.interview.daily;

/**
 * Interview Question:
 * What is backtracking?
 *
 * Explanation:
 * - Backtracking is a general algorithm for finding all (or some) solutions to some computational problems, notably constraint satisfaction problems.
 * - It incrementally builds candidates to the solutions, and abandons a candidate ("backtracks") as soon as it determines that the candidate cannot possibly be completed to a valid solution.
 */

public class Day65WordSearch {

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

    public static boolean exist(char[][] board, String word) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        boolean result = exist(board, word);

        System.out.println("Word Exists: " + result);

        // Expected Output:
        // Word Exists: true
    }
}

/*
// Solution Implementation

public static boolean exist(char[][] board, String word) {
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if (exist(board, i, j, word, 0)) {
                return true;
            }
        }
    }
    return false;
}

private static boolean exist(char[][] board, int i, int j, String word, int index) {
    if (index == word.length()) {
        return true;
    }
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
        return false;
    }

    char temp = board[i][j];
    board[i][j] = ' '; // Mark as visited

    boolean found = exist(board, i + 1, j, word, index + 1)
            || exist(board, i - 1, j, word, index + 1)
            || exist(board, i, j + 1, word, index + 1)
            || exist(board, i, j - 1, word, index + 1);

    board[i][j] = temp; // Backtrack

    return found;
}
*/
