package com.interview.daily

/**
 * Interview Question:
 * How does a HashMap work internally in Java?
 *
 * Explanation:
 * - It uses an array of Nodes (buckets).
 * - Key's hashCode() determines the index: index = hashCode % arrayLength.
 * - If collision occurs (same index), it uses a LinkedList (or Red-Black Tree in Java 8+ if size > 8).
 * - equals() is used to find the correct key in the bucket.
 */

/**
 * Problem Description:
 * Given an array of integers and a target, return indices of the two numbers such that they add up to target.
 * Assume exactly one solution exists.
 *
 * Example:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    // TODO: Implement this method
    TODO()
}

fun findTwoSum(nums: IntArray, target: Int): IntArray {
    val haveSeen = mutableMapOf<Int, Int>()

    nums.forEachIndexed { i, num ->
        val complement = target - num
        if (haveSeen.containsKey(complement)) {
            return intArrayOf(haveSeen[complement]!!, i)
        }
        haveSeen[num] = i
    }

    nums.forEachIndexed { _, num ->
        val complement = target - num
    }

    throw IllegalArgumentException("No two sum solution")
}

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = findTwoSum(nums, target)

    println("Indices: [${result[0]}, ${result[1]}]")

    // Expected Output:
    // Indices: [0, 1]
}

/*
// Solution Implementation

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    nums.forEachIndexed { i, num ->
        val complement = target - num
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[num] = i
    }
    throw IllegalArgumentException("No two sum solution")
}
*/
