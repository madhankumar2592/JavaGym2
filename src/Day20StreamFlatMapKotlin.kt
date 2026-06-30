package com.interview.daily

/**
 * Interview Question:
 * What is `flatMap` used for in Java Streams?
 *
 * Explanation:
 * - It's an intermediate operation that transforms each element into a stream of objects, then flattens the streams into a single stream.
 * - It's useful for working with nested collections or when you want to transform one element into multiple elements.
 */

/**
 * Problem Description:
 * Given a list of lists of integers, flatten it into a single list of integers.
 *
 * Example:
 * Input: [[1, 2], [3, 4], [5]]
 * Output: [1, 2, 3, 4, 5]
 */
fun flattenList(listOfLists: List<List<Int>>): List<Int> {
    TODO("Implement this method")
}

fun main() {
    val input = listOf(
        listOf(1, 2),
        listOf(3, 4),
        listOf(5)
    )
    val result = flattenList(input)

    println("Flattened List: $result")

    // Expected Output:
    // Flattened List: [1, 2, 3, 4, 5]
}

/*
// Solution Implementation

fun flattenList(listOfLists: List<List<Int>>): List<Int> =
    listOfLists.flatten()
*/
