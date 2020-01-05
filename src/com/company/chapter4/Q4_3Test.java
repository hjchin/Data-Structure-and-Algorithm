package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;
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
        node.left = new TreeNode(1);
        ArrayList<LinkedList<TreeNode>> list = Q4_3.createLinkedList(node);
        assertEquals(2,list.size());
    }

    @Test
    public void test2(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        ArrayList<LinkedList<TreeNode>> list = Q4_3.createLinkedList(node);
        assertEquals(2,list.size());
    }

    @Test
    public void test3(){
        TreeNode node = new TreeNode(0);
        TreeNode leftNode = new TreeNode(1);
        leftNode.left = new TreeNode(3);
        leftNode.right = new TreeNode(4);
        node.left = leftNode;
        TreeNode rightNode = new TreeNode(2);
        rightNode.left = new TreeNode(8);
        node.right = rightNode;
        ArrayList<LinkedList<TreeNode>> list = Q4_3.createLinkedList(node);
        assertEquals(3,list.size());
    }

    @Test
    public void test4(){
        TreeNode node = new TreeNode(0);
        TreeNode leftNode = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        node3.left = new TreeNode(5);
        node3.right = new TreeNode(6);
        leftNode.left = node3;
        leftNode.right = new TreeNode(4);
        node.left = leftNode;
        TreeNode rightNode = new TreeNode(2);
        rightNode.left = new TreeNode(8);
        node.right = rightNode;
        ArrayList<LinkedList<TreeNode>> list = Q4_3.createLinkedList(node);
        assertEquals(4,list.size());
    }

    @Test
    public void test5(){
        TreeNode node = new TreeNode(0);
        TreeNode leftNode = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        node5.left = new TreeNode(7);
        node3.left = node5;
        node3.right = new TreeNode(6);
        leftNode.left = node3;
        leftNode.right = new TreeNode(4);
        node.left = leftNode;
        TreeNode rightNode = new TreeNode(2);
        rightNode.left = new TreeNode(8);
        node.right = rightNode;
        ArrayList<LinkedList<TreeNode>> list = Q4_3.createLinkedList(node);
        assertEquals(5,list.size());
    }
}