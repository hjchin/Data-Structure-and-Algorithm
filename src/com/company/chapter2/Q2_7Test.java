package com.company.chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_7Test {

    @Test
    public void test(){

        LinkedList list1 = new LinkedList();
        Node ln1 = new Node();
        list1.head = ln1;

        LinkedList list2 = new LinkedList();
        Node ln2 = new Node();
        list2.head = ln2;

        assertFalse(Q2_7.isIntersect(list1, list2));
    }

    @Test
    public void test1(){
        LinkedList list1 = new LinkedList();
        Node ln1 = new Node();
        list1.head = ln1;

        LinkedList list2 = new LinkedList();
        Node ln2 = new Node();
        list2.head = ln1;

        assertTrue(Q2_7.isIntersect(list1, list2));
    }

    @Test
    public void test2(){
        LinkedList list1 = new LinkedList();
        Node ln12 = new Node();
        Node ln1 = new Node();
        ln1.next = ln12;
        list1.head = ln1;

        LinkedList list2 = new LinkedList();
        Node ln22 = new Node();
        Node ln2 = new Node();
        ln2.next = ln22;
        list2.head = ln2;

        assertFalse(Q2_7.isIntersect(list1, list2));
    }

    @Test
    public void test3(){
        LinkedList list1 = new LinkedList();
        Node ln13 = new Node();
        Node ln12 = new Node();
        Node ln1 = new Node();
        ln12.next = ln13;
        ln1.next = ln12;
        list1.head = ln1;

        LinkedList list2 = new LinkedList();
        Node ln22 = new Node();
        Node ln2 = new Node();
        ln22.next = ln13;
        ln2.next = ln22;
        list2.head = ln2;

        assertTrue(Q2_7.isIntersect(list1, list2));
    }
}