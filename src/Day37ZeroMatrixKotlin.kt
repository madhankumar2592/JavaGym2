package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `ArrayList` and `LinkedList`?
 *
 * Explanation:
 * - `ArrayList`: Backed by a dynamic array. Fast random access (get(i) is O(1)). Slow insertions/deletions in the middle (O(N)).
 * - `LinkedList`: Backed by a doubly linked list. Slow random access (get(i) is O(N)). Fast insertions/deletions (O(1) if you have the node).
 */

/**
 * Problem Description:
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 *
 * Example:
 * Input:
 * [
 *   [1, 1, 1],
 *   [1, 0, 1],
 *   [1, 1, 1]
 * ]
 * Output:
 * [
 *   [1, 0, 1],
 *   [0, 0, 0],
 *   [1, 0, 1]
 * ]
 */
fun setZeroes(matrix: Array<IntArray>) {
    TODO("Implement this method")
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(1, 0, 1),
        intArrayOf(1, 1, 1)
    )
    setZeroes(matrix)

    for (row in matrix) {
        println(row.toList().toString())
    }

    // Expected Output:
    // [1, 0, 1]
    // [0, 0, 0]
    // [1, 0, 1]
}

/*
// Solution Implementation

fun setZeroes(matrix: Array<IntArray>) {
    var rowHasZero = matrix[0].any { it == 0 }
    var colHasZero = matrix.any { it[0] == 0 }

    // Check for zeros in the rest of the array
    for (i in 1 until matrix.size) {
        for (j in 1 until matrix[0].size) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0
                matrix[0][j] = 0
            }
        }
    }

    // Nullify rows based on values in first column
    for (i in 1 until matrix.size) {
        if (matrix[i][0] == 0) {
            nullifyRow(matrix, i)
        }
    }

    // Nullify columns based on values in first row
    for (j in 1 until matrix[0].size) {
        if (matrix[0][j] == 0) {
            nullifyColumn(matrix, j)
        }
    }

    // Nullify first row
    if (rowHasZero) {
        nullifyRow(matrix, 0)
    }

    // Nullify first column
    if (colHasZero) {
        nullifyColumn(matrix, 0)
    }
}

private fun nullifyRow(matrix: Array<IntArray>, row: Int) {
    for (j in matrix[0].indices) {
        matrix[row][j] = 0
    }
}

private fun nullifyColumn(matrix: Array<IntArray>, col: Int) {
    for (i in matrix.indices) {
        matrix[i][col] = 0
    }
}
*/
