package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `distinct` and `sorted` in Java Streams?
 *
 * Explanation:
 * - `distinct`: Removes duplicate elements from the stream.
 * - `sorted`: Sorts the elements of the stream.
 */

/**
 * Problem Description:
 * Given a list of integers, remove duplicate numbers using Java Streams.
 *
 * Example:
 * Input: [1, 2, 2, 3, 4, 4, 5]
 * Output: [1, 2, 3, 4, 5]
 */
fun removeDuplicates(list: List<Int>): List<Int> {
    TODO("Implement this method")
}

fun main() {
    val input = listOf(1, 2, 2, 3, 4, 4, 5)
    val result = removeDuplicates(input)

    println("Unique Numbers: $result")

    // Expected Output:
    // Unique Numbers: [1, 2, 3, 4, 5]
}

/*
// Solution Implementation

fun removeDuplicates(list: List<Int>): List<Int> {
    return list.distinct()
}
*/
