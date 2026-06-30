package com.interview.daily

/**
 * Interview Question:
 * What is an LFU Cache?
 *
 * Explanation:
 * - An LFU (Least Frequently Used) Cache is a cache replacement policy that discards the least frequently used items first.
 * - It's more complex than LRU because it requires tracking the frequency of access for each item.
 * - It's often implemented using a combination of HashMaps and Doubly Linked Lists (or LinkedHashSets).
 */

/**
 * Problem Description:
 * Design and implement a data structure for a Least Frequently Used (LFU) cache.
 * Implement the LFUCache class:
 * - LFUCache(int capacity) Initializes the object with the capacity of the data structure.
 * - int get(int key) Gets the value of the key if the key exists in the cache. Otherwise, returns -1.
 * - void put(int key, int value) Update the value of the key if present, or inserts the key if not already present. When the cache reaches its capacity, it should invalidate and remove the least frequently used key before inserting a new item. For this problem, when there is a tie (i.e., two or more keys with the same frequency), the least recently used key would be invalidated.
 * To determine the least frequently used key, a use counter is maintained for each key in the cache. The key with the smallest use counter is the least frequently used key.
 * When a key is first inserted into the cache, its use counter is set to 1 (due to the put operation). The use counter for a key in the cache is incremented either a get or put operation is called on it.
 * The functions get and put must each run in O(1) average time complexity.
 *
 * Example:
 * LFUCache lfu = new LFUCache(2);
 * lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
 * lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
 * lfu.get(1);      // return 1
 *                  // cache=[1,2], cnt(2)=1, cnt(1)=2
 * lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
 *                  // cache=[3,1], cnt(3)=1, cnt(1)=2
 * lfu.get(2);      // return -1 (not found)
 * lfu.get(3);      // return 3
 *                  // cache=[3,1], cnt(3)=2, cnt(1)=2
 * lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
 *                  // cache=[4,3], cnt(4)=1, cnt(3)=2
 * lfu.get(1);      // return -1 (not found)
 * lfu.get(3);      // return 3
 *                  // cache=[3,4], cnt(4)=1, cnt(3)=3
 * lfu.get(4);      // return 4
 *                  // cache=[4,3], cnt(4)=2, cnt(3)=3
 */
class LFUCache(private val capacity: Int) {
    private var minFreq = 0
    private val keyToVal = HashMap<Int, Int>()
    private val keyToFreq = HashMap<Int, Int>()
    private val freqToKeys = HashMap<Int, LinkedHashSet<Int>>()

    fun get(key: Int): Int {
        // TODO: Implement this method
        return -1
    }

    fun put(key: Int, value: Int) {
        // TODO: Implement this method
    }
}

fun main() {
    val lfu = LFUCache(2)
    lfu.put(1, 1)
    lfu.put(2, 2)
    println("Get 1: ${lfu.get(1)}")
    lfu.put(3, 3)
    println("Get 2: ${lfu.get(2)}")
    println("Get 3: ${lfu.get(3)}")
    lfu.put(4, 4)
    println("Get 1: ${lfu.get(1)}")
    println("Get 3: ${lfu.get(3)}")
    println("Get 4: ${lfu.get(4)}")

    // Expected Output:
    // Get 1: 1
    // Get 2: -1
    // Get 3: 3
    // Get 1: -1
    // Get 3: 3
    // Get 4: 4
}

/*
// Solution Implementation

fun get(key: Int): Int {
    if (!keyToVal.containsKey(key)) {
        return -1
    }
    val count = keyToFreq[key]!!
    keyToFreq[key] = count + 1
    freqToKeys[count]!!.remove(key)
    if (count == minFreq && freqToKeys[count]!!.isEmpty()) {
        minFreq++
    }
    freqToKeys.getOrPut(count + 1) { LinkedHashSet() }.add(key)
    return keyToVal[key]!!
}

fun put(key: Int, value: Int) {
    if (capacity <= 0) {
        return
    }
    if (keyToVal.containsKey(key)) {
        keyToVal[key] = value
        get(key)
        return
    }
    if (keyToVal.size >= capacity) {
        val evict = freqToKeys[minFreq]!!.iterator().next()
        freqToKeys[minFreq]!!.remove(evict)
        keyToVal.remove(evict)
        keyToFreq.remove(evict)
    }
    keyToVal[key] = value
    keyToFreq[key] = 1
    minFreq = 1
    freqToKeys.getOrPut(1) { LinkedHashSet() }.add(key)
}
*/
