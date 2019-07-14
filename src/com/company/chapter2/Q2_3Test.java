package com.company.chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_3Test {

    @Test
    public void test(){
        LinkedList list = new LinkedList();
        Q2_3.deleteMiddle(list);
        assertEquals(0, list.size());
    }

    @Test
    public void test1(){
        LinkedList list = new LinkedList();

        Node node2 = new Node();
        node2.value = 2;

        Node node1 = new Node();
        node1.value = 1;
        node1.next = node2;

        list.head = node1;

        Q2_3.deleteMiddle(list);
        assertEquals(2, list.size());
    }

    @Test
    public void test2(){
        LinkedList list = new LinkedList();

        Node node3 = new Node();
        node3.value = 3;

        Node node2 = new Node();
        node2.value = 2;
        node2.next = node3;

        Node node1 = new Node();
        node1.value = 1;
        node1.next = node2;

        list.head = node1;

        Q2_3.deleteMiddle(list);
        assertEquals(2, list.size());
        assertEquals(1, list.head.value);
        assertEquals(3, list.head.next.value);
    }

    @Test
    public void test3(){
        LinkedList list = new LinkedList();

        Node node4 = new Node();
        node4.value = 4;

        Node node3 = new Node();
        node3.value = 3;
        node3.next = node4;

        Node node2 = new Node();
        node2.value = 2;
        node2.next = node3;

        Node node1 = new Node();
        node1.value = 1;
        node1.next = node2;

        list.head = node1;

        Q2_3.deleteMiddle(list);
        assertEquals(3, list.size());
        assertEquals(1, list.head.value);
        assertEquals(2, list.head.next.value);
        assertEquals(4, list.head.next.next.value);
    }
}