package com.company.chapter2;

public class Q2_3 {

    /*
    Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
    the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
    that node.
     */

    public static void deleteMiddle(LinkedList list) {
        int size = list.size();
        int middle = size < 3 ? 0 : Math.floorDiv(size, 2);

        if (middle > 0) {
            Node currentNode = list.head;
            int position = 1;
            while (currentNode != null) {
                if (position == middle) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
                position++;
            }
        }
    }
}
