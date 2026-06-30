package com.interview.daily

/**
 * Interview Question:
 * What is the contract between hashCode() and equals()?
 *
 * Explanation:
 * 1. If two objects are equal according to equals(), they must have the same hashCode().
 * 2. If two objects have the same hashCode(), they are NOT necessarily equal (collision).
 * 3. Always override hashCode() when you override equals() to prevent broken behavior in HashMaps/HashSets.
 */

/**
 * Problem Description:
 * Given an array of integers, find the first duplicate number.
 * If no duplicate exists, return -1.
 *
 * Example:
 * Input: [1, 3, 4, 2, 2]
 * Output: 2
 */
fun findDuplicate(nums: IntArray): Int {
    // TODO: Implement this method
    return -1
}

fun main() {
    val input = intArrayOf(1, 3, 4, 2, 2)
    val result = findDuplicate(input)

    println("Duplicate: $result")

    // Expected Output:
    // Duplicate: 2
}

/*
fun findDuplicate(nums: IntArray): Int {
    val seen = mutableSetOf<Int>()
    for (num in nums) {
        if (seen.contains(num)) {
            return num
        }
        seen.add(num)
    }
    return -1
}

fun main() {
    val input = intArrayOf(1, 3, 4, 2, 2)
    val result = findDuplicate(input)

    println("Duplicate: $result")
}
*/
