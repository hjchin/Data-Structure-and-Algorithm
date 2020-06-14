package com.company.chapter2;

import java.util.Stack;

public class Q2_8 {

    /*
    Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
    beginning of the loop.
    DEFINITION
    Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so
    as to make a loop in the linked list.

    Revision: use HashMap is more appropriate
     */
    public static Node detectLoopNode(LinkedList list){
        Stack<Integer> nodeIds = new Stack<>();
        Node cNode = list.head;

        while(cNode != null){
            if(!nodeIds.contains(cNode.hashCode())){
                nodeIds.push(cNode.hashCode());
            }else{
               return cNode;
            }
            cNode = cNode.next;
        }

        return null;
    }


}
