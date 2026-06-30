package com.interview.daily

/**
 * Interview Question:
 * How do you find duplicate elements in a list using streams?
 *
 * Explanation:
 * You can use a combination of `Collections.frequency` and `filter`.
 * - `filter(i -> Collections.frequency(list, i) > 1)`: Filters elements that appear more than once.
 * - `distinct()`: Removes duplicates from the result.
 */

/**
 * Problem Description:
 * Given a list of integers, find the duplicate elements.
 *
 * Example:
 * Input: [1, 2, 3, 2, 4, 5, 4]
 * Output: [2, 4]
 */
fun findDuplicates(list: List<Int>): Set<Int> {
    TODO("Implement this method")
}

fun main() {
    val input = listOf(1, 2, 3, 2, 4, 5, 4)
    val result = findDuplicates(input)

    println("Duplicates: $result")

    // Expected Output:
    // Duplicates: [2, 4]
}

/*
// Solution Implementation

fun findDuplicates(list: List<Int>): Set<Int> {
    val seen = mutableSetOf<Int>()
    return list.filter { n -> !seen.add(n) }.toSet()
}
*/
