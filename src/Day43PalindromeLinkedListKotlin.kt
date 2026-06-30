package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `Stack` and `Queue`?
 *
 * Explanation:
 * - `Stack`: LIFO (Last-In, First-Out). Elements are added and removed from the top.
 * - `Queue`: FIFO (First-In, First-Out). Elements are added at the rear and removed from the front.
 */

class ListNode(val `val`: Int, var next: ListNode? = null)

/**
 * Problem Description:
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example:
 * Input: 1->2->2->1
 * Output: true
 */
fun isPalindrome(head: ListNode?): Boolean {
    // TODO: Implement this method
    return false
}

fun main() {
    val head = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(2).apply {
                next = ListNode(1)
            }
        }
    }

    val result = isPalindrome(head)

    println("Is Palindrome: $result")

    // Expected Output:
    // Is Palindrome: true
}

/*
// Solution Implementation

fun isPalindrome(head: ListNode?): Boolean {
    if (head == null || head.next == null) {
        return true
    }

    // Find the middle of the linked list
    var slow = head
    var fast = head
    while (fast != null && fast.next != null) {
        slow = slow!!.next
        fast = fast.next!!.next
    }

    // Reverse the second half of the linked list
    var prev: ListNode? = null
    var current = slow
    while (current != null) {
        val nextTemp = current.next
        current.next = prev
        prev = current
        current = nextTemp
    }

    // Compare the first half and the reversed second half
    var p1 = head
    var p2 = prev
    while (p2 != null) {
        if (p1!!.`val` != p2.`val`) {
            return false
        }
        p1 = p1.next
        p2 = p2.next
    }

    return true
}
*/
