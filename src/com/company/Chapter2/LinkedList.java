package com.company.Chapter2;

public class LinkedList {
    Node head;

    public int size(){
        int count = 0;
        Node currentNode = head;
        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }
}
