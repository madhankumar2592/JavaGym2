package com.interview.daily;

import java.util.Stack;

/**
 * Interview Question:
 * How would you design a browser history feature?
 *
 * Explanation:
 * - A browser history feature allows users to navigate back and forward through visited pages.
 * - It's often implemented using two stacks: one for back history and one for forward history.
 * - When visiting a new page, the forward history is cleared.
 */

public class Day87DesignBrowserHistory {

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

    static class BrowserHistory {
        private Stack<String> backStack;
        private Stack<String> forwardStack;
        private String current;

        public BrowserHistory(String homepage) {
            backStack = new Stack<>();
            forwardStack = new Stack<>();
            current = homepage;
        }

        public void visit(String url) {
            // TODO: Implement this method
        }

        public String back(int steps) {
            // TODO: Implement this method
            return "";
        }

        public String forward(int steps) {
            // TODO: Implement this method
            return "";
        }
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        System.out.println("Back 1: " + browserHistory.back(1));
        System.out.println("Back 1: " + browserHistory.back(1));
        System.out.println("Forward 1: " + browserHistory.forward(1));
        browserHistory.visit("linkedin.com");
        System.out.println("Forward 2: " + browserHistory.forward(2));
        System.out.println("Back 2: " + browserHistory.back(2));
        System.out.println("Back 7: " + browserHistory.back(7));

        // Expected Output:
        // Back 1: facebook.com
        // Back 1: google.com
        // Forward 1: facebook.com
        // Forward 2: linkedin.com
        // Back 2: google.com
        // Back 7: leetcode.com
    }
}

/*
// Solution Implementation

public void visit(String url) {
    backStack.push(current);
    current = url;
    forwardStack.clear();
}

public String back(int steps) {
    while (steps > 0 && !backStack.isEmpty()) {
        forwardStack.push(current);
        current = backStack.pop();
        steps--;
    }
    return current;
}

public String forward(int steps) {
    while (steps > 0 && !forwardStack.isEmpty()) {
        backStack.push(current);
        current = forwardStack.pop();
        steps--;
    }
    return current;
}
*/
