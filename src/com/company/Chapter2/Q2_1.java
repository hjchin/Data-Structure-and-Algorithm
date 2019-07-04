package com.company.Chapter2;

import sun.awt.image.ImageWatched;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Q2_1 {

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

    public static com.company.Chapter2.LinkedList removeDuplicate2(com.company.Chapter2.LinkedList list){
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

    public static com.company.Chapter2.LinkedList removeDuplicate3(com.company.Chapter2.LinkedList list){

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
