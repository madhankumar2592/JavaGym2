package com.interview.daily

/**
 * Interview Question:
 * What is an LRU Cache?
 *
 * Explanation:
 * - An LRU (Least Recently Used) Cache is a cache replacement policy that discards the least recently used items first.
 * - It's often implemented using a combination of a HashMap and a Doubly Linked List.
 * - The HashMap provides O(1) access to items, while the Doubly Linked List maintains the order of usage.
 */

/**
 * Problem Description:
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * Implement the LRUCache class:
 * - LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * - int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * - void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * The functions get and put must each run in O(1) average time complexity.
 *
 * Example:
 * LRUCache lRUCache = new LRUCache(2);
 * lRUCache.put(1, 1); // cache is {1=1}
 * lRUCache.put(2, 2); // cache is {1=1, 2=2}
 * lRUCache.get(1);    // return 1
 * lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
 * lRUCache.get(2);    // returns -1 (not found)
 * lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
 * lRUCache.get(1);    // return -1 (not found)
 * lRUCache.get(3);    // return 3
 * lRUCache.get(4);    // return 4
 */
class LRUCache(private val capacity: Int) {

    inner class Node(var key: Int, var value: Int) {
        var prev: Node? = null
        var next: Node? = null
    }

    private val map = HashMap<Int, Node>()
    private val head = Node(0, 0)
    private val tail = Node(0, 0)

    init {
        head.next = tail
        tail.prev = head
    }

    fun get(key: Int): Int {
        TODO("Implement this method")
    }

    fun put(key: Int, value: Int) {
        TODO("Implement this method")
    }

    private fun remove(node: Node) {
        node.prev!!.next = node.next
        node.next!!.prev = node.prev
    }

    private fun add(node: Node) {
        node.next = head.next
        node.next!!.prev = node
        head.next = node
        node.prev = head
    }
}

fun main() {
    val lRUCache = LRUCache(2)
    lRUCache.put(1, 1)
    lRUCache.put(2, 2)
    println("Get 1: ${lRUCache.get(1)}")
    lRUCache.put(3, 3)
    println("Get 2: ${lRUCache.get(2)}")
    lRUCache.put(4, 4)
    println("Get 1: ${lRUCache.get(1)}")
    println("Get 3: ${lRUCache.get(3)}")
    println("Get 4: ${lRUCache.get(4)}")

    // Expected Output:
    // Get 1: 1
    // Get 2: -1
    // Get 1: -1
    // Get 3: 3
    // Get 4: 4
}

/*
// Solution Implementation

fun get(key: Int): Int {
    if (map.containsKey(key)) {
        val node = map[key]!!
        remove(node)
        add(node)
        return node.value
    }
    return -1
}

fun put(key: Int, value: Int) {
    if (map.containsKey(key)) {
        remove(map[key]!!)
    }
    if (map.size == capacity) {
        remove(tail.prev!!)
        map.remove(tail.prev!!.key)
    }
    val node = Node(key, value)
    add(node)
    map[key] = head.next!!
}
*/
