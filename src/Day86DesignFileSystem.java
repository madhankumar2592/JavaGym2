package com.interview.daily;

import java.util.HashMap;
import java.util.Map;

/**
 * Interview Question:
 * How would you design a file system?
 *
 * Explanation:
 * - A file system organizes files and directories in a hierarchical structure.
 * - Key operations: create, read, write, delete.
 * - It's often implemented using a tree structure where each node represents a file or directory.
 */

public class Day86DesignFileSystem {

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

    static class FileSystem {
        private Map<String, Integer> paths;

        public FileSystem() {
            paths = new HashMap<>();
        }

        public boolean createPath(String path, int value) {
            // TODO: Implement this method
            return false;
        }

        public int get(String path) {
            // TODO: Implement this method
            return -1;
        }
    }

    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();
        System.out.println(fileSystem.createPath("/a", 1));
        System.out.println(fileSystem.get("/a"));
        System.out.println(fileSystem.createPath("/a/b", 2));
        System.out.println(fileSystem.get("/a/b"));
        System.out.println(fileSystem.createPath("/c/d", 3)); // false because /c doesn't exist
        System.out.println(fileSystem.get("/c")); // -1

        // Expected Output:
        // true
        // 1
        // true
        // 2
        // false
        // -1
    }
}

/*
// Solution Implementation

public boolean createPath(String path, int value) {
    if (path.isEmpty() || path.equals("/") || paths.containsKey(path)) {
        return false;
    }

    int lastSlashIndex = path.lastIndexOf("/");
    String parent = path.substring(0, lastSlashIndex);

    if (parent.length() > 1 && !paths.containsKey(parent)) {
        return false;
    }

    paths.put(path, value);
    return true;
}

public int get(String path) {
    return paths.getOrDefault(path, -1);
}
*/
