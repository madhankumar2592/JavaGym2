package com.interview.daily

import java.util.LinkedList

/**
 * Interview Question:
 * How would you design a hit counter?
 *
 * Explanation:
 * - A hit counter tracks the number of hits received in the past 5 minutes (300 seconds).
 * - Each function call accepts a timestamp parameter (in seconds granularity).
 * - You may assume that calls are being made to the system in chronological order (i.e., the timestamp is monotonically increasing).
 */

/**
 * Problem Description:
 * Design a hit counter which counts the number of hits received in the past 5 minutes.
 * Each function accepts a timestamp parameter (in seconds granularity) and you may assume that calls are being made to the system in chronological order (ie, the timestamp is monotonically increasing).
 * You may assume that the earliest timestamp starts at 1.
 * It is possible that several hits arrive roughly at the same time.
 *
 * Example:
 * HitCounter counter = new HitCounter();
 * counter.hit(1);
 * counter.hit(2);
 * counter.hit(3);
 * counter.getHits(4); // returns 3
 * counter.hit(300);
 * counter.getHits(300); // returns 4
 * counter.getHits(301); // returns 3
 */
class HitCounter {
    private val hits: ArrayDeque<Int> = ArrayDeque()

    fun hit(timestamp: Int) {
        // TODO: Implement this method
    }

    fun getHits(timestamp: Int): Int {
        // TODO: Implement this method
        return 0
    }
}

fun main() {
    val counter = HitCounter()
    counter.hit(1)
    counter.hit(2)
    counter.hit(3)
    println("Hits at 4: ${counter.getHits(4)}")
    counter.hit(300)
    println("Hits at 300: ${counter.getHits(300)}")
    println("Hits at 301: ${counter.getHits(301)}")

    // Expected Output:
    // Hits at 4: 3
    // Hits at 300: 4
    // Hits at 301: 3
}

/*
// Solution Implementation

fun hit(timestamp: Int) {
    hits.addLast(timestamp)
}

fun getHits(timestamp: Int): Int {
    while (hits.isNotEmpty() && timestamp - hits.first() >= 300) {
        hits.removeFirst()
    }
    return hits.size
}
*/
