package com.interview.daily;

/**
 * Interview Question:
 * What is a `ListNode`?
 *
 * Explanation:
 * - A `ListNode` is a basic building block for linked lists.
 * - It contains a value and a reference (pointer) to the next node in the list.
 */



public class Day38RemoveDuplicatesFromSortedList {

    /**
     * Problem Description:
     * Given a sorted linked list, delete all duplicates such that each element appears only once.
     *
     * Example:
     * Input: 1->1->2->3->3
     * Output: 1->2->3
     */

    public static com.interview.daily.ListNode deleteDuplicates(com.interview.daily.ListNode head) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = deleteDuplicates(head);

        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.println("null");

        // Expected Output:
        // 1->2->3->null
    }
}

/*
// Solution Implementation

public static ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    while (current != null && current.next != null) {
        if (current.val == current.next.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    return head;
}
*/
