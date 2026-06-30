package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `final`, `finally`, and `finalize`?
 *
 * Explanation:
 * - `final`: A keyword used to declare constants, prevent method overriding, and prevent class inheritance.
 * - `finally`: A block in a `try-catch` statement that is always executed, regardless of whether an exception is thrown.
 * - `finalize`: A method called by the garbage collector before an object is reclaimed. Its use is discouraged.
 */

/**
 * Problem Description:
 * Find the second largest number in an integer array.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: 4
 */
fun findSecondLargest(nums: IntArray): Int {
    // TODO: Implement this method
    return -1
}

fun main() {
    val input = intArrayOf(1, 2, 3, 4, 5)
    val result = findSecondLargest(input)

    println("Second Largest: $result")

    // Expected Output:
    // Second Largest: 4
}

/*
// Solution Implementation

fun findSecondLargest(nums: IntArray): Int {
    require(nums.size >= 2) { "Input array must have at least two elements." }

    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (num in nums) {
        if (num > largest) {
            secondLargest = largest
            largest = num
        } else if (num > secondLargest && num != largest) {
            secondLargest = num
        }
    }

    return secondLargest
}
*/
