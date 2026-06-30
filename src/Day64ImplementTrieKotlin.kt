package com.interview.daily

/**
 * Interview Question:
 * What is a Trie?
 *
 * Explanation:
 * - A Trie (pronounced "try") is a tree-based data structure used for efficient retrieval of keys in a dataset of strings.
 * - It's also known as a prefix tree.
 * - Each node represents a character of a string.
 * - It's commonly used for autocomplete and spell checking.
 */

/**
 * Problem Description:
 * Implement a Trie with insert, search, and startsWith methods.
 *
 * Example:
 * Trie trie = new Trie();
 * trie.insert("apple");
 * trie.search("apple");   // returns true
 * trie.search("app");     // returns false
 * trie.startsWith("app"); // returns true
 * trie.insert("app");
 * trie.search("app");     // returns true
 */
class Trie {
    private inner class TrieNode {
        val children: Array<TrieNode?> = arrayOfNulls(26) // Assuming lowercase English letters
        var isEndOfWord: Boolean = false
    }

    private val root: TrieNode = TrieNode()

    fun insert(word: String) {
        // TODO: Implement this method
    }

    fun search(word: String): Boolean {
        // TODO: Implement this method
        return false
    }

    fun startsWith(prefix: String): Boolean {
        // TODO: Implement this method
        return false
    }
}

fun main() {
    val trie = Trie()
    trie.insert("apple")
    println("Search 'apple': ${trie.search("apple")}")
    println("Search 'app': ${trie.search("app")}")
    println("StartsWith 'app': ${trie.startsWith("app")}")
    trie.insert("app")
    println("Search 'app': ${trie.search("app")}")

    // Expected Output:
    // Search 'apple': true
    // Search 'app': false
    // StartsWith 'app': true
    // Search 'app': true
}

/*
// Solution Implementation

fun insert(word: String) {
    var current = root
    for (c in word) {
        val index = c - 'a'
        if (current.children[index] == null) {
            current.children[index] = TrieNode()
        }
        current = current.children[index]!!
    }
    current.isEndOfWord = true
}

fun search(word: String): Boolean {
    val node = searchNode(word)
    return node != null && node.isEndOfWord
}

fun startsWith(prefix: String): Boolean {
    return searchNode(prefix) != null
}

private fun searchNode(str: String): TrieNode? {
    var current = root
    for (c in str) {
        val index = c - 'a'
        current = current.children[index] ?: return null
    }
    return current
}
*/
