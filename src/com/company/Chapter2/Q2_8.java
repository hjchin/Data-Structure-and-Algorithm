package com.company.Chapter2;

import java.util.Stack;

public class Q2_8 {

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
