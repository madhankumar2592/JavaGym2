package com.interview.daily

/**
 * Interview Question:
 * What is the difference between `iterative` and `recursive` approaches?
 *
 * Explanation:
 * - `iterative`: Uses loops (for, while) to repeat a block of code.
 * - `recursive`: Uses function calls to repeat a block of code.
 * - Iterative approaches are generally more memory-efficient (no stack overhead), while recursive approaches can be more concise and easier to understand for certain problems.
 */

class ListNode(val `val`: Int) {
    var next: ListNode? = null
}

/**
 * Problem Description:
 * Reverse a singly linked list.
 *
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 */
fun reverseList(head: ListNode?): ListNode? {
    // TODO: Implement this method
    return null
}

fun main() {
    val head = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(3).apply {
                next = ListNode(4).apply {
                    next = ListNode(5)
                }
            }
        }
    }

    var result = reverseList(head)

    while (result != null) {
        print("${result.`val`}->")
        result = result.next
    }
    println("null")

    // Expected Output:
    // 5->4->3->2->1->null
}

/*
// Solution Implementation

fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var current = head
    while (current != null) {
        val nextTemp = current.next
        current.next = prev
        prev = current
        current = nextTemp
    }
    return prev
}
*/
