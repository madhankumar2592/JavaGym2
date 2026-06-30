package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `int[]` and `Integer[]`?
 *
 * Explanation:
 * - `int[]`: An array of primitive `int`s.
 * - `Integer[]`: An array of `Integer` objects.
 * - `int[]` is more memory-efficient, while `Integer[]` can store null values and be used in collections.
 */

/**
 * Problem Description:
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 *
 * Example:
 * Input:
 * [
 *   [1, 2, 3],
 *   [4, 5, 6],
 *   [7, 8, 9]
 * ]
 * Output:
 * [
 *   [7, 4, 1],
 *   [8, 5, 2],
 *   [9, 6, 3]
 * ]
 */
fun rotate(matrix: Array<IntArray>) {
    TODO("Implement this method")
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    rotate(matrix)

    for (row in matrix) {
        println(row.toList().toString())
    }

    // Expected Output:
    // [7, 4, 1]
    // [8, 5, 2]
    // [9, 6, 3]
}

/*
// Solution Implementation

fun rotate(matrix: Array<IntArray>) {
    if (matrix.isEmpty() || matrix.size != matrix[0].size) return
    val n = matrix.size

    // Transpose the matrix
    for (i in 0 until n) {
        for (j in i until n) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }

    // Reverse each row
    for (i in 0 until n) {
        for (j in 0 until n / 2) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[i][n - 1 - j]
            matrix[i][n - 1 - j] = temp
        }
    }
}
*/
