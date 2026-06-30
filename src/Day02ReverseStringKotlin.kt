package com.interview.daily

/**
 * Interview Question:
 * Explain the concept of "Pass by Value" in Java.
 *
 * Explanation:
 * Java is strictly "Pass by Value".
 * - For primitives, the actual value is passed.
 * - For objects, the value of the reference (memory address) is passed.
 *   Reassigning the reference inside a method does not affect the original reference,
 *   but modifying the object's state (e.g., array elements, fields) does.
 */

/**
 * Problem Description:
 * Reverse a given string without using StringBuilder.reverse() or similar built-in methods.
 *
 * Example:
 * Input: "backend"
 * Output: "dnekcab"
 */
fun reverseString(input: String): String {
    val chars = input.toCharArray()
    var left = 0
    var right = chars.size - 1

    while (left < right) {
        val temp = chars[left]
        chars[left] = chars[right]
        chars[right] = temp
        left++
        right--
    }

    return String(chars)
}

fun main() {
    val input = "backend"
    val result = reverseString(input)

    println("Input: $input")
    println("Output: $result")

    // Expected Output:
    // Input: backend
    // Output: dnekcab
}

/*
// Solution Implementation

fun reverseString(input: String?): String? {
    if (input == null) return null
    val chars = input.toCharArray()
    var left = 0
    var right = chars.size - 1

    while (left < right) {
        val temp = chars[left]
        chars[left] = chars[right]
        chars[right] = temp
        left++
        right--
    }
    return String(chars)
}
*/
