package com.company.chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_2Test {

    @Test
    public void test1(){

        com.company.chapter2.LinkedList list = new com.company.chapter2.LinkedList();

        try{
            Node node = Q2_2.getLastKthNode(list, 1);
        }catch (Exception ex){
            assertEquals("out of position exception","out of position exception");
        }
    }

    @Test
    public void test2(){

        com.company.chapter2.LinkedList list = new com.company.chapter2.LinkedList();
        Node head = new Node();
        head.value = 1;
        list.head = head;

        try{
            Node node = Q2_2.getLastKthNode(list, 1);
            assertEquals(1, node.value);
        }catch (Exception ex){
            assert false;
        }
    }

    @Test
    public void test3(){
        com.company.chapter2.LinkedList list = new com.company.chapter2.LinkedList();

        Node secondNode = new Node();
        secondNode.value = 2;

        Node firstNode = new Node();
        firstNode.value = 1;
        firstNode.next = secondNode;

        list.head = firstNode;

        try{
            Node node = Q2_2.getLastKthNode(list, 1);
            assertEquals(2, node.value);
        }catch (Exception ex){
            assert false;
        }
    }

    @Test
    public void test4(){
        com.company.chapter2.LinkedList list = new com.company.chapter2.LinkedList();

        Node node3 = new Node();
        node3.value = 3;

        Node node2 = new Node();
        node2.value = 2;
        node2.next = node3;

        Node node1 = new Node();
        node1.value = 1;
        node1.next = node2;

        list.head = node1;

        try{
            Node node = Q2_2.getLastKthNode(list, 3);
            assertEquals(1, node.value);
        }catch (Exception ex){
            assert false;
        }
    }
}