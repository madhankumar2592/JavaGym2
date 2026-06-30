package com.interview.daily

/**
 * Interview Question:
 * What is `Collectors.toMap` used for?
 *
 * Explanation:
 * - It's a terminal operation that collects elements into a `Map`.
 * - You specify a key mapper and a value mapper.
 * - You can also provide a merge function to handle duplicate keys.
 */

/**
 * Problem Description:
 * Given a list of strings, convert it into a map where the key is the string and the value is its length.
 * Assume all strings are unique.
 *
 * Example:
 * Input: ["apple", "banana", "cherry"]
 * Output: {apple=5, banana=6, cherry=6}
 */
fun convertToMap(list: List<String>): Map<String, Int> {
    TODO("Implement this method")
}

fun main() {
    val input = listOf("apple", "banana", "cherry")
    val result = convertToMap(input)

    println("Map: $result")

    // Expected Output:
    // Map: {apple=5, banana=6, cherry=6}
}

/*
// Solution Implementation

fun convertToMap(list: List<String>): Map<String, Int> {
    return list.associateWith { it.length }
}
*/
