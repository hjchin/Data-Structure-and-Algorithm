package com.company.chapter2;

public class Q2_2 {

    /*
    Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
     */

    public static Node getLastKthNode(LinkedList list, int position) throws Exception {

        int total = list.size();
        int frontPosition = total - position + 1;

        if (frontPosition < 1) {
            throw new Exception("out of position exception");
        }

        int positionTracker = 1;
        Node currentNode = list.head;
        Node searchNode = currentNode;

        while (currentNode != null) {
            if (positionTracker == frontPosition) {
                searchNode = currentNode;
                break;
            } else {
                currentNode = currentNode.next;
                positionTracker++;
            }
        }

        return searchNode;
    }
}
