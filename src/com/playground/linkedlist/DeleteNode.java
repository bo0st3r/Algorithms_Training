package com.playground.linkedlist;

import com.playground.Algorithm;
import com.playground.linkedlist.model.LinkedListIntegerNode;

// Environment:
// Start from the node to delete (no access to the head node directly)
// Node to delete isn't a tail node
// Source: https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/
public class DeleteNode implements Algorithm {

    @Override
    public void execute() {
        LinkedListIntegerNode head, nodeToDelete, node2, node3, end;

        // Case 1 - Generate linked list such as [4, 5 (target), 1, 9]
        end = new LinkedListIntegerNode(9);
        node3 = new LinkedListIntegerNode(1, end);
        nodeToDelete = new LinkedListIntegerNode(5, node3);
        head = new LinkedListIntegerNode(4, nodeToDelete);

        // Case 2 - Generate linked list such as [4, 5, 1 (target), 9]
//        end = new LinkedListIntegerNode(9);
//        nodeToDelete = new LinkedListIntegerNode(1, end);
//        node2 = new LinkedListIntegerNode(5, nodeToDelete);
//        head = new LinkedListIntegerNode(4, node2);

        // Case 3 - Generate linked list such as [0 (target), 1]
//        end = new LinkedListIntegerNode(1);
//        head = new LinkedListIntegerNode(0, end);
//        nodeToDelete = head;

        // Case 4 - Generate linked list such as [-3 (target), 5, -99]
//        end = new LinkedListIntegerNode(-99);
//        node2 = new LinkedListIntegerNode(5, end);
//        head = new LinkedListIntegerNode(-3, node2);
//        nodeToDelete = head;

        // Delete node within the list
        LinkedListIntegerNode current = nodeToDelete;
        LinkedListIntegerNode next;
        while (current.hasNext()) {
            next = current.next();
            current.setValue(next.getValue());
            current.setNext(next.next());
            current = next;
        }

        System.out.println("--------");
        current = head;
        while (current.hasNext()) {
            System.out.println(current.getValue());
            current = current.next();
        }
        System.out.println(current.getValue());
    }
}
