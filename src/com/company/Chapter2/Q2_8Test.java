package com.company.Chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_8Test {

    @Test
    public void test(){
        LinkedList list = new LinkedList();
        list.head = new Node();
        assertEquals(null, Q2_8.detectLoopNode(list));
    }

    @Test
    public void test1(){
        LinkedList list = new LinkedList();

        Node n4 = new Node();
        Node n3 = new Node();
        Node n2 = new Node();
        Node n1 = new Node();
        n4.next = n2;
        n3.next = n4;
        n2.next = n3;
        n1.next = n2;
        list.head = n1;

        assertEquals(n2.hashCode(), Q2_8.detectLoopNode(list).hashCode());
    }

    @Test
    public void test2(){
        LinkedList list = new LinkedList();

        Node n5 = new Node();
        Node n4 = new Node();
        Node n3 = new Node();
        Node n2 = new Node();
        Node n1 = new Node();
        n4.next = n5;
        n3.next = n4;
        n2.next = n3;
        n1.next = n2;
        list.head = n1;

        assertEquals(null, Q2_8.detectLoopNode(list));
    }
}