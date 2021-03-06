package com.company.chapter2;

import java.util.Stack;

public class Q2_7 {

    /*
    Intersection: Given two (singly) linked lists, determine if the two lists intersect.
    Return the intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth
    node of the first linked list is the exact same node (by reference) as the jth node of the second
    linked list, then they are intersecting.
     */

    public static boolean isIntersect(LinkedList l1, LinkedList l2) {

        Node cNode1 = l1.head;
        Stack<Integer> nodeId = new Stack<>();

        while (cNode1 != null) {
            nodeId.push(cNode1.hashCode());
            cNode1 = cNode1.next;
        }

        Node cNode2 = l2.head;

        while (cNode2 != null) {
            if (nodeId.contains(cNode2.hashCode())) {
                return true;
            }
            cNode2 = cNode2.next;
        }

        return false;
    }
}
