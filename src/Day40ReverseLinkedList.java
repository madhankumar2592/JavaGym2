package com.interview.daily;

/**
 * Interview Question:
 * What is the difference between `iterative` and `recursive` approaches?
 *
 * Explanation:
 * - `iterative`: Uses loops (for, while) to repeat a block of code.
 * - `recursive`: Uses function calls to repeat a block of code.
 * - Iterative approaches are generally more memory-efficient (no stack overhead), while recursive approaches can be more concise and easier to understand for certain problems.
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Day40ReverseLinkedList {

    /**
     * Problem Description:
     * Reverse a singly linked list.
     *
     * Example:
     * Input: 1->2->3->4->5->NULL
     * Output: 5->4->3->2->1->NULL
     */

    public static ListNode reverseList(ListNode head) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = reverseList(head);

        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.println("null");

        // Expected Output:
        // 5->4->3->2->1->null
    }
}

/*
// Solution Implementation

public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    while (current != null) {
        ListNode nextTemp = current.next;
        current.next = prev;
        prev = current;
        current = nextTemp;
    }
    return prev;
}
*/
