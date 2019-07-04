package com.company.Chapter2;

public class Q2_3 {

    public static void deleteMiddle(LinkedList list){
        int size = list.size();
        int middle = size<3 ? 0 : Math.floorDiv(size,2);

        if(middle>0){
            Node currentNode = list.head;
            int position = 1;
            while(currentNode != null){
                if(position == middle){
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
                position++;
            }
        }
    }
}
