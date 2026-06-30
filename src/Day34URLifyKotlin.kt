package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `String`, `StringBuilder`, and `StringBuffer`?
 *
 * Explanation:
 * - `String`: Immutable.
 * - `StringBuilder`: Mutable, not thread-safe.
 * - `StringBuffer`: Mutable, thread-safe (synchronized).
 */

/**
 * Problem Description:
 * Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string.
 * (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
 *
 * Example:
 * Input: "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
fun replaceSpaces(str: CharArray, trueLength: Int) {
    TODO("Implement this method")
}

fun main() {
    val input = "Mr John Smith    "
    val str = input.toCharArray()
    val trueLength = 13
    replaceSpaces(str, trueLength)

    println("URLified: " + String(str).trim())

    // Expected Output:
    // URLified: Mr%20John%20Smith
}

/*
// Solution Implementation

fun replaceSpaces(str: CharArray, trueLength: Int) {
    var spaceCount = 0
    for (i in 0 until trueLength) {
        if (str[i] == ' ') {
            spaceCount++
        }
    }

    var index = trueLength + spaceCount * 2
    if (trueLength < str.size) str[trueLength] = ' ' // End array

    for (i in trueLength - 1 downTo 0) {
        if (str[i] == ' ') {
            str[index - 1] = '0'
            str[index - 2] = '2'
            str[index - 3] = '%'
            index -= 3
        } else {
            str[index - 1] = str[i]
            index--
        }
    }
}
*/
