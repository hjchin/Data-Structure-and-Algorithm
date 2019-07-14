package com.company.chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_6Test {

    @Test
    public void test(){
        LinkedList list = new LinkedList();

        Node node2 = new Node();
        node2.value = 2;

        Node node1 = new Node();
        node1.value = 1;
        node1.next = node2;
        list.head = node1;

        assertFalse(Q2_6.checkPalindrome(list));
    }

    @Test
    public void test2(){
        LinkedList list = new LinkedList();

        Node node2 = new Node();
        node2.value = 2;

        Node node1 = new Node();
        node1.value = 2;
        node1.next = node2;
        list.head = node1;

        assertTrue(Q2_6.checkPalindrome(list));
    }

    @Test
    public void test3(){
        LinkedList list = new LinkedList();

        Node node3 = new Node();
        node3.value = 1;

        Node node2 = new Node();
        node2.value = 2;
        node2.next = node3;

        Node node1 = new Node();
        node1.value = 1;
        node1.next = node2;
        list.head = node1;

        assertTrue(Q2_6.checkPalindrome(list));
    }

    @Test
    public void test4(){
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

        assertFalse(Q2_6.checkPalindrome(list));
    }

    @Test
    public void test5(){
        LinkedList list = new LinkedList();

        Node node4 = new Node();
        node4.value = 1;

        Node node3 = new Node();
        node3.value = 2;
        node3.next = node4;

        Node node2 = new Node();
        node2.value = 2;
        node2.next = node3;

        Node node1 = new Node();
        node1.value = 1;
        node1.next = node2;
        list.head = node1;

        assertTrue(Q2_6.checkPalindrome(list));
    }
}