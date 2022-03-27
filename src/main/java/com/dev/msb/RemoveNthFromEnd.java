package com.dev.msb;

import java.util.Arrays;
import java.util.List;

public class RemoveNthFromEnd {

    public static void main(String args[]) {
        ListNode head;
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        head = populateListNode(input);
        printListNode(head, "Remove 2nf element from List Node: ");
        head = removeNthFromEnd(head, 2);
        printListNode(head, "\nAfter: ");


        List<Integer> input2 = Arrays.asList(1, 2);
        head = populateListNode(input2);
        printListNode(head, "\nRemove 2nd element from List Node: ");
        head = removeNthFromEnd(head, 2);
        printListNode(head, "\nAfter: ");
    }

    private static ListNode populateListNode(List<Integer> input) {
        ListNode listNode = null;
        ListNode head = null;
        for (int i : input) {
            if (null == listNode) {
                head = new ListNode(i);
                listNode = head;
            } else {
                listNode.next = new ListNode(i);
                listNode = listNode.next;
            }
        }
        return head;
    }

    private static void printListNode(ListNode listNode, String message) {
        System.out.print(message);
        while (null != listNode) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tempHead = head;
        ListNode previousToNthElement = head;
        int size = 0;
        while (head != null) {
            if (size > n) {
                previousToNthElement = previousToNthElement.next;
            }

            head = head.next;
            size++;
        }

        if (n == size) {
            tempHead = tempHead.next;
        } else if (null != previousToNthElement.next) {
            previousToNthElement.next = previousToNthElement.next.next;
        } else {
            tempHead = null;
        }
        return tempHead;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
