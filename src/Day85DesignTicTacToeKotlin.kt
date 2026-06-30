package com.interview.daily

/**
 * Interview Question:
 * How would you design a game of Tic-Tac-Toe?
 *
 * Explanation:
 * - A Tic-Tac-Toe game is played on a 3x3 grid.
 * - Two players take turns marking a cell with their symbol (X or O).
 * - The first player to get three of their symbols in a row, column, or diagonal wins.
 * - If the grid is full and no one has won, it's a draw.
 */

/**
 * Problem Description:
 * Assume the following rules are for the tic-tac-toe game on an n x n board between two players:
 * 1. A move is guaranteed to be valid and is placed on an empty block.
 * 2. Once a winning condition is reached, no more moves are allowed.
 * 3. A player who succeeds in placing n of their marks in a horizontal, vertical, or diagonal row wins the game.
 * Implement the TicTacToe class:
 * - TicTacToe(int n) Initializes the object with the size of the board n.
 * - int move(int row, int col, int player) Indicates that the player with id player plays at the cell (row, col) of the board. The move is guaranteed to be a valid move.
 *
 * Example:
 * TicTacToe ticTacToe = new TicTacToe(3);
 * ticTacToe.move(0, 0, 1); // return 0 (no one wins)
 * ticTacToe.move(0, 2, 2); // return 0 (no one wins)
 * ticTacToe.move(2, 2, 1); // return 0 (no one wins)
 * ticTacToe.move(1, 1, 2); // return 0 (no one wins)
 * ticTacToe.move(2, 0, 1); // return 0 (no one wins)
 * ticTacToe.move(1, 0, 2); // return 0 (no one wins)
 * ticTacToe.move(2, 1, 1); // return 1 (player 1 wins)
 */
class TicTacToe(private val n: Int) {
    private val rows = IntArray(n)
    private val cols = IntArray(n)
    private var diagonal = 0
    private var antiDiagonal = 0

    fun move(row: Int, col: Int, player: Int): Int {
        TODO("Implement this method")
    }
}

fun main() {
    val ticTacToe = TicTacToe(3)
    println(ticTacToe.move(0, 0, 1))
    println(ticTacToe.move(0, 2, 2))
    println(ticTacToe.move(2, 2, 1))
    println(ticTacToe.move(1, 1, 2))
    println(ticTacToe.move(2, 0, 1))
    println(ticTacToe.move(1, 0, 2))
    println(ticTacToe.move(2, 1, 1))

    // Expected Output:
    // 0
    // 0
    // 0
    // 0
    // 0
    // 0
    // 1
}

/*
// Solution Implementation

fun move(row: Int, col: Int, player: Int): Int {
    val toAdd = if (player == 1) 1 else -1

    rows[row] += toAdd
    cols[col] += toAdd
    if (row == col) {
        diagonal += toAdd
    }
    if (row + col == n - 1) {
        antiDiagonal += toAdd
    }

    if (Math.abs(rows[row]) == n || Math.abs(cols[col]) == n || Math.abs(diagonal) == n || Math.abs(antiDiagonal) == n) {
        return player
    }

    return 0
}
*/
