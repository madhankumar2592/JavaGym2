package com.interview.daily;

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

public class Day64ImplementTrie {

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

    static class Trie {
        private class TrieNode {
            private TrieNode[] children;
            private boolean isEndOfWord;

            public TrieNode() {
                children = new TrieNode[26]; // Assuming lowercase English letters
                isEndOfWord = false;
            }
        }

        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            // TODO: Implement this method
        }

        public boolean search(String word) {
            // TODO: Implement this method
            return false;
        }

        public boolean startsWith(String prefix) {
            // TODO: Implement this method
            return false;
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println("Search 'apple': " + trie.search("apple"));
        System.out.println("Search 'app': " + trie.search("app"));
        System.out.println("StartsWith 'app': " + trie.startsWith("app"));
        trie.insert("app");
        System.out.println("Search 'app': " + trie.search("app"));

        // Expected Output:
        // Search 'apple': true
        // Search 'app': false
        // StartsWith 'app': true
        // Search 'app': true
    }
}

/*
// Solution Implementation

public void insert(String word) {
    TrieNode current = root;
    for (char c : word.toCharArray()) {
        int index = c - 'a';
        if (current.children[index] == null) {
            current.children[index] = new TrieNode();
        }
        current = current.children[index];
    }
    current.isEndOfWord = true;
}

public boolean search(String word) {
    TrieNode node = searchNode(word);
    return node != null && node.isEndOfWord;
}

public boolean startsWith(String prefix) {
    return searchNode(prefix) != null;
}

private TrieNode searchNode(String str) {
    TrieNode current = root;
    for (char c : str.toCharArray()) {
        int index = c - 'a';
        if (current.children[index] == null) {
            return null;
        }
        current = current.children[index];
    }
    return current;
}
*/
