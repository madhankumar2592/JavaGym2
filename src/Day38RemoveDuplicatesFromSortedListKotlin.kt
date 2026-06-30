package com.interview.daily

/**
 * Interview Question:
 * What is a `ListNode`?
 *
 * Explanation:
 * - A `ListNode` is a basic building block for linked lists.
 * - It contains a value and a reference (pointer) to the next node in the list.
 */

/**
 * Problem Description:
 * Given a sorted linked list, delete all duplicates such that each element appears only once.
 *
 * Example:
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */
fun deleteDuplicates(head: ListNode?): ListNode? {
    TODO("Implement this method")
}

fun main() {
    val head = ListNode(1)
    head.next = ListNode(1)
    head.next!!.next = ListNode(2)
    head.next!!.next!!.next = ListNode(3)
    head.next!!.next!!.next!!.next = ListNode(3)

    var result = deleteDuplicates(head)

    while (result != null) {
        print("${result.val}->")
        result = result.next
    }
    println("null")

    // Expected Output:
    // 1->2->3->null
}

/*
// Solution Implementation

fun deleteDuplicates(head: ListNode?): ListNode? {
    var current = head
    while (current != null && current.next != null) {
        if (current.`val` == current.next!!.`val`) {
            current.next = current.next!!.next
        } else {
            current = current.next
        }
    }
    return head
}
*/
