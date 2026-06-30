package com.interview.daily

/**
 * Interview Question:
 * How would you design a file system?
 *
 * Explanation:
 * - A file system organizes files and directories in a hierarchical structure.
 * - Key operations: create, read, write, delete.
 * - It's often implemented using a tree structure where each node represents a file or directory.
 */

/**
 * Problem Description:
 * You are asked to design a file system which provides two functions:
 * - createPath(path, value): Creates a new path and associates a value to it if possible and returns true. Returns false if the path already exists or its parent path doesn't exist.
 * - get(path): Returns the value associated with a path or returns -1 if the path doesn't exist.
 * The format of a path is one or more concatenated strings of the form: / followed by one or more lowercase English letters. For example, /leetcode and /leetcode/problems are valid paths while an empty string and / are not.
 *
 * Example:
 * FileSystem fileSystem = new FileSystem();
 * fileSystem.createPath("/a", 1); // return true
 * fileSystem.get("/a"); // return 1
 */
class FileSystem {
    private val paths = mutableMapOf<String, Int>()

    fun createPath(path: String, value: Int): Boolean {
        // TODO: Implement this method
        return false
    }

    fun get(path: String): Int {
        // TODO: Implement this method
        return -1
    }
}

fun main() {
    val fileSystem = FileSystem()
    println(fileSystem.createPath("/a", 1))
    println(fileSystem.get("/a"))
    println(fileSystem.createPath("/a/b", 2))
    println(fileSystem.get("/a/b"))
    println(fileSystem.createPath("/c/d", 3)) // false because /c doesn't exist
    println(fileSystem.get("/c")) // -1

    // Expected Output:
    // true
    // 1
    // true
    // 2
    // false
    // -1
}

/*
// Solution Implementation

fun createPath(path: String, value: Int): Boolean {
    if (path.isEmpty() || path == "/" || paths.containsKey(path)) {
        return false
    }

    val lastSlashIndex = path.lastIndexOf("/")
    val parent = path.substring(0, lastSlashIndex)

    if (parent.length > 1 && !paths.containsKey(parent)) {
        return false
    }

    paths[path] = value
    return true
}

fun get(path: String): Int {
    return paths.getOrDefault(path, -1)
}
*/
