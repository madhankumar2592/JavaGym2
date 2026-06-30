/**
 * Interview Question:
 * What is the difference between `HashSet` and `TreeSet`?
 *
 * Explanation:
 * - `HashSet`: Backed by a hash table. Unordered. O(1) average time complexity for add/remove/contains.
 * - `TreeSet`: Backed by a red-black tree. Sorted. O(log N) time complexity for add/remove/contains.
 */

package com.interview.daily

class ListNode(val `val`: Int) {
    var next: ListNode? = null
}

/**
 * Problem Description:
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * Example:
 * Input:
 * A: a1->a2
 *            \
 *             c1->c2->c3
 *            /
 * B: b1->b2->b3
 * Output: c1
 */
fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    // TODO: Implement this method
    return null
}

fun main() {
    val c1 = ListNode(8)
    c1.next = ListNode(4)
    c1.next!!.next = ListNode(5)

    val a1 = ListNode(4)
    a1.next = ListNode(1)
    a1.next!!.next = c1

    val b1 = ListNode(5)
    b1.next = ListNode(6)
    b1.next!!.next = ListNode(1)
    b1.next!!.next!!.next = c1

    val result = getIntersectionNode(a1, b1)

    if (result != null) {
        println("Intersection Node: ${result.`val`}")
    } else {
        println("No Intersection")
    }

    // Expected Output:
    // Intersection Node: 8
}

/*
// Solution Implementation

fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    if (headA == null || headB == null) {
        return null
    }

    var a: ListNode? = headA
    var b: ListNode? = headB

    while (a != b) {
        a = if (a == null) headB else a.next
        b = if (b == null) headA else b.next
    }

    return a
}
*/
