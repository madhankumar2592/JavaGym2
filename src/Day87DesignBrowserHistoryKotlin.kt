package com.interview.daily

import java.util.Stack

/**
 * Interview Question:
 * How would you design a browser history feature?
 *
 * Explanation:
 * - A browser history feature allows users to navigate back and forward through visited pages.
 * - It's often implemented using two stacks: one for back history and one for forward history.
 * - When visiting a new page, the forward history is cleared.
 */

/**
 * Problem Description:
 * You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.
 * Implement the BrowserHistory class:
 * - BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
 * - void visit(string url) Visits url from the current page. It clears up all the forward history.
 * - string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
 * - string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.
 *
 * Example:
 * BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
 * browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
 * browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
 * browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
 * browserHistory.back(1);                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
 * browserHistory.back(1);                   // You are in "facebook.com", move back to "google.com" return "google.com"
 * browserHistory.forward(1);                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
 * browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
 * browserHistory.forward(2);                // You are in "linkedin.com", you cannot move forward any steps.
 * browserHistory.back(2);                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
 * browserHistory.back(7);                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
 */
class BrowserHistory(homepage: String) {
    private val backStack: Stack<String> = Stack()
    private val forwardStack: Stack<String> = Stack()
    private var current: String = homepage

    fun visit(url: String) {
        // TODO: Implement this method
    }

    fun back(steps: Int): String {
        // TODO: Implement this method
        return ""
    }

    fun forward(steps: Int): String {
        // TODO: Implement this method
        return ""
    }
}

fun main() {
    val browserHistory = BrowserHistory("leetcode.com")
    browserHistory.visit("google.com")
    browserHistory.visit("facebook.com")
    browserHistory.visit("youtube.com")
    println("Back 1: " + browserHistory.back(1))
    println("Back 1: " + browserHistory.back(1))
    println("Forward 1: " + browserHistory.forward(1))
    browserHistory.visit("linkedin.com")
    println("Forward 2: " + browserHistory.forward(2))
    println("Back 2: " + browserHistory.back(2))
    println("Back 7: " + browserHistory.back(7))

    // Expected Output:
    // Back 1: facebook.com
    // Back 1: google.com
    // Forward 1: facebook.com
    // Forward 2: linkedin.com
    // Back 2: google.com
    // Back 7: leetcode.com
}

/*
// Solution Implementation

fun visit(url: String) {
    backStack.push(current)
    current = url
    forwardStack.clear()
}

fun back(steps: Int): String {
    var remaining = steps
    while (remaining > 0 && backStack.isNotEmpty()) {
        forwardStack.push(current)
        current = backStack.pop()
        remaining--
    }
    return current
}

fun forward(steps: Int): String {
    var remaining = steps
    while (remaining > 0 && forwardStack.isNotEmpty()) {
        backStack.push(current)
        current = forwardStack.pop()
        remaining--
    }
    return current
}
*/
