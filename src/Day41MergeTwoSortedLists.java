package com.interview.daily;

/**
 * Interview Question:
 * What is a dummy node in a linked list?
 *
 * Explanation:
 * - A dummy node is a placeholder node used to simplify list manipulation.
 * - It's often used as a temporary head to avoid special handling for the first node.
 */



public class Day41MergeTwoSortedLists {

    /**
     * Problem Description:
     * Merge two sorted linked lists and return it as a new sorted list.
     *
     * Example:
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     */

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(l1, l2);

        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.println("null");

        // Expected Output:
        // 1->1->2->3->4->4->null
    }
}

/*
// Solution Implementation

public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    while (l1 != null && l2 != null) {
        if (l1.val < l2.val) {
            current.next = l1;
            l1 = l1.next;
        } else {
            current.next = l2;
            l2 = l2.next;
        }
        current = current.next;
    }

    if (l1 != null) {
        current.next = l1;
    } else {
        current.next = l2;
    }

    return dummy.next;
}
*/
