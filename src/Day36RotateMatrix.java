package com.interview.daily;

/**
 * Interview Question:
 * What is the difference between `int[]` and `Integer[]`?
 *
 * Explanation:
 * - `int[]`: An array of primitive `int`s.
 * - `Integer[]`: An array of `Integer` objects.
 * - `int[]` is more memory-efficient, while `Integer[]` can store null values and be used in collections.
 */

public class Day36RotateMatrix {

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

    public static void rotate(int[][] matrix) {
        // TODO: Implement this method
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(matrix);

        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // Expected Output:
        // [7, 4, 1]
        // [8, 5, 2]
        // [9, 6, 3]
    }
}

/*
// Solution Implementation

public static void rotate(int[][] matrix) {
    if (matrix.length == 0 || matrix.length != matrix[0].length) return;
    int n = matrix.length;

    // Transpose the matrix
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    // Reverse each row
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n / 2; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n - 1 - j];
            matrix[i][n - 1 - j] = temp;
        }
    }
}
*/
