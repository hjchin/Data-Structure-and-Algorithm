package com.company.chapter2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Q2_1 {

    /*
    R�mov� Dups! Write code to remove duplicates from an unsorted linked list.
    FOLLOW UP
    How would you solve this problem if a temporary buffer is not allowed?
     */

    public static LinkedList<Integer> removeDuplicate(LinkedList<Integer> list){

        Iterator<Integer> iterator = list.iterator();
        HashSet<Integer> set = new HashSet<>();

        while(iterator.hasNext()){
            Integer value = iterator.next();
            if(set.contains(value)){
                iterator.remove();
            }else{
                set.add(value);
            }
        }

        return list;
    }

    public static com.company.chapter2.LinkedList removeDuplicate2(com.company.chapter2.LinkedList list){
        HashSet<Integer> set = new HashSet<>();

        Node currentNode = list.head;
        Node previousNode = list.head;

        while(currentNode != null){
            if(set.contains(currentNode.value)){
                previousNode.next = currentNode.next;
                currentNode = currentNode.next;
                continue;
            }else{
                set.add(currentNode.value);
            }

            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        return list;
    }

    public static com.company.chapter2.LinkedList removeDuplicate3(com.company.chapter2.LinkedList list){

        Node currentNode = list.head;

        while(currentNode != null){

            Node runnerNode = currentNode.next;
            Node previousRunnerNode = currentNode;

            while(runnerNode != null){
                if(runnerNode.value == currentNode.value){
                    previousRunnerNode.next = runnerNode.next;
                }else{
                    previousRunnerNode = runnerNode;
                }
                runnerNode = runnerNode.next;
            }


            currentNode = currentNode.next;
        }

        return list;
    }
}
