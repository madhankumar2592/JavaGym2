package com.interview.daily;

/**
 * Interview Question:
 * What is the difference between `Stack` and `Queue`?
 *
 * Explanation:
 * - `Stack`: LIFO (Last-In, First-Out). Elements are added and removed from the top.
 * - `Queue`: FIFO (First-In, First-Out). Elements are added at the rear and removed from the front.
 */


public class Day43PalindromeLinkedList {

    /**
     * Problem Description:
     * Given a singly linked list, determine if it is a palindrome.
     *
     * Example:
     * Input: 1->2->2->1
     * Output: true
     */

    public static boolean isPalindrome(ListNode head) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        boolean result = isPalindrome(head);

        System.out.println("Is Palindrome: " + result);

        // Expected Output:
        // Is Palindrome: true
    }
}

/*
// Solution Implementation

public static boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
        return true;
    }

    // Find the middle of the linked list
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Reverse the second half of the linked list
    ListNode prev = null;
    ListNode current = slow;
    while (current != null) {
        ListNode nextTemp = current.next;
        current.next = prev;
        prev = current;
        current = nextTemp;
    }

    // Compare the first half and the reversed second half
    ListNode p1 = head;
    ListNode p2 = prev;
    while (p2 != null) {
        if (p1.val != p2.val) {
            return false;
        }
        p1 = p1.next;
        p2 = p2.next;
    }

    return true;
}
*/
