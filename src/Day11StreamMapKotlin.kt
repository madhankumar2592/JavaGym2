package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `map` and `flatMap` in Java Streams?
 *
 * Explanation:
 * - `map`: Transforms each element into another object. One-to-one mapping.
 * - `flatMap`: Transforms each element into a stream of objects, then flattens the streams into a single stream. One-to-many mapping.
 */

/**
 * Problem Description:
 * Given a list of strings, convert each string to uppercase using Java Streams.
 *
 * Example:
 * Input: ["hello", "world"]
 * Output: ["HELLO", "WORLD"]
 */
fun toUpperCase(list: List<String>): List<String> {
    TODO("Implement this method")
}

fun main() {
    val input = listOf("hello", "world")
    val result = toUpperCase(input)

    println("Uppercase List: $result")

    // Expected Output:
    // Uppercase List: [HELLO, WORLD]
}

/*
// Solution Implementation

fun toUpperCase(list: List<String>): List<String> {
    return list.map { it.uppercase() }
}
*/
