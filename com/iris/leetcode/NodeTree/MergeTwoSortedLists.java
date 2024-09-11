package com.iris.leetcode.NodeTree;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to simplify the code
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Iterate through both lists
        while (list1 != null && list2 != null) {
            // Compare the values of the current nodes in both lists
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach the remaining part of list1 or list2 (if any)
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        // The merged list starts from dummy.next
        return dummy.next;
    }

    public static void main(String[] args) {
        // Example 1: list1 = [1,2,4], list2 = [1,3,4]
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        printList(mergedList); // Output: [1,1,2,3,4,4]
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
