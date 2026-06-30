package com.interview.daily

/**
 * Interview Question:
 * When should you use streams vs. loops?
 *
 * Explanation:
 * - Use streams for declarative, functional-style programming. They are concise and expressive.
 * - Use loops for imperative programming, when you need more control over the iteration process.
 * - Streams can be slower for small datasets due to overhead, but can be faster for large datasets with parallel processing.
 */

/**
 * Problem Description:
 * Given a list of integers, filter out the even numbers and square the odd numbers.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: [1, 9, 25]
 */
fun filterAndSquare(list: List<Int>): List<Int> {
    TODO("Implement this method")
}

fun main() {
    val input = listOf(1, 2, 3, 4, 5)
    val result = filterAndSquare(input)

    println("Filtered and Squared: $result")

    // Expected Output:
    // Filtered and Squared: [1, 9, 25]
}

/*
// Solution Implementation

fun filterAndSquare(list: List<Int>): List<Int> {
    return list.filter { n -> n % 2 != 0 }
               .map { n -> n * n }
}
*/
