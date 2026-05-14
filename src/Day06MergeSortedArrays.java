package com.interview.daily;

import java.util.Arrays;

/**
 * Interview Question:
 * What is the difference between ArrayList and LinkedList?
 *
 * Explanation:
 * - ArrayList: Backed by a dynamic array. Fast random access (get(i) is O(1)). Slow insertions/deletions in the middle (O(N)).
 * - LinkedList: Backed by a doubly linked list. Slow random access (get(i) is O(N)). Fast insertions/deletions (O(1) if you have the node).
 */

public class Day06MergeSortedArrays {

    /**
     * Problem Description:
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
     * representing the number of elements in nums1 and nums2 respectively.
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
     * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
     * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     *
     * Example:
     * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * Output: [1,2,2,3,5,6]
     */

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // TODO: Implement this method
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));

        // Expected Output:
        // Merged Array: [1, 2, 2, 3, 5, 6]
    }
}

/*
// Solution Implementation

public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    int p = m + n - 1;

    while (p1 >= 0 && p2 >= 0) {
        if (nums1[p1] > nums2[p2]) {
            nums1[p] = nums1[p1];
            p1--;
        } else {
            nums1[p] = nums2[p2];
            p2--;
        }
        p--;
    }

    while (p2 >= 0) {
        nums1[p] = nums2[p2];
        p2--;
        p--;
    }
}
*/
