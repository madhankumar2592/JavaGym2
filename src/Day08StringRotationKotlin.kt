package com.interview.daily

/**
 * Interview Question:
 * How do you check if two strings are rotations of each other?
 *
 * Explanation:
 * A string rotation means shifting characters.
 * Example: "abcde" -> "cdeab" is a rotation.
 *
 * A clever way to solve this is to concatenate the first string with itself.
 * If the second string is a rotation, it must be a substring of the concatenated string.
 * (s1 + s1).contains(s2)
 */

/**
 * Problem Description:
 * Given two strings s1 and s2, write a method to check if s2 is a rotation of s1.
 *
 * Example:
 * Input: s1 = "waterbottle", s2 = "erbottlewat"
 * Output: true
 */
fun isRotation(s1: String, s2: String): Boolean {
    // TODO: Implement this method
    return false
}

fun main() {
    val s1 = "waterbottle"
    val s2 = "erbottlewat"
    val result = isRotation(s1, s2)

    println("Is Rotation: $result")

    // Expected Output:
    // Is Rotation: true
}

/*
// Solution Implementation

fun isRotation(s1: String, s2: String): Boolean {
    if (s1.length != s2.length) return false
    if (s1.isEmpty()) return true // Empty strings are rotations of each other

    val concatenated = s1 + s1
    return concatenated.contains(s2)
}
*/
