package com.interview.daily

/**
 * Interview Question:
 * What is a dummy node in a linked list?
 *
 * Explanation:
 * - A dummy node is a placeholder node used to simplify list manipulation.
 * - It's often used as a temporary head to avoid special handling for the first node.
 */

class ListNode(val val_: Int) {
    var next: ListNode? = null
}

/**
 * Problem Description:
 * Merge two sorted linked lists and return it as a new sorted list.
 *
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    TODO("Implement this method")
}

fun main() {
    val l1 = ListNode(1).also {
        it.next = ListNode(2).also { n -> n.next = ListNode(4) }
    }

    val l2 = ListNode(1).also {
        it.next = ListNode(3).also { n -> n.next = ListNode(4) }
    }

    var result = mergeTwoLists(l1, l2)

    while (result != null) {
        print("${result.val_}->")
        result = result.next
    }
    println("null")

    // Expected Output:
    // 1->1->2->3->4->4->null
}

/*
// Solution Implementation

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    val dummy = ListNode(0)
    var current = dummy
    var p1 = l1
    var p2 = l2

    while (p1 != null && p2 != null) {
        if (p1.val_ < p2.val_) {
            current.next = p1
            p1 = p1.next
        } else {
            current.next = p2
            p2 = p2.next
        }
        current = current.next!!
    }

    current.next = p1 ?: p2

    return dummy.next
}
*/
