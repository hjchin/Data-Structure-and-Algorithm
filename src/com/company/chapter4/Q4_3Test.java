package com.company.chapter4;

import org.junit.Test;


import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class Q4_3Test {

    @Test
    public void test(){
        TreeNode node = new TreeNode(0);
        ArrayList<LinkedList<TreeNode>> list = Q4_3.createLinkedList(node);
        assertEquals(1,list.size());
    }

    @Test
    public void test1(){
        TreeNode node = new TreeNode(0);
        node.leftNode = new TreeNode(1);
        ArrayList<LinkedList<TreeNode>> list = Q4_3.createLinkedList(node);
        assertEquals(2,list.size());
    }

    @Test
    public void test2(){
        TreeNode node = new TreeNode(0);
        node.leftNode = new TreeNode(1);
        node.rightNode = new TreeNode(2);
        ArrayList<LinkedList<TreeNode>> list = Q4_3.createLinkedList(node);
        assertEquals(2,list.size());
    }

    @Test
    public void test3(){
        TreeNode node = new TreeNode(0);
        TreeNode leftNode = new TreeNode(1);
        leftNode.leftNode = new TreeNode(3);
        leftNode.rightNode = new TreeNode(4);
        node.leftNode = leftNode;
        TreeNode rightNode = new TreeNode(2);
        rightNode.leftNode = new TreeNode(8);
        node.rightNode = rightNode;
        ArrayList<LinkedList<TreeNode>> list = Q4_3.createLinkedList(node);
        assertEquals(3,list.size());
    }

    @Test
    public void test4(){
        TreeNode node = new TreeNode(0);
        TreeNode leftNode = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        node3.leftNode = new TreeNode(5);
        node3.rightNode = new TreeNode(6);
        leftNode.leftNode = node3;
        leftNode.rightNode = new TreeNode(4);
        node.leftNode = leftNode;
        TreeNode rightNode = new TreeNode(2);
        rightNode.leftNode = new TreeNode(8);
        node.rightNode = rightNode;
        ArrayList<LinkedList<TreeNode>> list = Q4_3.createLinkedList(node);
        assertEquals(4,list.size());
    }

    @Test
    public void test5(){
        TreeNode node = new TreeNode(0);
        TreeNode leftNode = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        node5.leftNode = new TreeNode(7);
        node3.leftNode = node5;
        node3.rightNode = new TreeNode(6);
        leftNode.leftNode = node3;
        leftNode.rightNode = new TreeNode(4);
        node.leftNode = leftNode;
        TreeNode rightNode = new TreeNode(2);
        rightNode.leftNode = new TreeNode(8);
        node.rightNode = rightNode;
        ArrayList<LinkedList<TreeNode>> list = Q4_3.createLinkedList(node);
        assertEquals(5,list.size());
    }
}