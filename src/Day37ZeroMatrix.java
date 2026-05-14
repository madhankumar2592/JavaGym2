package com.interview.daily;

/**
 * Interview Question:
 * What is the difference between `ArrayList` and `LinkedList`?
 *
 * Explanation:
 * - `ArrayList`: Backed by a dynamic array. Fast random access (get(i) is O(1)). Slow insertions/deletions in the middle (O(N)).
 * - `LinkedList`: Backed by a doubly linked list. Slow random access (get(i) is O(N)). Fast insertions/deletions (O(1) if you have the node).
 */

public class Day37ZeroMatrix {

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

    public static void setZeroes(int[][] matrix) {
        // TODO: Implement this method
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setZeroes(matrix);

        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // Expected Output:
        // [1, 0, 1]
        // [0, 0, 0]
        // [1, 0, 1]
    }
}

/*
// Solution Implementation

public static void setZeroes(int[][] matrix) {
    boolean rowHasZero = false;
    boolean colHasZero = false;

    // Check if first row has a zero
    for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[0][j] == 0) {
            rowHasZero = true;
            break;
        }
    }

    // Check if first column has a zero
    for (int i = 0; i < matrix.length; i++) {
        if (matrix[i][0] == 0) {
            colHasZero = true;
            break;
        }
    }

    // Check for zeros in the rest of the array
    for (int i = 1; i < matrix.length; i++) {
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    // Nullify rows based on values in first column
    for (int i = 1; i < matrix.length; i++) {
        if (matrix[i][0] == 0) {
            nullifyRow(matrix, i);
        }
    }

    // Nullify columns based on values in first row
    for (int j = 1; j < matrix[0].length; j++) {
        if (matrix[0][j] == 0) {
            nullifyColumn(matrix, j);
        }
    }

    // Nullify first row
    if (rowHasZero) {
        nullifyRow(matrix, 0);
    }

    // Nullify first column
    if (colHasZero) {
        nullifyColumn(matrix, 0);
    }
}

private static void nullifyRow(int[][] matrix, int row) {
    for (int j = 0; j < matrix[0].length; j++) {
        matrix[row][j] = 0;
    }
}

private static void nullifyColumn(int[][] matrix, int col) {
    for (int i = 0; i < matrix.length; i++) {
        matrix[i][col] = 0;
    }
}
*/
