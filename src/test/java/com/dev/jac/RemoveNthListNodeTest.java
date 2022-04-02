package com.dev.jac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthListNodeTest {

    RemoveNthListNode removeNthListNode;

    @BeforeEach
    void setUp() {
        removeNthListNode = new RemoveNthListNode();
    }

    @Test
    @DisplayName("removeNthFromEnd1")
    void removeNthFromEnd1() {
        RemoveNthListNode.ListNode fifth = new RemoveNthListNode.ListNode(5);
        RemoveNthListNode.ListNode fourth = new RemoveNthListNode.ListNode(4, fifth);
        RemoveNthListNode.ListNode third = new RemoveNthListNode.ListNode(3, fourth);
        RemoveNthListNode.ListNode second = new RemoveNthListNode.ListNode(2, third);
        RemoveNthListNode.ListNode first = new RemoveNthListNode.ListNode(1, second);

        int n = 2;
        List<Integer> expected = List.of(1, 2, 3, 5);
        RemoveNthListNode.ListNode resultHead = removeNthListNode.removeNthFromEnd(first, n);
        assertEquals(expected, getNodes(resultHead), "Should remove 1st element from last ");
    }

    @Test
    @DisplayName("removeNthFromEnd2")
    void removeNthFromEnd2() {
        RemoveNthListNode.ListNode first = new RemoveNthListNode.ListNode(1);
        int n = 1;
        List<Integer> expected = List.of();
        RemoveNthListNode.ListNode resultHead = removeNthListNode.removeNthFromEnd(first, n);
        assertEquals(expected, getNodes(resultHead), "Should remove 1st element from last ");
    }

    private List<Integer> getNodes(RemoveNthListNode.ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }

}