package com.interview.daily;

/**
 * Interview Question:
 * What is a cycle in a linked list?
 *
 * Explanation:
 * - A cycle occurs when a node's `next` pointer points back to a previous node in the list.
 * - This creates an infinite loop if you try to traverse the list.
 */



public class Day39LinkedListCycle {

    /**
     * Problem Description:
     * Given a linked list, determine if it has a cycle in it.
     *
     * Example:
     * Input: 3->2->0->-4->2 (cycle)
     * Output: true
     */

    public static boolean hasCycle(com.interview.daily.ListNode head) {
        // TODO: Implement this method
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Cycle

        boolean result = hasCycle(head);

        System.out.println("Has Cycle: " + result);

        // Expected Output:
        // Has Cycle: true
    }
}

/*
// Solution Implementation

public static boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
        return false;
    }
    ListNode slow = head;
    ListNode fast = head.next;
    while (slow != fast) {
        if (fast == null || fast.next == null) {
            return false;
        }
        slow = slow.next;
        fast = fast.next.next;
    }
    return true;
}
*/
