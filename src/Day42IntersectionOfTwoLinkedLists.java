

/**
 * Interview Question:
 * What is the difference between `HashSet` and `TreeSet`?
 *
 * Explanation:
 * - `HashSet`: Backed by a hash table. Unordered. O(1) average time complexity for add/remove/contains.
 * - `TreeSet`: Backed by a red-black tree. Sorted. O(log N) time complexity for add/remove/contains.
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Day42IntersectionOfTwoLinkedLists {

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

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // TODO: Implement this method
        return null;
    }

    public static void main(String[] args) {
        ListNode c1 = new ListNode(8);
        c1.next = new ListNode(4);
        c1.next.next = new ListNode(5);

        ListNode a1 = new ListNode(4);
        a1.next = new ListNode(1);
        a1.next.next = c1;

        ListNode b1 = new ListNode(5);
        b1.next = new ListNode(6);
        b1.next.next = new ListNode(1);
        b1.next.next.next = c1;

        ListNode result = getIntersectionNode(a1, b1);

        if (result != null) {
            System.out.println("Intersection Node: " + result.val);
        } else {
            System.out.println("No Intersection");
        }

        // Expected Output:
        // Intersection Node: 8
    }
}

/*
// Solution Implementation

public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
        return null;
    }

    ListNode a = headA;
    ListNode b = headB;

    while (a != b) {
        a = (a == null) ? headB : a.next;
        b = (b == null) ? headA : b.next;
    }

    return a;
}
*/
