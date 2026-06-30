package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `==` and `equals()`?
 *
 * Explanation:
 * - `==`: Compares object references (memory addresses).
 * - `equals()`: Compares object values.
 * - For primitive types, `==` compares values.
 * - For strings, `==` compares references, while `equals()` compares content.
 */

/**
 * Problem Description:
 * Given two strings, write a method to decide if one is a permutation of the other.
 *
 * Example:
 * Input: "abc", "bca"
 * Output: true
 */
fun isPermutation(s1: String, s2: String): Boolean {
    TODO("Implement this method")
}

fun main() {
    val s1 = "abc"
    val s2 = "bca"
    val result = isPermutation(s1, s2)

    println("Is Permutation: $result")

    // Expected Output:
    // Is Permutation: true
}

/*
// Solution Implementation

fun isPermutation(s1: String, s2: String): Boolean {
    if (s1.length != s2.length) {
        return false
    }
    return s1.toCharArray().sorted() == s2.toCharArray().sorted()
}
*/
