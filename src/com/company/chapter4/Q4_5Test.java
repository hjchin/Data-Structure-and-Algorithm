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
        node.left = new TreeNode(8);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test4(){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(8);
        assertFalse(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test5(){
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(8);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test6(){
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(8);
        node.right = new TreeNode(80);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test7(){
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(10);
        node.right = new TreeNode(80);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test8(){
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(4);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(5);
        node.left.left.left = new TreeNode(1);
        node.left.left.right = new TreeNode(3);
        node.left.right.right = new TreeNode(7);
        node.left.right.right.left = new TreeNode(6);
        node.left.right.right.right = new TreeNode(9);
        node.right = new TreeNode(20);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test9(){
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(4);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(5);
        node.left.left.left = new TreeNode(1);
        node.left.left.right = new TreeNode(3);
        node.left.right.right = new TreeNode(7);
        node.left.right.right.left = new TreeNode(6);
        node.left.right.right.right = new TreeNode(9);
        assertTrue(Q4_5.checkBinaryTree(node));
    }

    @Test
    public void test10(){
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(4);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(5);
        node.left.left.left = new TreeNode(1);
        node.left.left.right = new TreeNode(3);
        node.left.right.right = new TreeNode(7);
        node.left.right.right.left = new TreeNode(10);
        node.left.right.right.right = new TreeNode(9);
        node.right = new TreeNode(20);
        assertFalse(Q4_5.checkBinaryTree(node));
    }
}