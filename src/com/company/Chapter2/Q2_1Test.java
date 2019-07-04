package com.company.Chapter2;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class Q2_1Test {

    @Test
    public void test(){

        LinkedList<Integer> input = new LinkedList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        LinkedList<Integer> list = Q2_1.removeDuplicate(input);

        assertEquals(list.size(),4);
    }

    @Test
    public void test2(){

        LinkedList<Integer> input = new LinkedList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(2);
        LinkedList<Integer> list = Q2_1.removeDuplicate(input);

        assertEquals(list.size(),3);
    }

    @Test
    public void test3(){

        LinkedList<Integer> input = new LinkedList<>();
        input.add(2);
        input.add(2);
        input.add(2);
        input.add(2);
        LinkedList<Integer> list = Q2_1.removeDuplicate(input);

        assertEquals(list.size(),1);
    }

    @Test
    public void testC1(){
        com.company.Chapter2.LinkedList list = new com.company.Chapter2.LinkedList();

        Node node4 = new Node();
        node4.value = 4;

        Node node3 = new Node();
        node3.value = 3;
        node3.next = node4;

        Node node2 = new Node();
        node2.value = 2;
        node2.next = node3;

        Node head = new Node();
        head.value = 1;
        head.next = node2;

        list.head = head;

        com.company.Chapter2.LinkedList result = Q2_1.removeDuplicate2(list);

        assertEquals(result.size(),4);
    }

    @Test
    public void testC2(){

        com.company.Chapter2.LinkedList list = new com.company.Chapter2.LinkedList();

        Node node4 = new Node();
        node4.value = 2;

        Node node3 = new Node();
        node3.value = 3;
        node3.next = node4;

        Node node2 = new Node();
        node2.value = 2;
        node2.next = node3;

        Node head = new Node();
        head.value = 1;
        head.next = node2;

        list.head = head;

        com.company.Chapter2.LinkedList result = Q2_1.removeDuplicate2(list);

        assertEquals(3, result.size());
    }

    @Test
    public void testC3(){

        com.company.Chapter2.LinkedList list = new com.company.Chapter2.LinkedList();

        Node node4 = new Node();
        node4.value = 2;

        Node node3 = new Node();
        node3.value = 2;
        node3.next = node4;

        Node node2 = new Node();
        node2.value = 2;
        node2.next = node3;

        Node head = new Node();
        head.value = 2;
        head.next = node2;

        list.head = head;

        com.company.Chapter2.LinkedList result = Q2_1.removeDuplicate2(list);

        assertEquals(1, result.size());
    }

    @Test
    public void testCC1(){
        com.company.Chapter2.LinkedList list = new com.company.Chapter2.LinkedList();

        Node node4 = new Node();
        node4.value = 4;

        Node node3 = new Node();
        node3.value = 3;
        node3.next = node4;

        Node node2 = new Node();
        node2.value = 2;
        node2.next = node3;

        Node head = new Node();
        head.value = 1;
        head.next = node2;

        list.head = head;

        com.company.Chapter2.LinkedList result = Q2_1.removeDuplicate3(list);

        assertEquals(result.size(),4);
    }


    @Test
    public void testCC2(){

        com.company.Chapter2.LinkedList list = new com.company.Chapter2.LinkedList();

        Node node4 = new Node();
        node4.value = 2;

        Node node3 = new Node();
        node3.value = 3;
        node3.next = node4;

        Node node2 = new Node();
        node2.value = 2;
        node2.next = node3;

        Node head = new Node();
        head.value = 1;
        head.next = node2;

        list.head = head;

        com.company.Chapter2.LinkedList result = Q2_1.removeDuplicate3(list);

        assertEquals(3, result.size());
    }

    @Test
    public void testCC3(){

        com.company.Chapter2.LinkedList list = new com.company.Chapter2.LinkedList();

        Node node4 = new Node();
        node4.value = 2;

        Node node3 = new Node();
        node3.value = 2;
        node3.next = node4;

        Node node2 = new Node();
        node2.value = 2;
        node2.next = node3;

        Node head = new Node();
        head.value = 2;
        head.next = node2;

        list.head = head;

        com.company.Chapter2.LinkedList result = Q2_1.removeDuplicate3(list);

        assertEquals(1, result.size());
    }
}