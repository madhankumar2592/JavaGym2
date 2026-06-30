package com.interview.daily

/**
 * Interview Question:
 * What is the difference between Comparable and Comparator?
 *
 * Explanation:
 * - Comparable: Natural ordering (compareTo method). Implemented by the class itself.
 *   Example: String, Integer implement Comparable.
 * - Comparator: Custom ordering (compare method). Implemented by a separate class or lambda.
 *   Example: Collections.sort(list, new CustomComparator());
 */

/**
 * Problem Description:
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Example:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 */
fun isAnagram(s: String, t: String): Boolean {
    // TODO: Implement this method
    return false
}

fun main() {
    val s = "anagram"
    val t = "nagaram"
    val result = isAnagram(s, t)

    println("Is Anagram: $result")

    // Expected Output:
    // Is Anagram: true
}

/*
// Solution Implementation

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }
    val count = IntArray(26)
    for (i in s.indices) {
        count[s[i] - 'a']++
        count[t[i] - 'a']--
    }
    return count.all { it == 0 }
}
*/
