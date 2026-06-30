package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `HashMap` and `LinkedHashMap`?
 *
 * Explanation:
 * - `HashMap`: Does not maintain insertion order.
 * - `LinkedHashMap`: Maintains insertion order.
 * - `LinkedHashMap` is useful when you need to iterate over keys in the order they were inserted.
 */

/**
 * Problem Description:
 * Find the first non-repeating character in a string.
 *
 * Example:
 * Input: "leetcode"
 * Output: 'l'
 */
fun firstUniqChar(s: String): Char {
    // TODO: Implement this method
    return ' '
}

fun main() {
    val input = "leetcode"
    val result = firstUniqChar(input)

    println("First Non-Repeating Char: $result")

    // Expected Output:
    // First Non-Repeating Char: l
}

/*
// Solution Implementation

fun firstUniqChar(s: String): Char {
    val countMap = linkedMapOf<Char, Int>()
    for (c in s) {
        countMap[c] = (countMap[c] ?: 0) + 1
    }

    return countMap.entries.firstOrNull { it.value == 1 }?.key ?: ' '
    // Or throw an exception if no unique char found
}
*/
