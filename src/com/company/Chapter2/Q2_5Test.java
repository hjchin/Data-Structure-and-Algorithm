package com.company.Chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_5Test {

    @Test
    public void test1(){
        LinkedList list1 = new LinkedList();
        Node node1 = new Node();
        node1.value = 0;
        list1.head = node1;

        LinkedList list2 = new LinkedList();
        Node node2 = new Node();
        node2.value = 0;
        list2.head = node2;

        LinkedList answer = Q2_5.sum(list1, list2);
        assertEquals(0,answer.head.value);
    }

    @Test
    public void test2(){
        LinkedList list1 = new LinkedList();
        Node node1 = new Node();
        node1.value = 0;
        list1.head = node1;

        LinkedList list2 = new LinkedList();
        Node node2 = new Node();
        node2.value = 1;
        list2.head = node2;

        LinkedList answer = Q2_5.sum(list1, list2);
        assertEquals(1,answer.head.value);
    }

    @Test
    public void test3(){
        LinkedList list1 = new LinkedList();
        Node node1 = new Node();
        node1.value = 9;
        list1.head = node1;

        LinkedList list2 = new LinkedList();
        Node node2 = new Node();
        node2.value = 9;
        list2.head = node2;

        LinkedList answer = Q2_5.sum(list1, list2);
        assertEquals(8,answer.head.value);
        assertEquals(1,answer.head.next.value);
    }

    @Test
    public void test4(){
        LinkedList list1 = new LinkedList();
        Node node1_2 = new Node();
        node1_2.value = 1;
        Node node1 = new Node();
        node1.value = 5;
        node1.next = node1_2;
        list1.head = node1;

        LinkedList list2 = new LinkedList();
        Node node2_2 = new Node();
        node2_2.value = 1;
        Node node2 = new Node();
        node2.value = 5;
        node2.next = node2_2;
        list2.head = node2;

        LinkedList answer = Q2_5.sum(list1, list2);
        assertEquals(0,answer.head.value);
        assertEquals(3,answer.head.next.value);
    }

    @Test
    public void test5(){
        LinkedList list1 = new LinkedList();
        Node node1_3 = new Node();
        node1_3.value = 6;
        Node node1_2 = new Node();
        node1_2.value = 1;
        node1_2.next = node1_3;
        Node node1 = new Node();
        node1.value = 7;
        node1.next = node1_2;
        list1.head = node1;

        LinkedList list2 = new LinkedList();
        Node node2_3 = new Node();
        node2_3.value = 2;
        Node node2_2 = new Node();
        node2_2.value = 9;
        node2_2.next = node2_3;
        Node node2 = new Node();
        node2.value = 5;
        node2.next = node2_2;
        list2.head = node2;

        LinkedList answer = Q2_5.sum(list1, list2);
        assertEquals(3, answer.size());
        assertEquals(2,answer.head.value);
        assertEquals(1,answer.head.next.value);
        assertEquals(9,answer.head.next.next.value);
    }

    @Test
    public void test6(){
        LinkedList list1 = new LinkedList();
        Node node1_2 = new Node();
        node1_2.value = 1;
        Node node1 = new Node();
        node1.value = 7;
        node1.next = node1_2;
        list1.head = node1;

        LinkedList list2 = new LinkedList();
        Node node2_3 = new Node();
        node2_3.value = 2;
        Node node2_2 = new Node();
        node2_2.value = 9;
        node2_2.next = node2_3;
        Node node2 = new Node();
        node2.value = 5;
        node2.next = node2_2;
        list2.head = node2;

        LinkedList answer = Q2_5.sum(list1, list2);
        assertEquals(3, answer.size());
        assertEquals(2,answer.head.value);
        assertEquals(1,answer.head.next.value);
        assertEquals(3,answer.head.next.next.value);
    }

    @Test
    public void test7(){
        LinkedList list1 = new LinkedList();
        Node node1_3 = new Node();
        node1_3.value = 6;
        Node node1_2 = new Node();
        node1_2.value = 1;
        node1_2.next = node1_3;
        Node node1 = new Node();
        node1.value = 7;
        node1.next = node1_2;
        list1.head = node1;

        LinkedList list2 = new LinkedList();
        Node node2_3 = new Node();
        node2_3.value = 2;
        Node node2_2 = new Node();
        node2_2.value = 9;
        node2_2.next = node2_3;
        Node node2 = new Node();
        node2.value = 5;
        node2.next = node2_2;
        list2.head = node2;

        Node an = Q2_5.sum2(list1.head, list2.head, 0);
        LinkedList answer = new LinkedList();
        answer.head = an;
        assertEquals(3, answer.size());
        assertEquals(2,answer.head.value);
        assertEquals(1,answer.head.next.value);
        assertEquals(9,answer.head.next.next.value);
    }

    @Test
    public void test8(){
        LinkedList list1 = new LinkedList();
        Node node1_2 = new Node();
        node1_2.value = 1;
        Node node1 = new Node();
        node1.value = 7;
        node1.next = node1_2;
        list1.head = node1;

        LinkedList list2 = new LinkedList();
        Node node2_3 = new Node();
        node2_3.value = 2;
        Node node2_2 = new Node();
        node2_2.value = 9;
        node2_2.next = node2_3;
        Node node2 = new Node();
        node2.value = 5;
        node2.next = node2_2;
        list2.head = node2;

        Node an = Q2_5.sum2(list1.head, list2.head,0);
        LinkedList answer = new LinkedList();
        answer.head = an;
        assertEquals(3, answer.size());
        assertEquals(2,answer.head.value);
        assertEquals(1,answer.head.next.value);
        assertEquals(3,answer.head.next.next.value);
    }

    @Test
    public void test9(){
        LinkedList list1 = new LinkedList();
        Node node1_2 = new Node();
        node1_2.value = 1;
        Node node1 = new Node();
        node1.value = 7;
        node1.next = node1_2;
        list1.head = node1;

        LinkedList list2 = new LinkedList();
        Node node2_3 = new Node();
        node2_3.value = 2;
        Node node2_2 = new Node();
        node2_2.value = 9;
        node2_2.next = node2_3;
        Node node2 = new Node();
        node2.value = 5;
        node2.next = node2_2;
        list2.head = node2;

        Node an = Q2_5.sum2(list2.head, list1.head,0);
        LinkedList answer = new LinkedList();
        answer.head = an;
        assertEquals(3, answer.size());
        assertEquals(2,answer.head.value);
        assertEquals(1,answer.head.next.value);
        assertEquals(3,answer.head.next.next.value);
    }
}