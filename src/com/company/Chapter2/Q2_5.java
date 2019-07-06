package com.company.Chapter2;

public class Q2_5 {

    public static LinkedList sum(LinkedList list1, LinkedList list2){

        int list1Len = list1.size();
        int list2Len = list2.size();
        LinkedList longList;
        LinkedList shortList;
        LinkedList answerList = new LinkedList();
        answerList.head = new Node();

        if(list1Len > list2Len){
            longList = list1;
            shortList = list2;
        }else{
            longList = list2;
            shortList = list1;
        }

        Node cNodeNum1 = longList.head;
        Node cNodeNum2 = shortList.head;
        Node cNodeAnswer = answerList.head;

        while(cNodeNum1 != null){

            int carryForward = 0;
            if(cNodeNum2 != null){
                int digitSum = cNodeAnswer.value + cNodeNum2.value + cNodeNum1.value;
                if(digitSum <10){
                    cNodeAnswer.value = digitSum;
                }else{
                    cNodeAnswer.value = digitSum%10;
                    carryForward = digitSum/10;
                }
                cNodeNum2 = cNodeNum2.next;
            }else{
                int digitSum = cNodeNum1.value+ cNodeAnswer.value;
                if(digitSum <10){
                    cNodeAnswer.value = digitSum;
                }else{
                    cNodeAnswer.value = digitSum%10;
                    carryForward = digitSum/10;
                }
            }

            if(carryForward > 0){
                Node nNode = new Node();
                nNode.value = carryForward;
                cNodeAnswer.next = nNode;
                cNodeAnswer = nNode;
            }else if(cNodeNum1.next != null){
                Node nNode = new Node();
                cNodeAnswer = nNode;
            }

            cNodeNum1 = cNodeNum1.next;
        }


        return answerList;
    }

    public static Node sum2(Node node1, Node node2, int carry){

        int sum = calc(node1, node2, carry);
        int digit = sum % 10;
        int carryOver = sum/10;

        Node aNode = new Node();
        aNode.value = digit;

        if(node1 != null || node2 != null || carry != 0){
            Node next1 = node1 != null ? node1.next : null;
            Node next2 = node2 != null ? node2.next : null;
            aNode.next = sum2(next1, next2, carryOver);
        }else if(digit == 0){
            aNode = null;
        }

        return aNode;
    }

    public static int calc(Node n1, Node n2, int carry){
        if(n1 != null && n2 != null){
            return n1.value + n2.value + carry;
        }else if(n1 != null){
            return n1.value + carry;
        }else if(n2 != null){
            return n2.value + carry;
        }else{
            return carry;
        }
    }

}
