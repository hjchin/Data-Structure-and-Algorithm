package com.company.chapter4;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q4_5Test {

    @Test
    public void test1(){
         assertFalse(Q4_5.checkBinaryTree(null));
    }

    @Test
    public void test2(){
        TreeNode node = new TreeNode(0);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test3(){
        TreeNode node = new TreeNode(10);
        node.leftNode = new TreeNode(8);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test4(){
        TreeNode node = new TreeNode(1);
        node.leftNode = new TreeNode(8);
        assertFalse(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test5(){
        TreeNode node = new TreeNode(1);
        node.rightNode = new TreeNode(8);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test6(){
        TreeNode node = new TreeNode(10);
        node.leftNode = new TreeNode(8);
        node.rightNode = new TreeNode(80);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test7(){
        TreeNode node = new TreeNode(10);
        node.leftNode = new TreeNode(10);
        node.rightNode = new TreeNode(80);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test8(){
        TreeNode node = new TreeNode(10);
        node.leftNode = new TreeNode(4);
        node.leftNode.leftNode = new TreeNode(2);
        node.leftNode.rightNode = new TreeNode(5);
        node.leftNode.leftNode.leftNode = new TreeNode(1);
        node.leftNode.leftNode.rightNode = new TreeNode(3);
        node.leftNode.rightNode.rightNode = new TreeNode(7);
        node.leftNode.rightNode.rightNode.leftNode = new TreeNode(6);
        node.leftNode.rightNode.rightNode.rightNode = new TreeNode(9);
        node.rightNode = new TreeNode(20);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test9(){
        TreeNode node = new TreeNode(10);
        node.leftNode = new TreeNode(4);
        node.leftNode.leftNode = new TreeNode(2);
        node.leftNode.rightNode = new TreeNode(5);
        node.leftNode.leftNode.leftNode = new TreeNode(1);
        node.leftNode.leftNode.rightNode = new TreeNode(3);
        node.leftNode.rightNode.rightNode = new TreeNode(7);
        node.leftNode.rightNode.rightNode.leftNode = new TreeNode(6);
        node.leftNode.rightNode.rightNode.rightNode = new TreeNode(9);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test10(){
        TreeNode node = new TreeNode(10);
        node.leftNode = new TreeNode(4);
        node.leftNode.leftNode = new TreeNode(2);
        node.leftNode.rightNode = new TreeNode(5);
        node.leftNode.leftNode.leftNode = new TreeNode(1);
        node.leftNode.leftNode.rightNode = new TreeNode(3);
        node.leftNode.rightNode.rightNode = new TreeNode(7);
        node.leftNode.rightNode.rightNode.leftNode = new TreeNode(10);
        node.leftNode.rightNode.rightNode.rightNode = new TreeNode(9);
        node.rightNode = new TreeNode(20);
        assertFalse(Q4_5.checkBinaryTree(node));
    }
}