package com.interview.daily;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Interview Question:
 * How would you design a hit counter?
 *
 * Explanation:
 * - A hit counter tracks the number of hits received in the past 5 minutes (300 seconds).
 * - Each function call accepts a timestamp parameter (in seconds granularity).
 * - You may assume that calls are being made to the system in chronological order (i.e., the timestamp is monotonically increasing).
 */

public class Day84DesignHitCounter {

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

    static class HitCounter {
        private Queue<Integer> hits;

        public HitCounter() {
            hits = new LinkedList<>();
        }

        public void hit(int timestamp) {
            // TODO: Implement this method
        }

        public int getHits(int timestamp) {
            // TODO: Implement this method
            return 0;
        }
    }

    public static void main(String[] args) {
        HitCounter counter = new HitCounter();
        counter.hit(1);
        counter.hit(2);
        counter.hit(3);
        System.out.println("Hits at 4: " + counter.getHits(4));
        counter.hit(300);
        System.out.println("Hits at 300: " + counter.getHits(300));
        System.out.println("Hits at 301: " + counter.getHits(301));

        // Expected Output:
        // Hits at 4: 3
        // Hits at 300: 4
        // Hits at 301: 3
    }
}

/*
// Solution Implementation

public void hit(int timestamp) {
    hits.offer(timestamp);
}

public int getHits(int timestamp) {
    while (!hits.isEmpty() && timestamp - hits.peek() >= 300) {
        hits.poll();
    }
    return hits.size();
}
*/
