package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `filter` and `map` in Java Streams?
 *
 * Explanation:
 * - `filter`: Selects elements based on a predicate (boolean condition).
 * - `map`: Transforms elements into another object.
 */

/**
 * Problem Description:
 * Given a list of integers, filter out the even numbers and return a list of odd numbers.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: [1, 3, 5]
 */
fun filterOddNumbers(list: List<Int>): List<Int> {
    // TODO: Implement this method
    TODO()
}

fun main() {
    val input = listOf(1, 2, 3, 4, 5)
    val result = filterOddNumbers(input)

    println("Odd Numbers: $result")

    // Expected Output:
    // Odd Numbers: [1, 3, 5]
}

/*
// Solution Implementation

fun filterOddNumbers(list: List<Int>): List<Int> {
    return list.filter { n -> n % 2 != 0 }
}
*/
