package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `String` and `StringBuilder`?
 *
 * Explanation:
 * - `String`: Immutable.
 * - `StringBuilder`: Mutable, not thread-safe.
 */

/**
 * Problem Description:
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 *
 * Example:
 * Input: "pale", "ple"
 * Output: true
 */
fun oneEditAway(first: String, second: String): Boolean {
    // TODO: Implement this method
    return false
}

fun main() {
    val first = "pale"
    val second = "ple"
    val result = oneEditAway(first, second)

    println("One Edit Away: $result")

    // Expected Output:
    // One Edit Away: true
}

/*
// Solution Implementation

fun oneEditAway(first: String, second: String): Boolean {
    if (Math.abs(first.length - second.length) > 1) {
        return false
    }

    val s1 = if (first.length < second.length) first else second
    val s2 = if (first.length < second.length) second else first

    var index1 = 0
    var index2 = 0
    var foundDifference = false

    while (index2 < s2.length && index1 < s1.length) {
        if (s1[index1] != s2[index2]) {
            if (foundDifference) return false
            foundDifference = true

            if (s1.length == s2.length) {
                index1++
            }
        } else {
            index1++
        }
        index2++
    }
    return true
}
*/
