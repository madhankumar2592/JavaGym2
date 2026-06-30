package com.interview.daily

/**
 * Interview Question:
 * What is a cycle in a linked list?
 *
 * Explanation:
 * - A cycle occurs when a node's `next` pointer points back to a previous node in the list.
 * - This creates an infinite loop if you try to traverse the list.
 */

/**
 * Problem Description:
 * Given a linked list, determine if it has a cycle in it.
 *
 * Example:
 * Input: 3->2->0->-4->2 (cycle)
 * Output: true
 */
fun hasCycle(head: ListNode?): Boolean {
    // TODO: Implement this method
    return false
}

fun main() {
    val head = ListNode(3)
    val node2 = ListNode(2)
    val node3 = ListNode(0)
    val node4 = ListNode(-4)

    head.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node2 // Cycle

    val result = hasCycle(head)

    println("Has Cycle: $result")

    // Expected Output:
    // Has Cycle: true
}

/*
// Solution Implementation

fun hasCycle(head: ListNode?): Boolean {
    if (head == null || head.next == null) {
        return false
    }
    var slow = head
    var fast = head.next
    while (slow != fast) {
        if (fast == null || fast.next == null) {
            return false
        }
        slow = slow?.next
        fast = fast.next?.next
    }
    return true
}
*/
